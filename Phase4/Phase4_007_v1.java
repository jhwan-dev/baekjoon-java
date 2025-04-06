package BOJ.Phase4;
import java.util.Scanner;
public class Phase4_007_v1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[31];

        for (int i = 1; i<=28; i++) {
            int I = in.nextInt();
            arr[I]++;
        }
        for (int j = 1; j<=30; j++) {
            if (arr[j] == 0) {
                System.out.println(j);
            }
        }
        in.close();
    }
}
