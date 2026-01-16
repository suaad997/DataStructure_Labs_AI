package Tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree btree=new BinaryTree(10);

        btree.insertNode(12);
        btree.insertNode(8);
        btree.insertNode(14);
        btree.insertNode(2);
        //System.out.println(  btree.serachNode(8));
        btree.preorder();






    }
}
