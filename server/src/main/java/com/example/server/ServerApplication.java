package com.example.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);

		// for findbugs
		String msg = "hello";
		switch(msg) {
			case "hello": ;
			case "good": ;
		}
	}
}
