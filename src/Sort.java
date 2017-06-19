/**
 * Created by mave on 19/06/2017.
 */
public class Sort {

    /* Bubble Sort function */
    public void BubbleSort( int List[])
    {
        int temp;
        int size = List.length;
        for (int i = 0; i < (size - 1); i++)
        {
            for(int j=0; j< (size -(i+1)); j++)
            {
                if (List[j]> List[j+1])
                {
                    temp = List[j];
                    List[j]= List[j+1];
                    List[j+1] = temp;
                }
            }

        }
    }


    /* Insertion Sort function */
    public void insertionSort(int a[])
    {
        int size = a.length;

        for(int i=1; i<size; i++)
        {
            int  index = a[i];
            int j = i-1;
            while(index < a[j])
            {
                a[j+1]= a[j];
                a[j] = index;
                j--;
                if(j< 0)
                    break;
            }
        }
    }


    /* Merge Sort function */
    public static void mergSort(int[] a, int low, int high)
    {
        int N = high - low;
        if (N <= 1)
            return;
        int mid = low + N/2;
        // recursively sort
        mergSort(a, low, mid);
        mergSort(a, mid, high);
        // merge two sorted subarrays
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++)
        {
            if (i == mid)
                temp[k] = a[j++];
            else if (j == high)
                temp[k] = a[i++];
            else if (a[j]<a[i])
                temp[k] = a[j++];
            else
                temp[k] = a[i++];
        }
        for (int k = 0; k < N; k++)
            a[low + k] = temp[k];
    }

    public void quickSort(int[] numbers, int low, int high, Sort sorter) {
        int i = low, j = high;
        int pivot = numbers[low + (high - low) / 2];

        while (i <= j) {

            while (numbers[i] < pivot) {
                i++;
            }

            while (numbers[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            sorter.quickSort(numbers, low, j, sorter);
        if (i < high)
            sorter.quickSort(numbers, i, high, sorter);
    }
}

