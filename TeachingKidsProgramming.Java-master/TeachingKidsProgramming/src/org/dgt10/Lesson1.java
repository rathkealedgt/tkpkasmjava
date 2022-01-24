package org.dgt;

import org.dgt.lem.Screen;

public class Lesson1
{
  public static void main(String[] args)
  {
    String name = "Billy";
    Screen.println("We want to know if you like programming!");
    Screen.print("Do you like programming " + name + "?  ");
    String answer = Screen.input();
    Screen.println("");
    Screen.println("Great! You said " + answer + "!");
    Screen.println("Let's learn some Java!");
  }
}
