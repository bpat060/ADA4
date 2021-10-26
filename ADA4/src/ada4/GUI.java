/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Owner
 */
public class GUI extends JComponent {

    public static void main(String[] args) {
        JFrame window = new JFrame();   // creates a JFrame
        window.setTitle("Graph");     //sets title
        window.setSize(600, 600);   //sets size
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);    //sets frame visibile
        GUI drawing = new GUI();    //indirectly calls the paint method
        window.add(drawing);    //adds paint method to Frame
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        //drawLine(x1,y1,x2,y2) -----the number explanation
        g2.drawLine(150, 200, 300, 400);    //Draws a line from (100, -200) -> (300, -400)
        g2.draw(new Rectangle(10, 10, 10, 10));     //draw rectangle
        g2.setColor(Color.GREEN);   //Changes colour to Green
        //rectangle(xPosition, yPosition,xScale, yScale) -----the number explanation
        g2.fill(new Rectangle(100, 150, 100, 50)); //fills the rectangle
    }
}
