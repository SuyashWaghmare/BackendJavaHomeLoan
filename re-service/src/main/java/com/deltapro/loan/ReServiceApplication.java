package com.deltapro.loan;


import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReServiceApplication.class, args);

		System.out.println("Deltapro loan app...");
	}

	@Bean
	public ModelMapper mapper() {

		return new ModelMapper();
	}

}
