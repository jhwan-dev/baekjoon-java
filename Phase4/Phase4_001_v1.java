package BOJ.Phase4;
import java.util.Scanner;
public class Phase4_001_v1 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i<N; i++) {
            arr[i] = in.nextInt();
        }


        int A = in.nextInt();
        int count = 0;

        for (int i = 0; i<N; i++) {
            if (A==arr[i]) {
                count += 1;
            }
        }
        in.close();
        System.out.println(count);
    }
}
