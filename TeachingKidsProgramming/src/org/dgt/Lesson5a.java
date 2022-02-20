package org.dgt;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class Lesson5a {
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
