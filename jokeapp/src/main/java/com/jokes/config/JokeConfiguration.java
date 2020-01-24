package com.jokes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class JokeConfiguration {

	@Bean
	public ChuckNorrisQuotes quotes() {
		return new ChuckNorrisQuotes();
	}
}
