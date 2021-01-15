package com.bnpp.kata;

import java.util.Scanner;

public class BasicFizzBuzzGameMain {
	public static void main(String args[]) {
		BasicFizzBuzzGame basicFizzBuzzGame = new BasicFizzBuzzGame();
		Scanner gameInput = new Scanner(System.in);
		System.out.println("Enter Fizz Buzz Game Input:");
		String gameScore = basicFizzBuzzGame.getFizzBuzzScore(gameInput.nextInt());
		System.out.println("Score is: " + gameScore);
		gameInput.close();
	}
}