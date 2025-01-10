package com.rp.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rp.Binding.LoginForm;
import com.rp.Binding.RegisterForm;
import com.rp.Binding.ResetPwdForm;
import com.rp.Entity.City;
import com.rp.Entity.Country;
import com.rp.Entity.State;
import com.rp.Entity.User;
import com.rp.Repo.CityRepo;
import com.rp.Repo.CountryRepo;
import com.rp.Repo.StateRepo;
import com.rp.Repo.UserRepo;
import com.rp.Util.EmailUtils;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private CountryRepo countryRepo;
	
	@Autowired
	private StateRepo stateRepo;
	
	@Autowired
	private CityRepo cityRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private EmailUtils emailUtils;

	@Override
	public Map<Integer, String> getCountries() {
		
		Map<Integer,String> countries = new HashMap<>();
		List<Country> findAll = countryRepo.findAll();
		findAll.forEach(c->{countries.put(c.getCountryId(),c.getCountryName());
			
		});
		
		return countries;
	}

	@Override
	public Map<Integer,String> getStates(Integer countryId) {
		Map<Integer,String> statesMap = new HashMap<>();
		List<State> stateList = stateRepo.getStatesBycountryId(countryId);
		stateList.forEach(s->{statesMap.put(s.getStateId(),s.getStateName());
		
		});
		return statesMap;
	}

	@Override
	public Map<Integer,String> getCities(Integer stateId) {
		Map<Integer,String> citiesMap = new HashMap<>();
		List<City> cityList = cityRepo.getCitiesByStateId(stateId);
		cityList.forEach(ci->{citiesMap.put(ci.getCityId(),ci.getCityName());
		
		});
		
		return citiesMap;
	}

	@Override
	public User getUser(String email) {
		
		return userRepo.findByEmail(email);
	}

	@Override
	public boolean saveUser(RegisterForm formObj) {
		formObj.setPwd(generateRandomPwd());
		formObj.setPwdUpdated("No");
		
		User userEntity = new User();
		BeanUtils.copyProperties(formObj, userEntity);
		userRepo.save(userEntity);
		
		String subject = "Your Account created: My World";
		String body = "Your Pwd:"+"http://localhost:5050/resetPwd:"+formObj.getPwd();
		return emailUtils.sendEmail(subject, body,formObj.getEmail());
	}
	
	private String generateRandomPwd() {
		String alphanumericCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuv";
		StringBuffer randomString = new StringBuffer(5);
		Random random = new Random();
		for(int i= 0; i<5; i++) {
			int randomIndex = random.nextInt(alphanumericCharacters.length() - 1);
			char randomChar = alphanumericCharacters.charAt(randomIndex);
			randomString.append(randomChar);
		}
		return randomString.toString();
	}

	@Override
	public User login(LoginForm formObj) {
		
		return userRepo.findByEmailAndPwd(formObj.getEmail(), formObj.getPwd());
	}

	@Override
	public boolean resetPwd(ResetPwdForm formObj) {
		Optional<User> findById= userRepo.findById(formObj.getUserId());
		
		if(findById.isPresent()) {
			User user = findById.get();
			user.setPwd(formObj.getNewPwd());
			user.setPwdUpdated("Yes");
			userRepo.save(user);
			return true;
		}
		return false;
	}

}
