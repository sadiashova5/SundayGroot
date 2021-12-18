package com.tt.assingment3;

/* Problem 2.	Write a java program which will display 5 employee information (name, age, salary and address). */

public class assingment3_2 {                                                    // for index it'll start from 0
	
	public static void main(String[] args) {
		
		assingment3_2[] obj=new assingment3_2[5];                               // class name [] obj = new class name []
		obj[0]=new assingment3_2("Shohid",37,190000,"Flushing");
		obj[1]=new assingment3_2("Rasel",26,170000,"New Jersey");
		obj[2]=new assingment3_2("Juel",33,100000,"Jamaica");
		obj[3]=new assingment3_2("Jahangir",28,160000,"Jackson Heights");
		obj[4]=new assingment3_2("Zain",5,150000,"Jamaica");
	}

	static int count =(0);
	assingment3_2(String name,int age,int salary,String address){
		System.out.println("Employee Number: "+count);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Age: "+age);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Employee Address: "+address);
		count++;
		System.out.println(" ");
	}

}
