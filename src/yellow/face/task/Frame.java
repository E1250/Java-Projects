/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yellow.face.task;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author lenovo
 */
public class Frame extends JFrame {

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.

        g.setColor(Color.YELLOW);
        g.fillOval(100, 110, 300, 350);
        g.setColor(Color.black);
        g.fillOval(160, 160, 50,50);
        g.fillOval(290, 160, 50,50);
        
//        g.fillOval(160, 160, 55,55);
//        g.fillOval(290, 160, 55,55);
        g.setColor(Color.WHITE);
        g.fillOval(160, 160, 50,50);
        g.fillOval(290, 160, 50,50);
        g.setColor(Color.black);
        g.fillOval(180, 170, 30,30);
        g.fillOval(310, 170, 30,30);
        
        g.fillOval(230, 250, 50,70);
        g.fillOval(210, 350, 90,40);
        
        g.setColor(Color.yellow);
        g.fillRect(210, 340, 100, 30);

        
        
    }
    
}
