package org.dgt.lem;

import java.util.Scanner;

public class Screen
{
  /**
   * This helper method provides a layer of abstraction for the System.out.println() method.
   * 
   * @param msg The String to print to standard out.
   * @see System.out.println()
   */
  public static void println(String msg)
  {
    System.out.println(msg);
  }
  /**
   * This helper method provides a layer of abstraction for the System.out.print() method.
   * 
   * @param msg The prompt to print to the standard out.
   * @see System.out.print()
   */
  public static void print(String msg)
  {
    System.out.print(msg);
  }
   /**
   * This helper method provides a layer of abstraction for the System.out.print() method.
   * 
   * @param num The prompt to print to the standard out.
   * @see System.out.print()
   */
  public static void print(int num)
  {
    System.out.print(num);
  }
  /**
   * This helper method provides a layer of abstraction for new users to get input from
   * the standard input.
   * 
   * @return The String that the user has entered.
   * @see Scanner, System.in
   */
  public static String input()
  {
    Scanner scan = new Scanner(System.in);
    String newinput = scan.nextLine();
    scan.close();
    return newinput;
  }
  /**
   * This helper method provides a layer of abstraction for new users to get input from
   * the standard input.
   * 
   * @param msg The prompt to print to the standard out.
   * @return The integer that the user has entered.
   * @see Scanner, System.in
   */
  public static int input(String msg)
  {
    System.out.print("Enter the length of the square: ");
    Scanner scan = new Scanner(System.in);
    int newinput = scan.nextInt();
    scan.close();
    return newinput;
  }
  /**
   * This helper method provides a layer of abstraction for new users to pause execution
   * of code in Java.
   * 
   * @param seconds The number of seconds to pause code execution.
   * @see Thread
   */
  public static void sleep(int seconds)
  {
	try
	{
	  Thread.sleep(seconds * 1000);
	}
	catch(InterruptedException ie)
	{
	  Thread.currentThread().interrupt();
	}
  }
}