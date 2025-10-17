/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_1e2b;
import java.util.Scanner;
/**
 *
 * @author Arda
 */
public class Project_1e2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This program calculates the area of a circular yard but one rectangular house situated in the area");
        int yard, area, length, width;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yard:");
        yard = input.nextInt();
        System.out.println("Enter length:");
        length = input.nextInt();
        System.out.println("Enter width:");
        width = input.nextInt();
        area = yard*yard*3-length*width;
        System.out.println("The Area of the empty place = " + area);
        
    }
    
}
