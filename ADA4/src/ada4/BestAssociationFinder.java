/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Owner
 */
public class BestAssociationFinder extends JComponent {

    public static void main(String[] args) {

        //String[] people = {"Anne", "Carl", "Emma", "Fred", "Dave", "Bill"};
        ArrayList arrayList = new ArrayList();
        arrayList.add("Anne");
        arrayList.add("Carl");
        arrayList.add("Emma");
        arrayList.add("Fred");
        arrayList.add("Dave");
        arrayList.add("Bill");

        Scanner input = new Scanner(System.in);
        int firstindex;
        String nameOne;

        do {
            System.out.println("Enter First Person's Name:");
            nameOne = input.next();
            firstindex = arrayList.indexOf(nameOne);

            if (firstindex != -1) {
                break;
            }
            // This prints only if the user entered a bad number.
            System.err.println("Name not found in list");

        } while (nameOne != arrayList.toString() && firstindex == arrayList.indexOf(-1)); //{

        System.out.println(nameOne + " is in position : " + firstindex);

        int secondindex;
        String nameTwo;

        do {
            System.out.println("Enter Second Person's Name:");
            nameTwo = input.next();

            secondindex = arrayList.indexOf(nameTwo);

            if (nameOne == nameTwo) {
                break;
            } else if (secondindex != -1 && firstindex != secondindex) {
                break;
            }
            // This prints only if the user entered a bad number.
            System.err.println("Name not found in list or is same as first person");

        } while (nameOne != nameTwo || secondindex == arrayList.indexOf(-1) || nameTwo != arrayList.toString());

        System.out.println(nameTwo + " is in position : " + secondindex);
        // closing the scanner object
        input.close();

        double socialWeight = 0;
        ArrayList connectionList = new ArrayList();
        double strongestConnection = 0;

        if (("Anne".equals(nameOne) && "Carl".equals(nameTwo)) || ("Anne".equals(nameTwo) && "Carl".equals(nameOne))) {
            socialWeight = 0.4;
            connectionList.add("AnneToCarl");
        } else if (("Anne".equals(nameOne) && "Bill".equals(nameTwo)) || ("Anne".equals(nameTwo) && "Bill".equals(nameOne))) {
            socialWeight = 0.5;
            connectionList.add("AnneToBill");
        } else if (("Carl".equals(nameOne) && "Emma".equals(nameTwo)) || ("Carl".equals(nameTwo) && "Emma".equals(nameOne))) {
            socialWeight = 0.5;
            connectionList.add("CarlToEmma");
        } else if (("Carl".equals(nameOne) && "Dave".equals(nameTwo)) || ("Carl".equals(nameTwo) && "Dave".equals(nameOne))) {
            socialWeight = 0.3;
            connectionList.add("CarlToDave");
        } else if (("Bill".equals(nameOne) && "Dave".equals(nameTwo)) || ("Bill".equals(nameTwo) && "Dave".equals(nameOne))) {
            socialWeight = 0.4;
            connectionList.add("BillToDave");
        } else if (("Emma".equals(nameOne) && "Dave".equals(nameTwo)) || ("Emma".equals(nameTwo) && "Dave".equals(nameOne))) {
            socialWeight = 0.8;
            connectionList.add("EmmaToDave");
        } else if (("Emma".equals(nameOne) && "Fred".equals(nameTwo)) || ("Emma".equals(nameTwo) && "Fred".equals(nameOne))) {
            socialWeight = 0.7;
            connectionList.add("EmmaToFred");
        } else {

            if (socialWeight == 0) {
                System.out.println("There is no direct relationship between " + nameOne + " and " + nameTwo);

//                if (nameOne == arrayList.toString() ){
//
//                }
            }
        }

        System.out.println(
                "The strength between " + nameOne + " and " + nameTwo + " relationship is " + socialWeight);

        JFrame window = new JFrame();   // creates a JFrame
        window.setTitle("Graph");     //sets title
        window.setSize(600, 600);   //sets size
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);    //sets frame visibile
        BestAssociationFinder drawing = new BestAssociationFinder();    //indirectly calls the paint method
        window.add(drawing);    //adds paint method to Frame

//        JLabel tf = new JLabel();
//        window.add(tf);
//
//        // set visible JFrame with some size (400x400)
//        tf.setSize(800, 400);
//        tf.setLocation(400, 300);
//        tf.setVisible(true);
//        tf.setText((String) arrayList.get(0));
        window.setLocation(40, 40);
        Label label1 = new Label((String) arrayList.get(0), 1);
        //label.setLayout(new FlowLayout());
        label1.setAlignment(50);
        label1.setSize(100, 50);
        label1.setBackground(Color.green);
        window.add(label1);
        window.pack(); // size the frame
        label1.setVisible(true);

        Label label2 = new Label((String) arrayList.get(1), 1);
        //label.setLayout(new FlowLayout());
        label2.setAlignment(50);
        label2.setSize(100, 50);
        label2.setBackground(Color.green);
        window.add(label2);
        window.pack(); // size the frame
        label2.setVisible(true);

        Label label3 = new Label((String) arrayList.get(2), 1);
        //label.setLayout(new FlowLayout());
        label3.setAlignment(50);
        label3.setSize(100, 50);
        label3.setBackground(Color.green);
        window.add(label3);
        window.pack(); // size the frame
        label3.setVisible(true);

        Label label4 = new Label((String) arrayList.get(3), 1);
        //label.setLayout(new FlowLayout());
        label4.setAlignment(50);
        label4.setSize(100, 50);
        label4.setBackground(Color.green);
        window.add(label4);
        window.pack(); // size the frame
        label4.setVisible(true);

        Label label5 = new Label((String) arrayList.get(4), 1);
        //label.setLayout(new FlowLayout());
        label5.setAlignment(50);
        label5.setSize(100, 50);
        label5.setBackground(Color.green);
        window.add(label5);
        window.pack(); // size the frame
        label5.setVisible(true);

        Label label6 = new Label((String) arrayList.get(5), 1);
        //label.setLayout(new FlowLayout());
        label6.setAlignment(50);
        label6.setSize(100, 50);
        label6.setBackground(Color.green);
        window.add(label6);
        window.pack(); // size the frame
        label6.setVisible(true);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        //drawLine(x1,y1,x2,y2) -----the number explanation
        g2.drawLine(150, 200, 300, 400);    //Draws a line from (100, -200) -> (300, -400)
        //g2.draw(new Rectangle(10, 10, 10, 10));     //draw rectangle
        //g2.setColor(Color.GREEN);   //Changes colour to Green
        //rectangle(xPosition, yPosition,xScale, yScale) -----the number explanation
        //g2.fill(new Rectangle(100, 150, 100, 50)); //fills the rectangle
    }
}
