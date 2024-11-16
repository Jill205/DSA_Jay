package com.mycompany.binarytree;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class BT_Node {
    int data;
    BT_Node left;
    BT_Node right;
    
    BT_Node(int data){
        
        this.data=data;
        left = null;
        right = null;
    }
    public void addchildleft(BT_Node parent, BT_Node child){
        parent.left = child;
    }
    public void addchildright(BT_Node parent, BT_Node child){
        parent.right = child;
    }
}
