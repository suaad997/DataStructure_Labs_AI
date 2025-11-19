package Arrays;

public class Arrayss {

    public void Traversal(int []a){
        System.out.println("The elements are:");
        for (int i =0; i<a.length;i++)
            System.out.println("Index["+i+"]=  "+a[i]);
    }




    public void R_Traversal(int []a){
        System.out.println("The elements are:");
        for (int i =a.length-1; i>=0;i--)
            System.out.println("Index["+i+"]=  "+a[i]);
    }


}
