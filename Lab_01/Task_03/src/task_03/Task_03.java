/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task_03;

/**
 *
 * @author Aaman
 */
public class Task_03 {

        public static void main(String[] args) {
        int[] Array={8,16,24,32,40};
        int deleteindex = 2;
        for(int i=deleteindex; i<Array.length-1; i++){
        Array[i]=Array[i+1];
        }
        
        Array[Array.length-1]=0;
        for(int i=0; i<Array.length; i++){
        System.out.print(Array[i]+" ");
        }
    }
    
}
