import java.util.*;

public class Tree {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = -1; j < height; j++) {
                if (height - i - 3 < j) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
                // I did not manage to correctly display the second half of the ladder!((
                for (int k = 0; k < height; k++) {
                    for (int x = -1; x < height; x++)
                        if (i <= x) {
                            System.out.print("#");
                        } else {
                            System.out.print(" ");
                        }


            }
            System.out.println();
        }
    }
}






