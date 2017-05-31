import java.util.Arrays;
import java.util.Collections;

public class Sort {

    public static void main(String[] args) {
       sort();
    }
    public static void sort(){
        Integer[] numbers = new Integer[]{1, 23, 3, 8, 2, 4, 4};
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(numbers));
    }
}
