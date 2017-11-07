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
		String out = "";
		
	// ***** create objects *****
		
		ProgramInfo Printer = new ProgramInfo();
		out += Printer.getBanner();
		
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		Printer.printBanner("ArrayExercise 1 Q1-5");
		
	// ***** get input *****
	
		// all input is gathered in this section
		// remember to put ConsoleReader.class into the
		// same folder.
		
		nums = Integer.parseInt(input("Enter number or numbers: "));
		
		for (int i = 0; i < nums; i++) {
			String input = input("Enter int: ");
			int in = Integer.parseInt(input);
			list[i] = in;
		}
	
	// ***** processing *****
		
		System.out.println("Original:");
		out += "Original:\n";
		for (int i = 0; i < nums; i++) {
			System.out.println(i + ":	" + list[i]);
			out += i + ":	" + list[i] + "\n";
		}
		System.out.println("");
		out += "\n";
		
		System.out.println("Reverse:");
		out += "Reverse:\n";
		for (int i = nums - 1; i > -1; i--) {
			System.out.println(i + ":	" + list[i]);
			out += i + ":	" + list[i] + "\n";
		}
		System.out.println("");
		out += "\n";
		
		usernum = Integer.parseInt(input("Enter index to be printed: "));
		
		while (usernum > -1) {
			System.out.println(usernum + ":	" + list[usernum]);
			out += usernum + ":	" + list[usernum] + "\n";
			usernum = Integer.parseInt(input("Enter index to be printed: "));
		}
		System.out.println("");
		out+= "\n";
		
		index = Integer.parseInt(input("Enter index to be changed: "));
		
		changeVal(index, Integer.parseInt(input("Enter new value: ")), list);
		
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
		
		System.out.println("Highest Value:	" + max);
		out += "Highest Value:	" + max + "\n";
		System.out.println("Lowest Value:	" + min);
		out += "Lowest Value:	" + min + "\n";
		
	// ***** output *****
	
		// all formatted ouput is printed in this section
		
		out = Printer.getClosing();
		output(out);

	// ***** closing message *****
	
		Printer.printClosing();
	
	}  // end main	
	
	public static String input(String prompt) {
		return JOptionPane.showInputDialog(prompt);
	}  // end input
	
	public static void output(String out) {
		JOptionPane.showMessageDialog(null, out);
	}  // end output
	
	public static void changeVal(int index, int newval, int[] list) {
		list[index] = newval;
	}  // end changeVal
}  // end class