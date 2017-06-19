/**
 * Created by mave on 19/06/2017.
 */

import java.util.Random;


public class Sort_Tester {


    public static void main(String[] args)
    {
        long start;
        long end;
        long elapsedTime;

        java.util.Random random = new java.util.Random();

        int [] arr = new int [100000];

        for (int i = 0; i < 100000; i++){
            arr[i] = random.nextInt(50);
        }


        Sort x = new Sort();

        start = System.nanoTime();
        x.BubbleSort(arr);

        end = System.nanoTime();
        elapsedTime = end - start;
        System.out.println("The process took approximately: " + elapsedTime/10000000 + " miliseconds");

        // x.BubbleSort(arr);

        // x.insertionSort(arr);

        // x.mergSort(arr, 0, 100000);

        printArray(arr);


    }

    static void printArray(int a[])
    {   // prints the array

        for(int i=0; i<a.length;i++)
            System.out.println(a[i]);

    }


}
