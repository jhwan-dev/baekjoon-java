package BOJ.Phase4;
import java.util.Scanner;
public class Phase4_005_v1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];
        int M = in.nextInt();


        for (int t = 0; t<M; t++) {
            int I = in.nextInt();
            int J = in.nextInt();
            int K = in.nextInt();

            for(int j = I - 1; j<J; j++) {
                arr[j] = K;
            }
        }
        for(int k = 0; k<N; k++) {
            System.out.print(arr[k] + " ");
        }
        in.close();

    }
}