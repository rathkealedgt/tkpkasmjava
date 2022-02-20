package org.dgt;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

//import org.dgt.lem.Screen;

//import org.dgt.lem.MessagegBox;

public class Lesson9 {
  public static void main(String[] args) {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenColor(PenColors.Reds.PaleVioletRed);
    for (int counter = 0; counter < 20; counter++) {
      Tortoise.move(150);
      Tortoise.turn(100);
    }
  }
}
