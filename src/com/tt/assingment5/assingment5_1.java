package com.tt.assingment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class assingment5_1 {

	//	package com.tt.assingment1;

//import com.tt.assingment1.ArrayList;
//import com.tt.assingment1.List;

			
	// 1.	Write a method that returns the largest integer in the list. You can assume that the list has at least one element.

			// Method to find maximum in an unsorted list in Java
			public static Integer getMax(List<Integer> list)
			{
				// initialize `max` to some minimum value
				Integer max = Integer.MIN_VALUE;

				// loop through every list element and compare the maximum
				// found so far with the current value
				for (Integer i: list)
				{
					// update `max` if found to be less than the current element
					if (max < i) {
						max = i;
					}
				}

				return max;
			}

			public static void main (String[] args)
			{
				List<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 6, 5, 9, 1));
				System.out.println(getMax(list));
			}
		}
