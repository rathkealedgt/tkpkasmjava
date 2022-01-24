package org.dgt;

import org.dgt.lem.Screen;

public class Lesson8
{
  public static void main(String[] args)
  {
    String choice = "";
    while (choice != "3")
    {
      Screen.println("1. Message Repeater");
      Screen.println("2. Time Table");
      Screen.println("3. Powers");
      Screen.println("4. Quit");
      Screen.print("Enter your choice:  ");
      choice = Screen.input();
      if (choice == "1")
        message();
      else if (choice == "2")
        timesTable();
    }
    Screen.print("Goodbye");
  }
  public static void message()
  {
    Screen.println("Please enter your message. ");
    String message = Screen.input();
    for (int i = 0; i < 10; i++)
      Screen.println(message);
  }
  public static void timesTable()
  {
    int num = Screen.input("Please enter a number. ");
    for (int i = 1; i < 11; i++)
    {
      Screen.print(i * num);
      Screen.println("");
    }
  }
}
