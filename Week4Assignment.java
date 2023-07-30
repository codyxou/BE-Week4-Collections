package assignment;

import java.util.Arrays;

public class Week4Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
				int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
//			a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your 				code). Print the result to the console.  
				
				System.out.println("To accomplish this, I declare the 0 index for the first element and do ages.length - 1 to get the last element. 3 - 93 = -93");
				
				System.out.println(ages[0] - ages[ages.length-1]);
				System.out.println("-------------------------------------------------");
					
//			b. Create a new array with 9 elements (one more than the ages array)  Repeat the step above to ensure it is dynamic (works for arrays of different lengths).
				
				System.out.println("Declare new int array newAges");
				int[] newAges = {4, 10, 24, 64, 2, 8, 28, 94, 26};
				
				System.out.println("4 - 26 = -22");
				System.out.println(newAges[0] - newAges[newAges.length-1]);
				System.out.println("-------------------------------------------------");
		
//			c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
				
//				Declaring variable sum as an int to store the sum of all the elements in the array
				int sum = 0; 
				
//				For loop to print each element in the array in order to make changes
				for (int i = 0; i < newAges.length; i++) {
					sum += newAges[i];
					
				}
				
				System.out.println("The sum of all the elements in the array is " + sum);
				System.out.println("The average is " + sum/newAges.length);
				System.out.println("-------------------------------------------------");
				
//		2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
				
				String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
				
				//declaring int variable namesSum to store sum of elements
				int namesSum = 0;
				
				//declaring int average to store average 
				int average = 0;
//				a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
				
				//creating a loop to iterate through the array and printing to the console the length of each element
				for (int i = 0; i < names.length; i++) {
					System.out.println(names[i].length());
					//getting the sum of each element and storing to namesSum
					namesSum+=names[i].length();
					//dividing namesSum by the length of the array to get average 
					average = (namesSum/names.length);
				}
				
				//calculate average
				System.out.println("The average of the names array is " + average);
				System.out.println("-------------------------------------------------");
				
				
//				b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
				
				//declare empty string to save results of concatenation.
				String concatStr = "";
				for (int i = 0; i < names.length; i++) {
					
					System.out.print(concatStr + " " + names[i]);
					
				}
				System.out.println("\n-------------------------------------------------");
				
		System.out.println("3. How do you access the last element of any array?");
		System.out.println("Accessing the last element of the array requires you to take the length of the variable and subtract 1. ex: names[names.length-1]");
		System.out.println("-------------------------------------------------");
				
		System.out.println("4. How do you access the first element of any array?");
		System.out.println("Accessing the first element of any array requires you to set to index 0. ex: names[0]");
		System.out.println("-------------------------------------------------");
				
//		5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the 			nameLengths array.
		int[] nameLengths = new int[6];
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			
		}
		
		//print names array with Arrays.toString method
		System.out.println("nameLengths Array");
		System.out.println(Arrays.toString(nameLengths));
		System.out.println("-------------------------------------------------");
		
//		6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		
		//same process as 2a above, but only doing the sum and not average
			//declaring sum variable
			int nameLengthSum = 0;
			
			//loop to iterate through array and create the logic to add each iteration to nameLengthSum
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengthSum+=nameLengths[i];
		}
		System.out.println("The sum of nameLengths is: " + nameLengthSum);
		System.out.println("-------------------------------------------------");
		
		
				
//		7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in 			“Hello” and 3, I expect the method to return “HelloHelloHello”).
		
		//method is declared outside of the main class.
		// 7. results
		System.out.println("Multiword Result: " + multiWord("soccer", 4));
		System.out.println("-------------------------------------------------");
		
				
//		8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a 				String separated by a space).
		
		//8. results 
		System.out.println("Full Name Result: " + fullNameIs("Cody", "Xoumanivong"));
		System.out.println("-------------------------------------------------");
				
//		9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		//declaring 2 arrays to compare with the boolean method 
		int[] arr1 = {45, 55, 85}; //expecting true
		int[] arr2 = {20, 30, 10}; //expecting false 
		System.out.println("Array 1 is 185. since the array is larger than 100 the result is " + intArray(arr1));
		System.out.println("Array 2 is 60. since the array is less than 100 the result is " + intArray(arr2));
		System.out.println("-------------------------------------------------");
				
//		10. Write a method that takes an array of double and returns the average of all the elements in the array.
		
		double[]dubArr1 = {25,75,85,11}; //Average is 49.0
		
		System.out.println("The average of dubArr1 is " + dubArray(dubArr1));
		System.out.println("-------------------------------------------------");

		
				
