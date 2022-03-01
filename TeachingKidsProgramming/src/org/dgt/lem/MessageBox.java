package org.dgt.lem;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MessageBox
{
    public static void msgBox(String msg)
    {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void msgBox(String msg, String title)
    {
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void yesNoBox(String msg, String title)
    {
        JOptionPane.showConfirmDialog(null, msg, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

    public static int yesNoBox(String msg, String title, String imageURL)
    {
        ImageIcon icon = new ImageIcon(imageURL);
        int response = JOptionPane.showConfirmDialog(null, msg, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
        return response;
    }

    public static String inputBox(String msg)
    {
        String imageURL = "TeachingKidsProgramming\\src\\org\\dgt\\img\\bananas.jpg";
        ImageIcon icon = new ImageIcon(imageURL);
        String[] choices = {"Apple", "Banana", "Plum"};

        String input = (String) JOptionPane.showInputDialog(null, msg, "Easy Dubs", JOptionPane.INFORMATION_MESSAGE, icon, choices, "");
        return input;
    }
}
