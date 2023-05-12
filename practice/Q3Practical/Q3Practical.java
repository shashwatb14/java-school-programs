/*
 * Q3Practical.java
 * 
 * Java programming practical test
 * Topic: Arrays, algorithms, problem solving
 * 
 */

import java.util.*;

@SuppressWarnings("ALL")
public class Q3Practical
{	
	public static int max(int[] a)
	{
		// REPLACE THE LINE BELOW WITH YOUR CODE
		int max = a[0];
		for (int i = 1, n = a.length; i < n; i++) if (a[i] > max) max = a[i];
		return max;
	}
	
	public static int min(int[] a)
	{
		// REPLACE THE LINE BELOW WITH YOUR CODE
		int min = a[0];
		for (int i = 1, n = a.length; i < n; i++) if (a[i] < min) min = a[i];
		return min;
	}
	
	public static double average(int[] a)
	{
		// REPLACE THE LINE BELOW WITH YOUR CODE
		double avg = 0;
		int n = a.length;
		for (int i = 0; i < n; i++) avg += a[i];
		return avg / n;
	}
	
	public static int above(int[] a)
	{
		// REPLACE THE LINE BELOW WITH YOUR CODE
		double avg = average(a);
		int above = 0;
		for (int i = 0, n = a.length; i < n; i++) if (a[i] > avg) above++;
		return above;
	}
	
	public static int below(int[] a)
	{
		// REPLACE THE LINE BELOW WITH YOUR CODE
		double avg = average(a);
		int below = 0;
		for (int i = 0, n = a.length; i < n; i++) if (a[i] < avg) below++;
		return below;
	}
	
