/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task_01;

/**
 *
 * @author Aaman
 */
public class Task_01 {
public static void main(String[] args) {
    //Exercise 1:
    int[] num = new int[6];
    num[0] = 5;
    num[1] = 15;
    num[2] = 25;
    num[3] = 35;
    num[4] = 45;
    num[5] = 55;
    for(int i=0; i<num.length; i++){
    System.out.print(num[i]+ " ");
    }
    
    
    //Exercise 2:
    for(int i=0; i<num.length; i++){
    System.out.println("\n Element at index "+i+": "+num[i]);
    }
  }  
    
}
