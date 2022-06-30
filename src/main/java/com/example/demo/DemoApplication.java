package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		AsignaturasRepository repository = context.getBean(AsignaturasRepository.class);

		System.out.println("Antes de la insercion" + repository.findAll());

		Asignaturas lengua = new Asignaturas(null, "lengua", 3, 43);
		repository.save(lengua);

		Asignaturas ia = new Asignaturas(null, "inteligencia artificial", 12, 23);
		repository.save(ia);

		System.out.println("despues de la insercion" + repository.findAll());
	}

}
