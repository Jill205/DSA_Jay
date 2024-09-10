/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task_02;

/**
 *
 * @author Aaman
 */
public class Task_02 {

    public static void main(String[] args) {
    //Exercise 1:  
    int[] Num = new int[6];
    Num[0] = 12;
    Num[1] = 24;
    Num[2] = 36;
    Num[3] = 48;
    Num[4] = 60;
    int element = 6;
    for(int i=Num.length-1; i>0; i--){
    Num[i] = Num[i-1];
    }
    Num[0] = element;
    System.out.println("Output:");
    for(int i = 0; i<Num.length; i++){
    System.out.print(Num[i]+" ");
    }
    //Exercise 2:
    int[] Num2 = new int[6];
    Num2[0] = 100;
    Num2[1] = 200;
    Num2[2] = 300;
    Num2[3] = 400;
    Num2[4] = 500;
    
    int element2 = 250;
    int pos = 2;
    for(int i=Num2.length-1; i>pos; i--){
    Num2[i] = Num2[i-1];
    }
    Num2[pos] = element2;
       System.out.println("\nOutput:");
     for(int i = 0; i<Num2.length; i++){
    System.out.print(Num2[i] + " ");
    }
    //Exercise 3:
    int[] Num3 = new int[6];
    Num3[0] = 3;
    Num3[1] = 6;
    Num3[2] = 9;
    Num3[3] = 12;
    Num3[4] = 15;
    
    int element3 = 18;
    Num3[Num3.length - 1] = element3;
    System.out.println("\nOutput:");
    for(int i = 0; i<Num3.length; i++){
    System.out.print(Num3[i] + " ");
     }
   }
    
}
