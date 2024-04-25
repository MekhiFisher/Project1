package codingProject1;

public class CodingProject1 {

	public static void main(String[] args) {
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int subtract = ages[0] - ages[ages.length - 1];
		System.out.println(subtract);
		// In these two examples here, the way the code is written it will always take the first value and the last value, regardless of what their value is.
		// You can see that the two arrays are different lengths but the code is the same. By using index 0 I will always get the first value of an array.
		// and by using array.length - 1 I will always get the the last index no matter the length of the list.
		int[] ages2 = {12, 23, 21, 8, 54, 18, 19, 34, 87, 73, 33};
		int subtract2 = ages2[0] - ages2[ages.length - 1];
		System.out.println(subtract2);
		
		// Here I made two int variables to hold the sum of the numbers and the for loop will feed all the ages found in ages2 into the sum variable.
		// Then outside of the loop we simply take the sum and the length of the array, once again allowing it to be flexible, and divide them and put the result
		// into the averageAge variable.
		int sum = 0;
		int averageAge = 0;
		for (int age : ages2) {
			sum += age;
			
		}
		// I am basically doing the same thing as we just did with the ages. But instead the variables need to be int.
		// We also need to use .length() since we are dealing with a String
		averageAge += sum /ages2.length;
		System.out.println(averageAge);
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int totalLength = 0;
		int averageNameLength = 0;
		for (String name : names) {
			totalLength += name.length();
		}
		averageNameLength += totalLength / names.length;
		System.out.println(averageNameLength);
		
		// I made an empty String variable so I can use it in my loop and fill it up with the names from the Array.
		String combinedNames = "";
		for (String name : names) {
			combinedNames += name + " ";
		}
		System.out.println(combinedNames);
		
		
		
		// Question 3: Use arrayName[arrayName.length - 1]; The  - 1 is important or else you will get an error
		// Question 4: Use arrayName[0] 0 is always the starting index of any array

		
		
		// Here I made a normal for loop. The reason I did this was so I can use the i value. When adding something to an array you need to use an index.
		// So by using that normal for loop, each loop will increase the value of i by one allowing me to add all of the name lengths in one line.
		int[] nameLengths = new int[names.length];
		int nameLengthsSum = 0;
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		for (int nameLength : nameLengths) {
			nameLengthsSum += nameLength;
		}
		double[] da1 = {1.0, 2.0, 3.0, 4.0, 5.0};
		double[] da2 = {10.0, 11.0, 12.0, 3.0, 1.0};
		System.out.println(nameLengthsSum);
		System.out.println(whichArrayIsLarger(da1, da2));
		System.out.println(useExponents(5, 2));
	}
	
	// Here I have a method. As we can see we will be returning a string and the method will be looking for a String and an Int.
	// I have an empty variable combineString to hold the String when it gets combined.
	public static String multiplyWord(String str, int num) {
		String combinedString = "";
		for (int i = 0; i < num; i++) {
			combinedString += str;
		}
		return combinedString;
	}
	// Once again this method will be returning a String and it will be taking two strings.
	public static String makeFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	// This time the method is returning a boolean and is taking an int Array.
	public static boolean areAllIntsLargerThan100(int[] intArray) {
		int sum = 0;
		for (int num : intArray) {
			sum += num;
			if (sum > 100) {
				return true;
			}
			}
		return false;
		}
	// This method is returning a double and taking a double Array.
	public static double getAverageOfArray(double[] doubleArray) {
		double doubleSum = 0;
		double doubleAverage = 0;
		for (double num : doubleArray) {
			doubleSum += num;
		}
		doubleAverage += doubleSum / doubleArray.length;
		return doubleAverage;
		
	}
	
	public static boolean whichArrayIsLarger(double[] da1, double[] da2) {
		double sum1 = 0;
		double sum2 = 0;
		double average1 = 0;
		double average2 = 0;
		for (double num : da1) {
			for (double num1 : da2) {
				sum1 += num;
				sum2 += num1;
			}
		}
		average1 += sum1 / da1.length;
		average2 += sum2 /da2.length;
		if (average1 > average2) {
			return true;
		}
		return false;
	}
	//Utilizing the && i can right this entire method in a few lines of code.
	public static boolean willBuyDrink(boolean isHotOutSide, double moneyInPocket) {
		if (isHotOutSide == true && moneyInPocket > 10.50) {
			return true;
		}
		return false;
	}
	// I made this method to be able to simply calculate the result of a number with an exponent. Its a simple set of code but it can be useful. 
	// I wanted to do this because I haven't messed around with Math functions at all. So this gave me an opportunity to learn about them a little bit
	// This code is just taking the first number which is your base and the second number is the power. It will return a double back to you.
	public static double useExponents(int number, int exponent) {
		double result = Math.pow(number, exponent);
		return result;
		
		
	}
	
	
	}

