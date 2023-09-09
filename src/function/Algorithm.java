/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

import java.util.Arrays;

/**
 *
 * @author danhv
 */
public class Algorithm {
    public void sort(int[] arr) {
        int t;
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j]<arr[i]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
    
    public int linSearch(int x, int[] arr) {
        boolean c=false;
        int i=0;
        for (; i<arr.length; i++) {
            if (arr[i] == x) {
                c = true;
                break;
            }
        }
        return (c)? i : -1;
    }
    
    public int binSearch(int x, int[] arr) {
//        int[] arr2 = arr.clone();
        int[] arr2 = Arrays.copyOf(arr, arr.length);

        sort(arr2);

        int l = 0; 
        int r = arr2.length -1;
        while (l <= r) {
            int mid = l+(r-l)/2;
            if (arr2[mid] == x) {
                return mid;
            } else if (arr2[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
