package BOJ.Phase4;
import java.util.Scanner;
public class Phase4_006_v1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];
        int M = in.nextInt();
        int temp;


        for (int i = 0; i<N; i++) {
            arr[i] = i+1;
        }
        for (int j = 0; j<M; j++) {
            int I = in.nextInt() - 1;
            int J = in.nextInt() - 1;
            temp = arr[I];
            arr[I] = arr[J];
            arr[J] = temp;
        }

        for (int i = 0; i<N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
1 2 3 4 5
2 1 3 4 5
2 1 4 3 5
3 1 4 2 5
3 1 4 2 5
for (int j = 0; j<M; j++) {
            int I = in.nextInt();
            int J = in.nextInt();
            int k = arr[I];
            int p = arr[J];
            k = p;
            arr[J] = k;
        }
 */