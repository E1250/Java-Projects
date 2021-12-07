/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arc_task;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author lenovo
 */
public class JFrame extends javax.swing.JFrame {

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        
        g.setColor(Color.yellow);
        g.fillArc(250, 250, 200, 200, 0, 45);
        
        g.setColor(Color.magenta);
        g.fillArc(250, 250, 200, 200, 90, 45);
        
        g.setColor(Color.green);
        g.fillArc(250, 250, 200, 200, 180, 45);
        
        g.setColor(Color.orange);
        g.fillArc(250, 250, 200, 200, 270, 45);
        
    }
    
    
    
}
