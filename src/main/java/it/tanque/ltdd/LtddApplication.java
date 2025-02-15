package it.tanque.ltdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LtddApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(LtddApplication.class, args);
		System.out.println("LtddApplication started");
	}
}
