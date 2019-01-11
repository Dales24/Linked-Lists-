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

    public class DoublyLinkedList<E> {

  public class Node<E> {
    private E element;
    private Node <E> next; 
     private Node <E> prev; 
    public Node(E e, Node<E> n,Node<E> p){
        element= e;
          next= n;
          prev=p;
    }
    public E getElement(){ 
        return element;
        
    }
    public Node<E> getNext(){
        return next;
        
    }
    public Node<E> getPrev(){
        return prev;
    }
            
    public void setNext(Node<E> n){
        next= n; 
    
    }
     public void setPrev(Node<E> p){
        prev= p; 
     }     
}
  private Node<E> header;                  

 
 // private Node<E> trailer;                  

 private int size = 0;                 

  
  public DoublyLinkedList() {
    header = new Node<>(null, null, null);    
    ///trailer = new Node<>(null, header, null);   
   //header.setNext(trailer);                 
  }

 
  public int size() { return size; }

 
  public boolean isEmpty() { return size == 0; }

  public E first() {
    if (isEmpty()) return null;
    return header.getNext().getElement();   
  }

 
  public E last() {
    if (isEmpty()) return null;
    return header.getPrev().getElement();   
  }

  public void addFirst(E e) {
    addBetween(e, header, header.getNext());   
  }

  public void addLast(E e) {
    addBetween(e, header.getPrev(), header); 
  }

 
  public E removeFirst() {
    if (isEmpty()) return null;             
    return remove(header.getNext());             
  }

 
  public E removeLast() {
    if (isEmpty()) return null;               
    return remove(header.getPrev());            
  }

  private void addBetween(E e, Node<E> predecessor, Node<E> successor) {

   Node<E> newest = new Node<>(e, predecessor, successor);
    predecessor.setNext(newest);
    successor.setPrev(newest);
    size++;
  }

  private E remove(Node<E> node) {
    Node<E> predecessor = node.getPrev();
    Node<E> successor = node.getNext();
    predecessor.setNext(successor);
    successor.setPrev(predecessor);
    size--;
    return node.getElement();
  }
public String toString() {
       StringBuilder builder = new StringBuilder();
        Node node = header; 
        for(int i = 0; i < size ; i++){
            builder.append(node.getElement().toString());
            node = node.getNext();
        }
        return builder.toString();
     }
    }



 


