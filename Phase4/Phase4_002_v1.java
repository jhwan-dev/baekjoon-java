package BOJ.Phase4;
import java.util.Scanner;
public class Phase4_002_v1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int X = in.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i<N; i++) {
            arr[i] = in.nextInt();
            if (arr[i] < X) {
                System.out.print(arr[i]+" ");
        }

        }
    }
}
