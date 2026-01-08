package Stack;

public class ArrayStack<E> implements Stack<E> {
   private E arr[];
   private static final int CAPICITY=1000;
   private int t=-1;

    public ArrayStack(int c) {
        arr=(E[])new Object[c];

    }
    public ArrayStack() {
        this(CAPICITY);
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public void push(E data) {
        if(size()==arr.length){
//            System.out.println("Cant add, Stack is full");
//            return;
            throw new IllegalStateException("Can't add, Stack is full");
        }
        else {
            arr[++t]=data;
        }

    }

    @Override
    public E top() {
        if (isEmpty())return null;
        return arr[t];
    }

    @Override
    public E pop() {
        if (isEmpty())return null;
        E delete=arr[t];
        arr[t]=null;
        t--;
        return delete;
    }

    public void display(){
        for(int i=t; i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
