/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import function.Algorithm;
import function.Library;
import model.Array;
import view.Menu;

/**
 *
 * @author danhv
 */
public class SearchingProgramming extends Menu<String>{
    static String[] searchChoice = {"1. Linear Search", "2. Binary Search", "3. Exit"};
    protected Library lib;
    protected Algorithm al;
    protected int[] array;
    protected int sizeOfArray;
    
    public SearchingProgramming (Array arr) {
        super("SEARCHING PROGRAMME", searchChoice);
        lib = new Library();
        al = new Algorithm();
        array = arr.getArr();
        sizeOfArray = arr.getSizeOfArr();
    }

    @Override
    public void execute(int n) {
        int x;
        switch (n) {
            case 1: 
                System.out.print("Array: ");
                lib.displayArr(array);
                x = lib.getInt("Enter number to find: ");
                if (al.linSearch(x, array)>=0) {
                    System.out.println("The position of " + x + " is " + al.linSearch(x, array));
                } else System.out.println("Cannot find " + x);
                break;
            case 2: 
                System.out.print("Array: ");
                lib.displayArr(array);
                x = lib.getInt("Enter number to find: ");
                if (al.binSearch(x, array)>=0) {
                    System.out.println("The position of " + x + " is " + al.binSearch(x, array));
                } else System.out.println("Cannot find " + x);
                break;
            case 3: 
                System.exit(0);
        }
    }
}
