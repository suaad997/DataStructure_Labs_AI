package DoublyLinkedList;

public class DoublyLinkedList<E> {
private Node<E> header;
private Node<E> tailer;
private int size=0;

    public DoublyLinkedList() {
        header=new Node(null,null,null);
        tailer=new Node(header,null,null);
        header.setNext(tailer);
    }
public int size() {
        return size;
 }
public boolean isEmpty() {
        return size() == 0;
    }

private void addBetween(Node<E>left, E data,Node<E>right) {
       Node<E>newNode=new Node(left,data,right) ;
       left.setNext(newNode);
       right.setPrev(newNode);
       size++;
}
public void addFirst(E data){
        addBetween(header,data,header.getNext());
}
public void addLast(E data){
        addBetween(tailer.getPrev(),data,tailer);
    }
public E getFirst(){
        if (isEmpty())return null;
        return header.getNext().getData();
}
public E getLast(){
        if (isEmpty())return null;
        return tailer.getPrev().getData();
    }
private E remove(Node<E> deletedNode){
        if(header.getNext()==tailer)return null;
        E delete =deletedNode.getData();
        Node<E> left=deletedNode.getPrev();
        Node<E> right=deletedNode.getNext();
        left.setNext(right);
        right.setPrev(left);
        size--;
        return delete;
}
public E removeFirst(){
        return remove(header.getNext());
}
public E removeLast(){
        return remove(tailer.getPrev());
    }
public void display(){

        Node<E>temp=header.getNext();
    System.out.print("null<----Header<---->");
        while (temp!=tailer){
            System.out.print(temp.getData()+"<---->");
            temp=temp.getNext();
        }    System.out.println("tailer---->null");


}

    public void display2(){

        Node<E>temp=header.getNext();
       // System.out.print("null<----Header<---->");
        while (temp!=tailer){
            System.out.println(temp.getData());
            temp=temp.getNext();
        }  //  System.out.println("tailer---->null");

    }








    class Node<E>{
    private Node<E> prev;
    private E data;
    private Node<E> next;

    public Node(Node<E> prev, E data, Node<E> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
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
