/**
 * Created by mave on 22/06/2017.
 */
import java.util.Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int[] input = {12, 34, 45, 9, 8, 90, 3};
        int low = 0;
        int high = 6;
        int temp = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[low] % 2 == 0){
                low ++;
            } else if (input[high] % 2 == 1){
                high --;
            }
            temp = input[low];
            input[low] = input[high];
            input[high] = temp;
            }
        System.out.println(Arrays.toString(input));

    }
}
