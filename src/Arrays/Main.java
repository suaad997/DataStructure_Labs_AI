package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
Arrayss arr= new Arrayss();
        int []numbers2=new int[5];


        System.out.println("enter "+numbers2.length+" numbers:");
        for (int i =0; i<numbers2.length;i++)
        numbers2[i]=scanner.nextInt();

       // int []numbers={1,2,3,4,5,6,7};
        arr.Traversal(numbers2);
       // arr.R_Traversal(numbers);


        //System.out.println(Arrays.toString(numbers2));










}

}
