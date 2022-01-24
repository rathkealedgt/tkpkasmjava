package org.dgt;

import org.dgt.lem.Screen;

public class Lesson2
{
  public static void main(String[] args)
  {
    conversation();
  }
  public static void conversation()
  {
    Screen.print("Welcome to my conversation program.");
    Screen.println("");
    Screen.print("Do you like cycling? Answer yes or no.  ");
    String answer = Screen.input();
    if (answer.equalsIgnoreCase("yes"))
      Screen.println("That's good - you will get very fit");
    else
      Screen.println("Perhaps you like some other sport. ");
    Screen.print("Goodbye");
  }
}
