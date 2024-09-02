package com.guesser.scr;

import com.guesser.crc.Umpire;

public class MyGuesserGame {
	
	public static void main(String[] args) {
		System.out.println("----Start The Game----");
		
		Umpire U = new Umpire();
		U.collectNumFromGuesser();
		U.collectNumFromPlayers();
		U.compare();
		
		System.out.println("-----GAME OVER-----");

	}
}
