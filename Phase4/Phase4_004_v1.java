package BOJ.Phase4;
import java.util.Scanner;
public class Phase4_004_v1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[9];
        int count = 0;
        int max = 0;
        int index = 0;

        for (int i = 0; i<9; i++) {
            arr[i] = in.nextInt();
        }

        for (int value : arr) {
            count++;
            if(value > max) {
                max = value;
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
