// starter program week 6
package org.dgt;

import org.dgt.lem.Screen;

public class Lesson6
{
  public static void main(String[] args)
  {
    int number = 0;
    while (number <= 5)
    {
      Screen.print("Hello");
      number = number + 1;
    }
    Screen.print("Goodbye");
  }
}
