/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gui_program_1;
import javax.swing.JOptionPane;

public class GUI_Program_1 {

    public static void main(String[] args) {
      String name = JOptionPane.showInputDialog("Please enter your name");
        String surName = JOptionPane.showInputDialog("Please enter your surname");
        int iAge = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));

        //if (name != null && !name.isEmpty() && surName != null && !surName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Your Name and Surname are " + name + " " + surName +" and you're "+iAge +" Old now", "Information", JOptionPane.INFORMATION_MESSAGE);
            
       //} else {
        //  JOptionPane.showMessageDialog(null, "Please enter both name and surname", "ERROR", JOptionPane.ERROR_MESSAGE);
           
       // }
   }
}
