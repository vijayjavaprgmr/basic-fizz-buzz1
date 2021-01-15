package com.bnpp.kata;

public class BasicFizzBuzzGame {
	public String getFizzBuzzScore(int i) {
		String returnScore = null;
		if (i % 15 == 0) {
			returnScore = "fizz buzz";
		} else if (i % 3 == 0) {
			returnScore = "fizz";
		} else if (i % 5 == 0) {
			returnScore = "buzz";
		} else {
			returnScore = Integer.toString(i);
		}
		return returnScore;
	}
}