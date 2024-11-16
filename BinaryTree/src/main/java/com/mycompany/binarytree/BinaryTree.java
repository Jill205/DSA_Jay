/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binarytree;

/**
 *
 * @author User
 */
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree {
    BT_Node root;
    BinaryTree(int data){
        root = new BT_Node(data);
    }
    
    //Post Order Traversal
    public void PostOrderTraversal(BT_Node newNode){
        if(root==null){
            return;   
        }
        PostOrderTraversal(newNode.left);
        PostOrderTraversal(newNode.right);
        System.out.println(newNode.data);
    }
    
    //Pre Order Traversal
    public void PreOrderTraversal(BT_Node newNode){
        if(root==null){
            return;   
        }
        System.out.println(newNode.data);
        PreOrderTraversal(newNode.left);
        PreOrderTraversal(newNode.right);   
    }
    
    //In Order Traversal
    public void InOrderTraversal(BT_Node newNode){
        if(root==null){
            return;   
        }
        InOrderTraversal(newNode.left);
        System.out.println(newNode.data);
        InOrderTraversal(newNode.right);  
    }
    
    //Level Order Traversal
    public void LevelOrderTraversal(BT_Node newNode){
        if(root==null){
            return;
        }
        Queue <BT_Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BT_Node current = queue.poll();
            System.out.println(current.data);
        if(current.left != null){
            queue.add(current.left);    
        }
        if(current.right != null){
            queue.add(current.right);
           
            }
        }
    }
    
    public static void main(String[] args) {
        BinaryTree t1 = new BinaryTree(1);
        System.out.println(t1.root.data);
        
        BT_Node t2 = new BT_Node(2);
        t1.root.addchildleft(t1.root, t2);
        System.out.println(t1.root.left.data);
        
        BT_Node t3 = new BT_Node(3);
        t1.root.addchildright(t1.root, t3);
        System.out.println(t1.root.right.data);
        
        BT_Node t4 = new BT_Node(4);
        t2.addchildleft(t2, t4);
        System.out.println(t1.root.left.data);
        
        BT_Node t5 = new BT_Node(5);
        t2.addchildleft(t3, t5);
        System.out.println(t1.root.left.data);
        
        
    }
}
