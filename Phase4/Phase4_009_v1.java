package BOJ.Phase4;
import java.util.Scanner;
public class Phase4_009_v1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i<N; i++) {
            arr[i] = i + 1;
        }
        for (int j = 0; j<M; j++) {
            int I = in.nextInt() - 1;
            int J = in.nextInt() - 1;
            while (I<J) {
                int temp = arr[I];
                arr[I] = arr[J];
                arr[J] = temp;
                I++;
                J--;
            }
        }
        for (int k = 0; k<N; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
