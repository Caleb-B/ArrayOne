// **********************************************************************
// Programmer:	Caleb Beynon
// Class:		CS30S
//
// Assignment:	ArrayExercise 1 Q1-5
//
// Description:	a brief description of the program goes here
//
//
//	Input:		describe any input from keyboard or file
//
//  Output:		describe the result of your program
// ***********************************************************************

import javax.swing.*;
import java.text.DecimalFormat;

public class ArrayOne
{  // begin class
	
	final static int MAX = 10;
	
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
		int[] list;
		list = new int[MAX];
		int nums;
		int usernum;
		usernum = 0;
		int max;
		int min;
		int index;
		
	// ***** create objects *****
		
		ProgramInfo Printer = new ProgramInfo();
		
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		Printer.printBanner("ArrayExercise 1 Q1-5");
		
	// ***** get input *****
	
		// all input is gathered in this section
		// remember to put ConsoleReader.class into the
		// same folder.
		
		nums = Integer.parseInt(output("Enter number or numbers: "));
		
		for (int i = 0; i < nums; i++) {
			String input = output("Enter int: ");
			int out = Integer.parseInt(input);
			list[i] = out;
		}
		
		index = Integer.parseInt(output("Enter index to be changed: "));
	
	// ***** processing *****
	
		changeVal(index, Integer.parseInt(output("Enter new int: ")), list);
		
		usernum = Integer.parseInt(output("Enter int: "));
		
		max = list[1];
		for (int i = 0; i < nums; i++) {
			if (list[i] > max) {
				max = list[i];
			}
		}
		
		min = list[1];
		for (int i = 0; i < nums; i++) {
			if (list[i] < min) {
				min = list[i];
			}
		}
		
	// ***** output *****
	
		// all formatted ouput is printed in this section
		
		for (int i = 0; i < nums; i++) {
			System.out.println(list[i]);
		}
		System.out.println("");
		
		for (int i = nums - 1; i > -1; i--) {
			System.out.println(list[i]);
		}
		System.out.println("");
		
		while (usernum != -1) {
			System.out.println(usernum);
			usernum = Integer.parseInt(output("Enter int: "));
		}
		System.out.println("");
		
		System.out.println(max);
		System.out.println(min);

	// ***** closing message *****
	
		Printer.printClosing();
	
	}  // end main	
	
	public static String output(String prompt) {
		return JOptionPane.showInputDialog(prompt);
	}  // end output
	
	public static void changeVal(int index, int newval, int[] list) {
		list[index] = newval;
	}  // end changeVal
}  // end class