/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import controller.SearchingProgramming;
import function.Library;
import model.Array;

/**
 *
 * @author danhv
 */
public class Main {

    /**
         * @param args the command line arguments
     */
    public static void main(String[] args) {
        Library lib = new Library();
        Array arr = new Array();
        
        arr.setSizeOfArr(lib.getInt("Enter size of array: ", 0, 100));
        arr.setArr(lib.createArr(arr.getSizeOfArr()));
        new SearchingProgramming(arr).run();
    }
    
}
