/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package home.task;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author lenovo
 */
public class HomeTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocation(300, 200);
        frame.setTitle("Home Task");
        frame.getContentPane().setBackground(Color.green);
        
    }
}
