package com.jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:jokes-config.xml")
public class JokeappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac = SpringApplication.run(JokeappApplication.class, args);
		String str = (String) cac.getBean("string");
		System.out.println(str);
	}

}
