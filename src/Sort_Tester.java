/**
 * Created by mave on 19/06/2017.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class Sort_Tester {


    public static void main(String[] args) throws IOException {
        long start;
        long end;
        long elapsedTime;

        java.util.Random random = new java.util.Random();
        FileWriter fileWriter = new FileWriter("Sort_tester.csv");

        fileWriter.append("Array length");
        fileWriter.append(", ");
        fileWriter.append("Bubble Sort");
        fileWriter.append(", ");
        fileWriter.append("Insertion Sort");
        fileWriter.append(", ");
        fileWriter.append("Merge Sort");
        fileWriter.append(", ");
        fileWriter.append("Quick Sort");
        fileWriter.append("\n");



        int [] arr = new int [100000];

        for (int i = 0; i < 100000; i++){
            arr[i] = random.nextInt(50);
        }


        int[] bubbleSortArray = arr.clone();
        int[] insertionSortArray = arr.clone();
        int[] mergeSortArray = arr.clone();
        int[] quickSortArray = arr.clone();

        Sort x = new Sort();

        start = System.nanoTime();
        x.BubbleSort(arr);
        end = System.nanoTime();
        elapsedTime = end - start;
        printArray(bubbleSortArray);
        System.out.println("Bubble sort took approximately: " + elapsedTime/10000000 + " miliseconds");
        fileWriter.append("Bubble Sort took approximately: " + elapsedTime/10000000 + " miliseconds");

        start = System.nanoTime();
        x.insertionSort(insertionSortArray);
        end = System.nanoTime();
        elapsedTime = end - start;
        printArray(insertionSortArray);
        System.out.println("Insertion sort took approximately: " + elapsedTime/10000000 + " miliseconds");
        fileWriter.append("\n");
        fileWriter.append("Insertion Sort took approximately: " + elapsedTime/10000000 + " miliseconds");

        start = System.nanoTime();
        x.mergSort(mergeSortArray, 0, mergeSortArray.length - 1);
        end = System.nanoTime();
        elapsedTime = end - start;
        printArray(mergeSortArray);
        System.out.println("Merge sort took approximately: " + elapsedTime/10000000 + " miliseconds");
        fileWriter.append("\n");
        fileWriter.append("Merge Sort took approximately: " + elapsedTime/10000000 + " miliseconds");

        start = System.nanoTime();
        x.quickSort(quickSortArray, 0, quickSortArray.length - 1, x);
        end = System.nanoTime();
        elapsedTime = end - start;
        printArray(quickSortArray);
        System.out.println("Quick sort took approximately: " + elapsedTime/10000000 + " miliseconds");
        fileWriter.append("\n");
        fileWriter.append("Quick sort took approximately: " + elapsedTime/10000000 + " miliseconds");


        fileWriter.flush();
        fileWriter.close();

    }

    static void printArray(int a[]) {   // prints the array

        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}
