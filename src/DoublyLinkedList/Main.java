package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<String> dlist =new DoublyLinkedList<String>();
        dlist.addFirst("Maria");
        dlist.addFirst("Tasneem");
        dlist.addLast("Bushra");
        dlist.addLast("Alanond");
        dlist.removeFirst();
        dlist.removeLast();
        dlist.display();





    }
}
