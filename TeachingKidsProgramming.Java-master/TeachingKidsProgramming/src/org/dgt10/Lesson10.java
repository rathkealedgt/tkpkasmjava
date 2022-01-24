package org.dgt;

import org.dgt.lem.Screen;

public class Lesson10
{
  public static void main(String[] args)
  {
    Screen.println("You are trying to find your way through a maze to the centre where ");
    Screen.println("there is a pot of gold!");
    Screen.println("What you don't know is that this is a dangerous maze with traps and hazards.");
    Screen.println("");
    Screen.sleep(5);
    Screen.println("Starting maze game ...");
    Screen.println("");
    Screen.println("You enter the maze...");
    Screen.sleep(2); // time.sleep is just used to build up the suspense!;
    Screen.print("You reach a opening in the wall and go through it...");
    Screen.print("\n");
    Screen.sleep(2);
    Screen.println("You can go left (L) or right (R)");
    Screen.print("Make your choice ... ");
    String answer = Screen.input();
    Screen.println("You chose " + answer + "... what will happen? ...");
    Screen.sleep(2);
    Screen.println("You turn the corner...");
    Screen.sleep(2);
    Screen.println("You walk forward a few steps...");
    Screen.sleep(2);
    if (answer.equalsIgnoreCase("R"))
      Screen.println("...and fall down a trap door and are never seen again...");
    else
      Screen.println("...and see a beautiful grassy path lined with trees with a pot of gold at the end.!");
  }
}
