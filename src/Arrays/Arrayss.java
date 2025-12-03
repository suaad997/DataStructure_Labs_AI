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

    //a{1,2,3,4,5,6,7,8,9}  s=6 f=5 l=5
    public int binarySearch(int []a, int svalue, int findex, int lindex){
        while (findex<=lindex){
            int mid=(findex+lindex)/2;//5
         //   System.out.println("mid="+mid);
            if(svalue==a[mid])
                return mid;
            if(svalue>a[mid])
                findex=mid+1;
            if(svalue< a[mid])
                lindex=mid-1;
        }
      return -1;
    }
    public int binarySearch(int []a, int svalue){
        int findex=0; int lindex=a.length-1;
        while (findex<=lindex){
            int mid=(findex+lindex)/2;//5
            //   System.out.println("mid="+mid);
            if(svalue==a[mid])
                return mid;
            if(svalue>a[mid])
                findex=mid+1;
            if(svalue< a[mid])
                lindex=mid-1;
        }
        return -1;
    }
}


