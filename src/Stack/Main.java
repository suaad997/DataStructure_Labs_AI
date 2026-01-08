package Stack;

public class Main {
    public static void main(String[] args) {
        DLinkedStack<Integer> lStack=new DLinkedStack<Integer>();
        ArrayStack<Integer> aStack=new ArrayStack<Integer>(5);
        aStack.push(10);
        aStack.push(20);
        aStack.push(30);
        aStack.push(40);
        aStack.push(50);
        aStack.push(60);
        System.out.println("top is :"+aStack.top());
        aStack.display();
//        lStack.push(10);
//        lStack.push(20);
//        lStack.push(30);
//        lStack.push(40);
//        lStack.push(50);
//        System.out.println("the top is ="+lStack.top());
        //lStack.display();
//
//        while (!lStack.isEmpty()){
//            System.out.println("element removed :"+lStack.pop());
//        }
//
//
//
    }
}
