/*
 * RemoveOccurrences.Java
 * By: Jameson Squyres
 * This program will add commas to a number to make it easier to read.
 */

import java.util.*;

public class RemoveOccurrences {
	
	private static Scanner scan = new Scanner(System.in);	// Scanner for user input
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.print("Enter a string: ");	// Ask for the string
			String regString = scan.nextLine();
			System.out.print("Enter a character to remove: ");	// Ask for the char
			char charToRemove = scan.nextLine().charAt(0);	// Get the char as the first letter of any string input
			System.out.println(removeAllOccurrences(regString, charToRemove));	// Call remove method
		}
	}
	public static String removeAllOccurrences(String str, char ch) {
		str = str.replaceAll(String.valueOf(ch), "");	// Replace all occurrences of the char in the string with nothing
		return str;	// Return the new string
	}
}