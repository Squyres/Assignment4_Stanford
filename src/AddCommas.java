/*
 * AddCommas.Java
 * By: Jameson Squyres
 * This program will add commas to a number to make it easier to read.
 */

import java.util.*;

public class AddCommas {
	
	private static Scanner scan = new Scanner(System.in);	// Scanner for user input
	
	public static void main(String[] args) {
		
		while(true) {	// Always ask the user for a number, then pass the number to the addCommas method
			System.out.print("Enter a number: ");
			String regNumber = scan.nextLine();
			System.out.println(addCommasToNumericString(regNumber));
		}
	}
	private static String addCommasToNumericString(String digits) {
		int commaIndex = digits.length() % 3;	// Get the first position for the comma
		if(commaIndex == 0) {
			commaIndex = 3;	// If the first position is zero, set it to 3
		}
		int lastIndex = digits.length();
		while(commaIndex < lastIndex && digits.length() > 3) {	// Run while the commaIndex is less than the length of the string and is longer than 3
			String firstHalf = digits.substring(0, commaIndex);	// Copy the string into two halves, splitting at commaIndex
			String lastHalf = digits.substring(commaIndex);
			digits = firstHalf + "," + lastHalf;	// Add the comma
			lastIndex++;	// Increase lastIndex because a comma was added
			commaIndex += 4;	// Increase commaIndex by 4 for the position of the next comma
		}
		return digits;
	}
}