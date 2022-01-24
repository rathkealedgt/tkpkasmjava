package org.dgt;

import org.dgt.lem.Screen;
import org.teachingextensions.logo.Tortoise;

public class Lesson5
{
  public static void main(String[] args)
  {
    smallSquare();
    largeSquare();
    int length = Screen.input("Enter the length of the square.");
    anySquare(length);
  }
  public static void smallSquare()
  {
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(50);
      Tortoise.turn(90);
    }
  }
  public static void largeSquare()
  {
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(150);
      Tortoise.turn(90);
    }
  }
  public static void anySquare(int size)
  {
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(size);
      Tortoise.turn(90);
    }
  }
}
