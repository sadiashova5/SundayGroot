package com.tt.assingment5;

public class assingment5_2 {

	/*2.	Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
For numbers which are multiples of both three and five return 'FizzBuzz'.
For numbers that are neither, return the input number.*/


public static void main(String[] args) {
	for (int i=1;i<=15;i++)
		if (i%3==0&&i%5==0){				// % meaning ?? why put 0
			System.out.println(i + " FizzBuzz "); // can we take out ln to print cross??
		}else if (i%3==0){
			System.out.println(i + " Fizz ");
		}else if (i%5==0){
			System.out.println(i + " Buzz ");
		}
}
}

