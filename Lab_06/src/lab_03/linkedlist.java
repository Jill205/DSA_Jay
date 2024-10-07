/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_03;

/**
 *
 * @author Aaman
 */
public class linkedlist {
     public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    private Node head;
    public linkedlist() {
        this.head=null; 
    }
    
    //Insertion
    public void insertAtStart(int data){
        Node newNode = new Node(data);
        newNode.next= head;
        head = newNode;
    }
    public void insertAtEnd(int data){
        Node newNode =new Node(data);
        if (head==null)
            head=newNode;
        else{
            Node current =head;
            while (current.next!=null) {
                current=current.next;
            }
            current.next=newNode;
        }
    }
    public void insertAtPosition(int data, int position){
        if(position == 0){
            insertAtStart(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        int index = 0;
        while(current!= null && index < position - 1){
            current = current.next;
            index++;
        }
        if(current == null){
            System.out.println("Position out of range");
        }
        else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    //Deletion
    public void deleteAtStart(){
        if(head == null){
            System.out.println("list is empaty");
        }
        head = head.next;
    }
    public void deleteAtEnd() {
        if (head == null)
            System.out.println("List is empty");
        else if (head.next == null)
            head = null;
        else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }
    public void deleteByValue (int data) {
        if (head == null)
            return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
//Traversal Operations
    public void display(){
        if(head == null){
            System.out.println("list is empaty");
        }
        Node current = head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }   System.out.println("null");
    }
    //Searhing Operations
    public void Search(int value){
        Node current = head;
        int index = 0;
        while(current!= null){
            if(current.data == value){
                System.out.println("Data found at position " + index);
                return;
            }
            current = current.next;
            index++;
        }
        System.out.println("Data not found in the list");
    }

    //Reverse Operations
    public void Reverse(){
        if(head == null || head.next == null){
            return;
        }
        Node prev = null;
        Node current = head;
        Node next;
        while(current!= null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

//Count Nodes
    public void countNode() {
        if(head == null){
            System.out.println("list is empaty");
        }
        int count = 0;
        Node current = head;
        while (current != null){
            count++;
            current = current.next;
        }   System.out.println("this list contains " + count + " nodes");
    
}
}
