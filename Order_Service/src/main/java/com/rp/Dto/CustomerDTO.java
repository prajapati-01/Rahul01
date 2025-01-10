package com.rp.Dto;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CustomerDTO {

    private String name;
    private String email;
    private String phno;

    @CreationTimestamp
    @Column(name="date_created")
    private Date dateCreated;
    
    @UpdateTimestamp
    @Column(name="last_updated")
    private Date lastUpdated;
}
