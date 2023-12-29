package com.tekiwll.lectia38;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lectia38Application implements CommandLineRunner {

	@Autowired  // Dependency Injection
	InventoryService inventoryService;


	public static void main(String[] args) {
		SpringApplication.run(Lectia38Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		inventoryService.addProduct("Iphone");
		inventoryService.addProduct("Samsung");

		System.out.println(inventoryService.getProducts());

	}
}
