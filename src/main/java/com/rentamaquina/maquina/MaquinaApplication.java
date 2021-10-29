package com.rentamaquina.maquina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages ={"com.rentamaquina.maquinaria.app.entities" })
@SpringBootApplication
public class MaquinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaquinaApplication.class, args);
	}

}
