/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bubblesort;

/**
 *
 * @author FI
 */
public class Bubblesort {
    public void Bubblesort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
             for(int j=0; j<arr.length-1; j++){
               if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j]= arr[j+1];
                   arr[j+1]= temp;          
            }  } } }
     public static void main(String[] args) {
    Bubblesort bs = new Bubblesort();
    int[]arr = {5,1,3,4,6,2};
    bs.Bubblesort(arr);
    for(int i=0; i<arr.length-1; i++){
        System.out.print(arr[i]+" ");
  }
 }
}
