/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.linkedlist;

/**
 *
 * @author yogesh.dahake
 */
public class LinkedListDemo {
    Node head; //before : [10|null] = head

    public void insertAtBegining(int data){
        
        Node node = new Node(data); //one new node is created [20|null]
        node.next = head; //[20|node1@ref]<-[10|null](head)
        head = node;//now update current head to newnode  [20|node1@ref](head)<-[10|null]
    }
    
//Steps to insert a node at the end:
//Create a new node.
//If the list is empty, make the new node the head.
//Otherwise, traverse to the last node.
//Set the last node’s next to the new node.
    public void insertAtEnd(int data)
    {
        Node node = new Node(data);
        if(head==null)
        {
            head = node;
            return;
        }
        
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = node;
    }
    
    public void insertAtPosition(int data, int position)
    {
        Node newNode = new Node(data);
        if(position==1)
        {
            newNode.next = head;
            head = newNode;
            return;
        }
        
        Node temp = head;
        for(int i=1;i<position-1 && temp!=null;i++)//step 3: traverse to position -1 node
        {
            temp = temp.next;
        }
        if(temp==null)
        {
            System.out.println("Position out of bounds");
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    
    
    void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }
}
