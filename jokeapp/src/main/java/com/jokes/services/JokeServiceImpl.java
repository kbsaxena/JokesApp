package com.jokes.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService{

	private final ChuckNorrisQuotes quotes;
	
	public JokeServiceImpl(ChuckNorrisQuotes quotes) {
		this.quotes = quotes;
	}

	@Override
	public String getJoke() {
		return quotes.getRandomQuote();
	}

}
