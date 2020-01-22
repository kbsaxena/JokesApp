package com.jokes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jokes.services.JokeService;

@Controller
public class JokesController {
	
	private JokeService jokeService;
	
    @Autowired
	public void setJokeService(JokeService jokeService) {
		this.jokeService = jokeService;
	}


	@RequestMapping({"/",""})
	public String getJokes(Model model) {
		model.addAttribute("joke", jokeService.getJoke());
		return "jokesPage";
	}
}
