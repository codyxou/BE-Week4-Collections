package assignment;

public class Week4Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
				int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
//			a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your 				code). Print the result to the console.  
				
				System.out.println("To accomplish this, I declare the 0 index for the first element and do ages.length - 1 to get the last element. 3 - 93 = -93");
				
				System.out.println(ages[0] - ages[ages.length-1]);
					
//			b. Create a new array with 9 elements (one more than the ages array)  Repeat the step above to ensure it is dynamic (works for arrays of different lengths).
				
				System.out.println("Declare new int array newAges");
				int[] newAges = {4, 10, 24, 64, 2, 8, 28, 94, 26};
				
				System.out.println("4 - 26 = -22");
				System.out.println(newAges[0] - newAges[newAges.length-1]);
		
//			c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
				
//				Declaring variable sum as an int to store the sum of all the elements in the array
				int sum = 0; 
				
//				For loop to print each element in the array in order to make changes
				for (int i = 0; i < newAges.length; i++) {
					sum += newAges[i];
					
				}
				
				System.out.println("The sum of all the elements in the array is " + sum);
				System.out.println("The average is " + sum/newAges.length);
				
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
				
				
//				b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
				
		System.out.println("3. How do you access the last element of any array?");
		System.out.println("Accessing the last element of the array requires you to take the length of the variable and subtract 1. ex: names[names.length-1]");
				
		System.out.println("4. How do you access the first element of any array?");
		System.out.println("Accessing the first element of any array requires you to set to index 0. ex: names[0]");
				
//		5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the 			nameLengths array.
				
//		6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
				
//		7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in 			“Hello” and 3, I expect the method to return “HelloHelloHello”).
				
//		8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a 				String separated by a space).
				
//		9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
				
//		10. Write a method that takes an array of double and returns the average of all the elements in the array.
				
//		11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the 			elements in the second array.
				
//		12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if 			moneyInPocket is greater than 10.50.
				
//		13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

	}
	



}
