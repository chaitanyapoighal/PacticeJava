package com.anudip.adv;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

	public static void main(String[] args) {
		
		System.out.println("Enter a number below 100:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		Random random=new Random();
		int target=random.nextInt(100);
		
		while(number!=target) {
			if(number>target) {
				System.out.println("number is greater than Target num,enter again");
				number=sc.nextInt();
			}
			else if(number<target) {
				System.out.println("number is lower than Target num,enter again");
				number=sc.nextInt();
			}
			
		}
		
		System.out.println("Congratulations u have guessed the correct number");
		
		sc.close();
	}

}
