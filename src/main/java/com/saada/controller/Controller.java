/**
 * 
 */
package com.saada.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saada.bean.User;

/**
 * @author sadanand chavan
 *
 * Apr 17, 2020 12:58:11 PM
 */
@RestController
@RequestMapping("/sbws")
public class Controller {

	String appStatus="Application is running.";
	
	@GetMapping("/appstatus")
	public String getAppName(){
		System.out.println("Application is running...");
		return appStatus;
	}
	
	@GetMapping("/getuser")
	public User getUser(){
		User user= new User();
		user.setUserId(new Long(100));
		user.setFirstName("Rajnikant");
		user.setEmailAddress("Rajnikant@rajnikanat.com");
		return user;
	}
}
//http://localhost:8080/appstatus