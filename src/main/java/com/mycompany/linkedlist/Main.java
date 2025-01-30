/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedlist;

/**
 *
 * @author yogesh.dahake
 */
public class Main {
    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();
        list.insertAtBegining(10);
        list.insertAtBegining(20);
        list.insertAtBegining(30);
        list.insertAtBegining(40);
        list.insertAtEnd(5);
        list.insertAtPosition(2, 2);
        list.display();
    }
}
