package com.tt.assingment3;

public class classExample {

	public static void main(String[] args) {
			
			//If Else Statement

			int age = 110;
			
			if (age < 13) {
				System.out.println("you are children");
			} else if (age > 13 && age < 18) {
				System.out.println("you are teennager");
			} else if (age > 60) {
				// Nested If Else Statement 
				if (age >100) {
					System.out.println("you are Hero");
				} else {
					System.out.println("you are Senior");
				}
			} else {
				System.out.println("you are Adult");
					
			}
	}
	
}




