package org.dgt;

import org.dgt.lem.Screen;

public class Lesson3
{
  public static void main(String[] args)
  {
    cooking();
  }
  public static void cooking()
  {
    Screen.println("Meal planner");
    Screen.println("");
    Screen.println("1. Chicken curry ");
    Screen.println("2. Veggie lasagne");
    Screen.println("3. Burger and salad");
    Screen.println("");
    Screen.println("Which of these meals is your favourite? (1, 2 or 3)");
    String answer = Screen.input();
    if (answer.equals("1"))
      Screen.print("Chicken curry coming up");
    else if (answer.equals("2"))
      Screen.print("Veggie lasagne coming up");
    else
      Screen.print("Burger and salad coming up!");
    Screen.println("");
    Screen.print("Enjoy!");
  }
}
