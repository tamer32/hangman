package com.hangman.demo.model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class HangmanDaoImpl implements HangmanDao {
	
	private	List<String> words = Arrays.asList("Jaba","Gosho","Gojou");
	private Random rnd;
	@Override
	public String getRandomWord() {
		rnd = new Random();
		return words.get(rnd.nextInt(3));
	}
	
	
	

}
