/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_data;
/**
 *
 * @author patrickdaley1
 */
public class SinglyLinkedList<P> {
public class Node<P> {
    private P element;
    private Node <P> next; 
    public Node(P p, Node<P> n){
        element= p;
          next= n;
          
    }
    public P getElement(){ 
        return element;
        
    }
    public Node<P> getNext(){
        return next;
        
    }
    public void setNext(Node<P> n){
        next= n; 
        
    }
}

    private Node<P> head = null;
    private Node<P> tail = null;
    private int size = 0;

    public SinglyLinkedList() { 
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
   

    public P first() {
        if (isEmpty()) 
            return null;
        
        return head.getElement();
    }

    public P last() {
        if (isEmpty()) 
            return null;
        
        return tail.getElement();
    }

    public void addFirst(P p) {
        head = new Node<>(p, head);
        if (size == 0) 
            tail = head;
        
        size++;
    }
    
    public void addLast(P p) {
        Node<P> newest = new Node<>(p, null);
        if (isEmpty()) 
            head = newest;
        else 
            tail.setNext(newest);
        
        tail = newest;
        size++;

    }

    public P removeFirst() {
        if (isEmpty()) 
            return null;
        
       P answer = head.getElement();
       head = head.getNext();
        size--;
        if (size == 0) 
            tail = null;
        
        return answer;
    }
  
            
@Override
     public String toString() {
        StringBuilder builder = new StringBuilder();
        Node node = head; 
        for(int i = 0; i < size ; i++){
            builder.append(node.getElement().toString());
            node = node.getNext();
        }
        return builder.toString();
     }
     
    
}


