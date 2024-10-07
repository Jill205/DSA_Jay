/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FI
 */
public class Task03 {
    public void earlySortBubbleSort(String[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j].length()>arr[j+1].length()){
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
    Task03 ebs = new Task03();
    String []arr = {"apple", "pie", "banana", "cat"};
    ebs.earlySortBubbleSort(arr);
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
        }
    }
}
    