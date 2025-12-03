package SinglyLinkedList;

public class SinglyLinkedList<E> {
private Node<E> head=null;
private Node<E> tail=null;
private int size=0;


public int size(){
    return size;
}

public boolean isEmpty(){
    return size()==0;
}

 class Node<E> {
     private E data;
     private Node<E> next;

     public Node(E data, Node<E> next) {
         this.data = data;
         this.next = next;
     }

     public E getData() {
         return data;
     }

     public void setData(E data) {
         this.data = data;
     }

     public Node<E> getNext() {
         return next;
     }

     public void setNext(Node<E> next) {
         this.next = next;
     }
 }

}
