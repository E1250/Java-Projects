/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home.task;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author lenovo
 */
public class Frame extends JFrame{

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
    
        g.setColor(Color.black);
        g.fillRect(0,0, 1000, 300);
        
        for(int item = 0 ; item <=500 ; item++){
            Random rand = new Random();
            int randNum1 = rand.nextInt(600);
            int randNum2 = rand.nextInt(600);

            g.setColor(Color.WHITE);
            g.drawLine(randNum1, randNum2, randNum1, randNum2);
        }
        
        g.setColor(Color.decode("#d4b66e"));
        g.fillRect(100, 150, 400, 300);
        g.setColor(Color.BLACK);
        g.drawRect(100, 150, 400, 300);

        
        g.setColor(Color.white);
        g.fillRect(120, 170, 70, 70);
        g.fillRect(400, 170, 70, 70);
        
        g.setColor(Color.BLACK);
        g.drawRect(120, 170, 70, 70);
        g.drawRect(400, 170, 70, 70);
        
        g.drawLine(120, 205, 190, 205);
        g.drawLine(400, 205, 470, 205);
        
        g.drawLine(155, 170, 155, 240);
        g.drawLine(435, 170, 435, 240);

        
        g.setColor(Color.white);
        g.fillRect(120, 340, 70, 70);
        g.fillRect(400, 340, 70, 70);
        
        
        g.setColor(Color.BLACK);
        g.drawRect(120, 340, 70, 70);
        g.drawRect(400, 340, 70, 70);
        
        g.drawLine(120, 375, 190, 375);
        g.drawLine(400, 375, 470, 375);
        
        g.drawLine(155, 340, 155, 410);
        g.drawLine(435, 340, 435, 410);
        
        
        g.setColor(Color.blue);
        g.fillRect(260, 350, 80, 100);
        g.setColor(Color.black);
        g.drawRect(260, 350, 80, 100);

        
        g.setColor(Color.black);
        g.drawLine(100, 300, 600, 300);
    }
    
}
