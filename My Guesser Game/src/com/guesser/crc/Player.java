package com.guesser.crc;
import java.util.Scanner;
public class Player {
int PlayerNum;
	
	public int GuessNum() {
		Scanner scan = new Scanner(System.in) ;
	
		PlayerNum= scan.nextInt();
		return PlayerNum;
		
	}

}
