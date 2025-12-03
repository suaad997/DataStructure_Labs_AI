package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Arrayss arr= new Arrayss();
       int []numbers={9,2,3,8,5,6,7,1};
       Arrays.sort(numbers);
       arr.Traversal(numbers);
        arr.LinearSearch(numbers,5);
        int result= arr.LinearSearch(numbers,10);
        int result2= arr.binarySearch(numbers,9,0,numbers.length-1);

//        if(result!=-1)
//        System.out.println("value found at index :"+result);
//        else
//            System.out.println("value not found");
        if(result2!=-1)
            System.out.println("value found at index :"+result2);
        else
            System.out.println("value not found");




        // int []numbers2=new int[5];
        //numbers[1]=8;
        // arr.input(numbers2);
        // arr.update(numbers,8,7);
        //arr.delete(numbers,3); //numbers[1]=8;
        //       // arr.input(numbers2);
        //       // arr.update(numbers,8,7);
        //        //arr.delete(numbers,3);       // arr.shiftLeft_Delete(numbers,3);

       // arr.Traversal(numbers);


        // arr.R_Traversal(numbers);


        //System.out.println(Arrays.toString(numbers2));










}

}
