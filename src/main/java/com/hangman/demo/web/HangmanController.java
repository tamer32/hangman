package com.hangman.demo.web;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hangman.demo.service.HangmanService;

@Controller
public class HangmanController {
	@Autowired
	private HangmanService service;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String homePage(Model model) {
		//some stuff
		return "index.html";
	}
	
	@RequestMapping(value = "/game",method = RequestMethod.POST)
	public String createGame(Model model) {
		model.addAttribute("word",service.getRandomWord());
		return "hangman.html";
	}
	
}
