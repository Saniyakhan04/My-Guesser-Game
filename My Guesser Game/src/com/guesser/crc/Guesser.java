package com.guesser.crc;
import java.util.Scanner;

public class Guesser {
	int GuesserNum;
	public int GuessNum() {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Guesser Guess your number");
		GuesserNum= scan.nextInt();
		return GuesserNum;
		
	}	
}
