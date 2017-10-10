/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

/**
 *
 * @author emiaj
 */
public class Node <T> {
      Node next;
      T data;
    
    public Node(){
        next=null;
    }
    public Node(T d){
        data = d;
        next = null;
    }
    public void print(){
        System.out.println(data);
    }
    public void printS(){
        System.out.println(data);
       
    }
}
