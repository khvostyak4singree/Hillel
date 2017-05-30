import java.util.Arrays;

/**
 * Created by hillel on 30.05.17.
 */
public class Pair {
    public static void main(String[] args) {
        int[] ar = { 10, 5, 5, 60, 12, 40, 11, 3, 25, 15, 14, 1 };
        int x = 8;

        boolean ris = findSumSort(ar, x);
        System.out.println("Found: " + ris);
    }

    public static boolean findSumSort(int[] a, int x) {
        Arrays.sort(a); // quicksort
        for (int i = 0, k = a.length - 1; i < k;) {
            int tmp = a[i] + a[k];
            System.out.println(a[i] + " + " + a[k] + " = " + tmp);
            if (tmp == x)
                return true;
            else if (tmp < x) {
                System.out.println(tmp + " < " + x);
                i++;
            }
            else {
                System.out.println(tmp + " > " + x);
                k--;
            }
        }
        return false;
    }
}



