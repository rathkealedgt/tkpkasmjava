// starter program week 7
package org.dgt;

import org.dgt.lem.Screen;

public class Lesson7
{
  public static void main(String[] args)
  {
    pizza();
  }
  public static void pizza()
  {
    Screen.println("What toppings would you like on your pizza? All pizzas have cheese. ");
    Screen.println("Enter X when you have finished adding toppings. ");
    String toppings = "";
    String nextTopping = "";
    while (nextTopping != "X")
    {
      Screen.println("So far you have a pizza with cheese " + toppings);
      Screen.print("Enter topping");
      nextTopping = Screen.input();
      toppings = toppings + " and " + nextTopping;
      Screen.print("Add your next topping (X when finished)");
    }
    Screen.print("Your pizza will have cheese " + toppings + ". Enjoy! ");
  }
}
