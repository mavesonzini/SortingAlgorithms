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




        for (int i = 1000; i < 160000; i = i + 10000) {

            int [] arr = new int [i];

            for (int j = 0; j < i; j++){
                arr[j] = random.nextInt(200);
            }

            int[] bubbleSortArray = arr.clone();
            int[] insertionSortArray = arr.clone();
            int[] mergeSortArray = arr.clone();
            int[] quickSortArray = arr.clone();

            Sort x = new Sort();

            start = System.nanoTime();
            x.BubbleSort(bubbleSortArray);
            end = System.nanoTime();
            elapsedTime = end - start;
            printArray(bubbleSortArray);
            System.out.println("Bubble sort took approximately: " + elapsedTime / 1000000 + " miliseconds");
            fileWriter.append("Bubble Sort took approximately: " + elapsedTime / 1000000 + " miliseconds with " + i);

            start = System.nanoTime();
            x.insertionSort(insertionSortArray);
            end = System.nanoTime();
            elapsedTime = end - start;
            printArray(insertionSortArray);
            System.out.println("Insertion sort took approximately: " + elapsedTime / 1000000 + " miliseconds");
            fileWriter.append("\n");
            fileWriter.append("Insertion Sort took approximately: " + elapsedTime / 1000000 + " miliseconds with " + i);

            start = System.nanoTime();
            x.mergSort(mergeSortArray, 0, mergeSortArray.length - 1);
            end = System.nanoTime();
            elapsedTime = end - start;
            printArray(mergeSortArray);
            System.out.println("Merge sort took approximately: " + elapsedTime / 1000000 + " miliseconds");
            fileWriter.append("\n");
            fileWriter.append("Merge Sort took approximately: " + elapsedTime / 1000000 + " miliseconds with " + i);

            start = System.nanoTime();
            x.quickSort(quickSortArray, 0, quickSortArray.length - 1, x);
            end = System.nanoTime();
            elapsedTime = end - start;
            printArray(quickSortArray);
            System.out.println("Quick sort took approximately: " + elapsedTime / 1000000 + " miliseconds");
            fileWriter.append("\n");
            fileWriter.append("Quick sort took approximately: " + elapsedTime / 1000000 + " miliseconds with " + i);
            fileWriter.append("\n");
        }

        fileWriter.flush();
        fileWriter.close();
    }

    static void printArray(int a[]) {

        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}
