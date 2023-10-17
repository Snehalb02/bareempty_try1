package com.example.Tryme1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tryme1Application {

	public static void main(String[] args) {
		SpringApplication.run(Tryme1Application.class, args);
	}

}

// a changed added : no conflict after the main

// master : no conflict after merge

// A local change: it will conflict with the remote change