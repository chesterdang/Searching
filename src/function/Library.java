/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author danhv
 */
public class Library {
    public static int getInt(String prompt){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        boolean isValid = false;
        while (isValid == false){
            System.out.print(prompt);
            if (sc.hasNextInt()){
                i = sc.nextInt();
                isValid = true;
        } 
            else{
                System.out.println("Error! Invalid integer value. Try again.");
                }
            sc.nextLine();
        }
        return i;
    }
    public static int getInt(String prompt,int min, int max){
       int i = 0;
       boolean isValid = false;
       while (isValid == false){
           i= getInt(prompt);
           if (i<min)
               System.out.println("Error! Number must be greater than " + min + ".");
           else if(i> max){
               System.out.println("Error! Number must be less than " + max + ".");
           }
           else 
               isValid = true;
        }
        return i;
    }
    
    public int[] createArr(int sizeOfArr) {
        int[] array = new int[sizeOfArr];
        Random rd = new Random();
        for (int i = 0; i<sizeOfArr; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    }
    
    public void displayArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            
        }
        System.out.println("");
    }
}
