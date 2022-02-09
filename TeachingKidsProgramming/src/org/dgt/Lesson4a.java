package org.dgt;
//This is the program for lesson 4. Anything following // is ignored by the computer.

//We can use this to annotate programs to make them more readable.
//The package declaration above shows the file structure of this class.
// import statements tell the computer to look in specific libraries for code that
// is already written.
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class Lesson4a
{
  public static void main(String[] args)
  {
    mystery();
  }
  
  public static void mystery()
  {
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.show();
    Tortoise.move(100);
    Tortoise.turn(90);
    Tortoise.move(100);
    Tortoise.turn(90);
    Tortoise.move(100);
    Tortoise.turn(90);
    Tortoise.move(100);
    Tortoise.turn(90);
  }
}
