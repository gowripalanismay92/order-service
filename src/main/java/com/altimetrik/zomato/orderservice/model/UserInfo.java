package com.altimetrik.zomato.orderservice.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
//@Entity
//@Table(name="user")
public class UserInfo {
	
    @Id
    private String userId;

    private String firstName;
    private String lastName;
    private String phone;
}