	public static boolean isUnique(int[] a)
	{
		// REPLACE THE LINE BELOW WITH YOUR CODE
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) if (i != j && a[i] == a[j]) return false;
		}
		return true;
	}
	
	public static void printArray(int[] a)
	{
		// YOUR CODE GOES HERE
		for (int i = 0, n = a.length; i < n; i++) {
			if (i == n - 1) out(a[i]);
			else out(a[i] + ", ");
		}
	}
	
	public static void largest(int[] a, int howMany)
	{
		// YOUR CODE GOES HERE
		int max = max(a);
		out(max + ", ");
		for (int i = 0; i < howMany - 1; i++) {
			int temp = a[0];
			for (int j = 0, n = a.length; j < n; j++) if (a[j] < max && a[j] > temp) temp = a[j];
			if (i == howMany - 2) out(temp);
			else out(temp + ", ");
			max = temp;
		}
	}
	
	public static void smallest(int[] a, int howMany)
	{
		// YOUR CODE GOES HERE
		int min = min(a);
		out(min + ", ");
		for (int i = 0; i < howMany - 1; i++) {
			int temp = a[0];
			for (int j = 0, n = a.length; j < n; j++) if (a[j] > min && a[j] < temp) temp = a[j];
			if (i == howMany - 2) out(temp);
			else out(temp + ", ");
			min = temp;
		}
	}	
	
	
	public static void main (String[] args)
	{	// DO NOT CHANGE THE LINE BELOW v
		final int[] numbers = { 163, 491, 211, 5, 509, 17, 313, 197, 7, 31, 97, 4, 131, 223, 463, 331, 107, 59, 293, 337, 461, 191, 233, 277, 71, 109, 241, 61, 29, 503, 367, 449, 89, 431, 389, 139, 269, 263, 47, 349, 257, 67, 2, 11, 251, 227, 457, 193, 383, 359, 379, 83, 173, 409, 239, 151, 311, 13, 113, 443, 419, 281, 181, 487, 53, 103, 179, 43, 479, 149, 199, 19, 283, 307, 23, 439, 271, 373, 167, 73, 421, 101, 401, 37, 353, 521, 433, 41, 523, 499, 347, 127, 157, 3, 79, 467, 229, 397, 137, 317 };
		// DO NOT CHANGE THE LINE ABOVE ^
		
		// OUTPUT YOUR NAME HERE
		output("Shashwat Bhandari.");
		
		System.out.print("Amount of numbers (100): ");
		// OUTPUT THE AMOUNT OF NUMBERS IN THE ARRAY HERE -- DON'T JUST output(100)
		output(numbers.length);
		
		System.out.println();
		printArray(numbers);
		System.out.println();
		System.out.println( "Min            (2) = " + min(numbers) );
		System.out.println( "Max          (523) = " + max(numbers) );
		System.out.println( "Average   (235.96) = " + average(numbers) );
		System.out.println( "Above average (48) = " + above(numbers) );
		System.out.println( "Below average (52) = " + below(numbers) );
		System.out.println( "Array has only unique elements (true): " + isUnique(numbers) );
		System.out.println();
		int howMany = 0;
		// INPUT HOWMANY BELOW, AND VALIDATE THE INPUT PROPERLY
		do {
			howMany = inputInt("How many largest and smallest numbers to find? ");
			if (howMany < 2 || howMany > 10) output("Error-enter a number between 2 and 10.");
		} while (howMany < 2 || howMany > 10);
		
		
		
		largest(numbers, howMany);
		System.out.println();
		smallest(numbers, howMany);
		// the end.
	}
	
	/*****************************************************************************
	 * ALL IBIO methods are below, you may use them if you want.				 *
	 * Because they are already inside our clas, there is no need to prefix IBIO.*
	 * before the name of the method.											 *
	 ****************************************************************************/
	 
	static void output (String info)
	{	System.out.println(info);	}
	
	static void out (String info)
	{	System.out.print(info);	}
	
	static void output (char info)
	{	System.out.println(info);	}
	
	static void out (char info)
	{	System.out.print(info);	}
	
	static void output (byte info)
	{	System.out.println(info);	}
	
	static void output (int info)
	{	System.out.println(info);	}
	
	static void out (int info)
	{	System.out.print(info);	}
	
	static void output (long info)
	{	System.out.println(info);	}
	
	static void out (long info)
	{	System.out.print(info);	}
	
	static void output (double info)
	{	System.out.println(info);	}
	
	static void output (boolean info)
	{	System.out.println(info);	}
	
	static String input(String prompt)
	{	String	inputLine = "";
		System.out.print(prompt);
		try
		{	inputLine = (new java.io.BufferedReader(
							new java.io.InputStreamReader(System.in))).readLine();}
		catch (Exception e)
		{	String	err = e.toString();
			System.out.println(err);
			inputLine = "";
		}
		return	inputLine;
	}
		
	static String inputString(String prompt)
	{	return	input(prompt);	}

	static String input()
	{	return	input("");	}


	static char inputChar(String prompt)
	{	char	result = (char) 0;
		try
		{	result = input(prompt).charAt(0);}
		catch (Exception e)	{	result = (char) 0;}
		return	result;
	}

	static byte inputByte(String prompt)
	{	byte	result = 0;
		try
		{	result = Byte.valueOf(input(prompt).trim()).byteValue() ;	}
		catch (Exception e)	{	result = 0;}
		return	result;
	}

	static byte inputByte()
	{	return	inputByte("");	}

	static int inputInt(String prompt)
	{	int	result = 0;
		try
		{	result = Integer.valueOf(input(prompt).trim()).intValue() ;	}
		catch (Exception e)	{	System.out.println(">>> error in input"); result = 0;}
		return	result;
	}

	static int inputInt()
	{	return	inputInt("");
	}
	
	static long inputLong(String prompt)
	{	long	result = 0;
		try
		{	result = Long.valueOf(input(prompt).trim()).longValue() ;	}
		catch (Exception e)	{	result = 0;}
		return	result;
	}

	static long inputLong()
	{	return	inputLong("");	}
	
	static double inputDouble(String prompt)
	{	double	result = 0;
		try
		{	result = Double.valueOf(input(prompt).trim()).doubleValue() ;	}
		catch (Exception e)	{	result = 0;}
		return	result;
	}

	static double inputDouble()
	{	return	inputDouble("");	}
	
	static boolean inputBoolean(String prompt)
	{	boolean	result = false;
		try
		{	result = Boolean.valueOf(input(prompt).trim()).booleanValue() ;	}
		catch (Exception e)	{	result = false;}
		return	result;
	}

	static boolean inputBoolean()
	{	return	inputBoolean("");
	}
	
}

