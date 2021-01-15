package com.bnpp.kata;

public class BasicFizzBuzzGame {
	public String getFizzBuzzScore(int i) {
		String returnScore = null;
		if (i % 3 == 0) {
			returnScore = "fizz";
		} else {
			returnScore = Integer.toString(i);
		}
		return returnScore;
	}
}