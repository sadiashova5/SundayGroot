
			
 //  Write a method which return count of duplicate value from a array?

		package com.tt.assingment4;
		import java.util.Scanner;
		public class assingment4_3 {

			
				//  Write a method to check leap year? 
				

		public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a year!");
		int year = Integer.valueOf(scanner.nextLine());   //why we need this one


		if (year % 4 == 0) {

		System.out.println("Leap year!");

		if (year % 100 != 0 && year % 400 == 0) {  // not equal 0 and why equal 00

		System.out.println("Leap year!");

		}
		} else {
		System.out.println("Not leap year!");
		}
		}
				
	}

