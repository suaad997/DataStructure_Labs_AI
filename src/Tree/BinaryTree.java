package Tree;

public class BinaryTree {
  private Node root;

    public BinaryTree( int rootValue) {
        root=new Node(rootValue,null,null);

    }

private void insert(Node newnode, Node root) {
        if(newnode.getValue()>root.getValue()){
            if(root.getRight()==null)
                root.setRight(newnode);
            else {
                insert(newnode,root.right);
            }
        }
        else if(newnode.getValue()<root.getValue()){
            if(root.getLeft()==null)
                root.setLeft(newnode);
            else {
                insert(newnode,root.left);
            }
        }
        else {
            System.out.println("cant insert dulicated value");
        }

}

public void insertNode(int value){
        Node newNode=new Node(value,null,null);
        insert(newNode,root);
}


private boolean search(int value, Node root){
        if(root==null) return false;

   if(value> root.getValue())
          return   search(value,root.getRight());

   else if(value< root.getValue())
       return search(value,root.getLeft());

    else return true;
}

public boolean serachNode(int value){
        return search(value,root);
}

private void preOrderT(Node node){
        if(node==null) {
            return;
        }
    System.out.print(node.getValue()+" ");
        preOrderT(node.getLeft());
        preOrderT(node.getRight());
}
public void preorder(){
        preOrderT(root);
    System.out.println();
}





    class Node{
     private int value;
     private Node left;
     private Node right;

     public Node(int value, Node left, Node right) {
         this.value = value;
         this.left = left;
         this.right = right;
     }

     public int getValue() {
         return value;
     }

     public void setValue(int value) {
         this.value = value;
     }

     public Node getLeft() {
         return left;
     }

     public void setLeft(Node left) {
         this.left = left;
     }

     public Node getRight() {
         return right;
     }

     public void setRight(Node right) {
         this.right = right;
     }
 }



}
