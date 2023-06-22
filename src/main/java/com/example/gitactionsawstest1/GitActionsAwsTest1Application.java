package com.example.gitactionsawstest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class GitActionsAwsTest1Application {

//	void f() {
//
//	}
//
//	int f(int a) {
//		return 0;
//	}


	@GetMapping()
	@ResponseBody
	String f() {
		return "eeeeeee2222";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitActionsAwsTest1Application.class, args);
	}

}
