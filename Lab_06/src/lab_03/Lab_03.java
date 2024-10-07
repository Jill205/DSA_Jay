/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_03;

/**
 *
 * @author Aaman
 */
public class Lab_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         linkedlist list = new linkedlist();
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtStart(30);
        list.insertAtStart(40);
        list.insertAtStart(50);

        list.insertAtStart(60);
        list.insertAtEnd(5);
        list.insertAtPosition(25, 4);
        list.display();
        System.out.println("inserting operation in list complete\n\n");


        list.deleteAtStart();
        list.deleteAtEnd();
        list.deleteByValue(25);
        list.display();
        System.out.println("deleting operation in list complete\n\n");

        list.Search(30);
        System.out.println("Searching operation list complete\n\n");

        list.Reverse();
        list.display();
        System.out.println("reverse operation list complete\n\n");

        list.countNode();
        System.out.println("count node operation complete\n\n");

        list.display();
        System.out.println("Traversal operation complete\n\n");
    }
}