package com.packagename.StringMethods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StringsMethodsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsMethodsApplication.class, args);
		MethodsOfString s=new MethodsOfString();
		s.charat();
	}

}