//		11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the 			elements in the second array.
		
		//this set will show true since array1 is larger than array2.
		double[] array1 = {52,65,35,42};
		double[] array2 = {11,16,18,24};
		System.out.println(twoArraysAvg(array1, array2));
		System.out.println("-------------------------------------------------");
		
		//this set will show false since array2 is larger than array1
//		double[] array1 = {11,16,18,24};
//		double[] array2 = {52,65,35,42};
//		System.out.println(twoArraysAvg(array1, array2));
//		System.out.println("-------------------------------------------------");
		
		
				
//		12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if 			moneyInPocket is greater than 10.50.
		
		willBuyDrink(true, 12.24); // satisfies conditions to buy a drink
		willBuyDrink(false, 12.50); // only satisfies the moneyInPocket condition, so triggers 2nd message
		willBuyDrink(true, 10.40); // only satisfies isHotOutside condition, triggers 2nd message
		System.out.println("-------------------------------------------------");
		
			
				
//		13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		
		daysOfTheMonth("December"); //31
		daysOfTheMonth("September"); //30
		daysOfTheMonth("February"); //28
		daysOfTheMonth("notamonth"); //not a month message

	}
	
	//Method for 7. result is declared as an empty string and added to the declared paramater str. return has to be used since I have declared it's a String Method
		public static String multiWord(String str, int num) {
			String result = "";
			for (int i = 0; i < num; i++) {
				result += str;
			}
			return result;
			
		}
		
	//Method for 8. I created a variable fullName to concatenate my chosen parameters firstName and lastName with a space. We then return fullName.
		public static String fullNameIs(String firstName, String lastName) {
				String fullName = firstName + " " + lastName;
				return fullName;
		}
		
	//Method for 9. Declared a boolean method named intArray and used a for each loop to add the variable sum to each number in the parameter array. 
		public static boolean intArray(int[] numberArray) {
			int sum = 0;
			for (int num : numberArray) {
				sum += num;
			}
		       if (sum > 100) {
		          return true;
		        } else {
		            return false;
		        }
		}
		
	//Method for 10. I declared a sum and average variable both in type double. Created a for each loop like in 9 to sum all the numbers in the array and divide by the length of the array
		public static double dubArray(double[] doubleArray) {
			double sum = 0; 
			double average = 0;
			for (double num : doubleArray) {
				sum+= num;
				average = (sum/doubleArray.length);
			}
			return average;
		}
		
	//Method for 11. The best way I could think of doing this is to create two sets of variables to store sum and average for each array then use an if statement to compare the two for the boolean result. 
		public static boolean twoArraysAvg(double[] arr1, double[] arr2) {
			double sum1 = 0; 
			double sum2 = 0;
			double avg1 = 0;
			double avg2 = 0;
			
			for(double num1 : arr1) {
				sum1+= num1;
				avg1 = (sum1/arr1.length);
			}
			
			System.out.println("The average of arr1 is " + avg1);
			
			for(double num2 : arr2) {
				sum2+= num2;
				avg2 = (sum2/arr2.length);
			}
			
			System.out.println("The average of arr2 is " + avg2);
			
			if(avg1 > avg2) {
				return true;
			} else {
				return false;
			}
		}
		
	//Method for 12. Created a method that takes a boolean and a double parameter
		
		public static void willBuyDrink (boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside && moneyInPocket> 10.50) {
				System.out.println("It is hot outside and I have enough for a cool drink.");
			} else {
				System.out.println("I either don't have enough money or it's not hot enough outside for a cool drink");
			}
		}
		
//Method for 13. I created a javascript function in front end that would log out how many days there are in a specified month. Now it's time to do it in Java!
		//I created a switch statement that takes a string as a parameter and returns a statement with how many days with the given month
		
		public static void daysOfTheMonth (String month) {
			
		    switch (month){
	        
	        case "April":
	        case "June":
	        case "September":
	        case "November":
	        	System.out.println("There are 30 days in " + month);
	            break;
	        case "January":
	        case "March":
	        case "May":
	        case "July":
	        case "August":
	        case "October":
	        case "December":
	            System.out.println("There are 31 days in " + month);
	            break;
	        case "February":
	        	System.out.println("There are 28 days in " + month);
	            break;

	            default:
	            	System.out.println("That is not a real month!");
	    } 
	        
		}
	
	



}
