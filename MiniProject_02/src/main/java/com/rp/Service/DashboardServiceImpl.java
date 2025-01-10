package com.rp.Service;

import java.util.Random;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rp.Binding.Quote;

@Service
public class DashboardServiceImpl implements DashboardService {
	
	private String quoteUrl = "https://type.fit/api/quotes";
	private Quote[] quote = new Quote[1];

	@Override
	public String getQuote() {
		
		if(quote == null) {
			RestTemplate rt = new RestTemplate();
			ResponseEntity<String> forEntity = rt.getForEntity(quoteUrl, String.class);
			
			String body = forEntity.getBody();
			ObjectMapper mapper = new ObjectMapper();
			try {
				quote = mapper.readValue(body, Quote[].class);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		Random r = new Random();
		int nextInt = r.nextInt(quote.length);
	
		return quote[nextInt].getText();
	}

}
