/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hassan;

/**
 *
 * @author Magic Systems
 */
public class Hassan {

    public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        double value = input.nextDouble();
    
        

        System.out.println("--- MENU ---");
        System.out.println("1- Convert from CM to Inche");
        System.out.println("2- Convert from Inche to CM");
        System.out.println("3- Convert from M to Feet");
        System.out.println("4- Convert from Feet to M");
        System.out.println("5- Convert from Dunm to Hiktar");
        System.out.println("6- Convert from Hiktar to Dunm");
        System.out.println("7- Convert from Cels to Fenh");
        System.out.println("8- Convert from Fenh to Cels");

        System.out.print("Enter your choice (1-8): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (value / 2.54) + " Inches");
                break;
            case 2:
                System.out.println("Result = " + (value * 2.54) + " CM");
                break;
            case 3:
                System.out.println("Result = " + (value * 3.28084) + " Feet");
                break;
            case 4:
                System.out.println("Result = " + (value / 3.28084) + " M");
                break;
            case 5:
                System.out.println("Result = " + (value / 10.0) + " Hiktar");
                break;
            case 6:
                System.out.println("Result = " + (value * 10.0) + " Dunm");
                break;
            case 7:
                System.out.println("Result = " + ((value * 9.0 / 5.0) + 32) + " Fenh");
                break;
            case 8:
                System.out.println("Result = " + ((value - 32) * 5.0 / 9.0) + " Cels");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    
    }
           
                    
                    
                    
    }
