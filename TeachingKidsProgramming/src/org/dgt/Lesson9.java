package org.dgt;

import javax.swing.JOptionPane;

import org.dgt.lem.*;

public class Lesson9 {
  public static void main(String[] args) 
  {
    example1();
    //example2();
    //example3();
    //example4();
    //example5
    //example6();
  }

  private static void example1()
  {
    MessageBox.msgBox("Hello everyone!");
  }

  private static void example2()
  {
    MessageBox.msgBox("Hello Everyone!", "Buttons program");
  }

  private static void example3()
  {
    MessageBox.yesNoBox("Do you like bananas?", "Choose Only 1");
  }

  private static void example4()
  {
    MessageBox.yesNoBox("Do you like bananas?", "Choose Only 1", "TeachingKidsProgramming\\src\\org\\dgt\\img\\bananas.jpg");
  }

  private static void example5()
  {
    int answer = MessageBox.yesNoBox("Do you like bananas?", "Choose Only 1", "TeachingKidsProgramming\\src\\org\\dgt\\img\\bananas.jpg");
    
    if(answer == JOptionPane.YES_OPTION)
      MessageBox.msgBox("Me too!", "Awesome Answer");
    else
      MessageBox.msgBox("Don't forget your five a day!", "Poor Answer");
  }

  public static void example6()
  {
    String question = "What is the name of this fruit?";
    String reply = MessageBox.inputBox(question);

    if(reply.equalsIgnoreCase("BANANA"))
      MessageBox.msgBox("Correct!");
    else
      MessageBox.msgBox("Incorrect");
  }

}
