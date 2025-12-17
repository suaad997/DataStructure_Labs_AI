package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList<String> list=new CircularLinkedList<String>();
        list.addFirst("Tasneem");
        list.addFirst("Ahmed");
        list.addFirst("Arwa");
        list.addLast("Huda");
        list.removeFirst();
        list.removeLast();
        list.display();



    }
}
