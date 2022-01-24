package org.dgt;

import org.teachingextensions.logo.Tortoise;

public class Lesson4b
{
  public static void main(String[] args)
  {
    Tortoise.show();
    square();
    Tortoise.turn(-45);
    square();
  }
  public static void square()
  {
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(100);
      Tortoise.turn(90);
    }
  }
}
