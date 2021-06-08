package com.hangman.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hangman.demo.model.HangmanDao;

@Component
public class HangamServiceImpl implements HangmanService {
	
	@Autowired
	HangmanDao dao;

	@Override
	public String getRandomWord() {
		return dao.getRandomWord();
	}

	
	
}
