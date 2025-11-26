package Arrays;

import java.util.Scanner;

public class Arrayss {
    Scanner scanner =new Scanner(System.in);

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


    public void input(int[]a){
        System.out.println("enter "+a.length+" numbers:");

        for (int i =0; i<a.length;i++)
            a[i]=scanner.nextInt();

    }
    public  void update(int []a, int index, int nvalue){
        if(index <0 || index >=a.length)
            System.out.println("Index not found");
        else
        a[index]=nvalue;
    }
    public  void delete(int []a, int index){
        if(index <0 || index >=a.length)
            System.out.println("Index not found");
        else
            a[index]=0;
    }

    public void shiftLeft_Delete(int[]a,int index){
         for(int i=index; i<a.length-1;i++){
            a[i]=a[i+1];
    }
        a[a.length-1]=Integer.MIN_VALUE;

    }


    public int LinearSearch(int []a, int svalue){
        for (int i=0; i<a.length;i++)
            if(svalue==a[i])
                return i;

       return -1;
    }
}
