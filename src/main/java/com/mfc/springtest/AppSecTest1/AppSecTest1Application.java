package com.mfc.springtest.AppSecTest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping( "/spring-boot")
@RestController
public class AppSecTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(AppSecTest1Application.class, args);
	}
	
	@GetMapping("/apptest")
	public String firstApp(@RequestParam(value = "name", defaultValue = "PTP Team") String name) {
		if (name.equals("no"))
		{
			return String.format("You are input incorrectly");
		} else {
			return String.format("This is a testing from  %s used for Application Security test!!", name);
		}
 }

}
