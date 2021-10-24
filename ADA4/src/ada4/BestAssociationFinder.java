/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class BestAssociationFinder {

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

        if (("Anne".equals(nameOne) && "Carl".equals(nameTwo)) || ("Anne".equals(nameTwo) && "Carl".equals(nameOne))) {
            socialWeight = 0.4;
        } else if (("Anne".equals(nameOne) && "Bill".equals(nameTwo)) || ("Anne".equals(nameTwo) && "Bill".equals(nameOne))) {
            socialWeight = 0.5;
        } else if (("Carl".equals(nameOne) && "Emma".equals(nameTwo)) || ("Carl".equals(nameTwo) && "Emma".equals(nameOne))) {
            socialWeight = 0.5;
        } else if (("Carl".equals(nameOne) && "Dave".equals(nameTwo)) || ("Carl".equals(nameTwo) && "Dave".equals(nameOne))) {
            socialWeight = 0.3;
        } else if (("Bill".equals(nameOne) && "Dave".equals(nameTwo)) || ("Bill".equals(nameTwo) && "Dave".equals(nameOne))) {
            socialWeight = 0.4;
        } else if (("Emma".equals(nameOne) && "Dave".equals(nameTwo)) || ("Emma".equals(nameTwo) && "Dave".equals(nameOne))) {
            socialWeight = 0.8;
        } else if (("Emma".equals(nameOne) && "Fred".equals(nameTwo)) || ("Emma".equals(nameTwo) && "Fred".equals(nameOne))) {
            socialWeight = 0.7;
        } else {
            System.out.println("There is no direct relationship between " + nameOne + " and " + nameTwo);
        }

        System.out.println(
                "The strength between " + nameOne + " and " + nameTwo + " relationship is " + socialWeight);

    }
}
