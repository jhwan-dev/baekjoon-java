package BOJ.Phase4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Phase4_007_v2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[31];

        for (int i = 1; i<=28; i++) {
            int I = Integer.parseInt(br.readLine());
            arr[I]++;
        }
        for (int j = 1; j<=30; j++) {
            if (arr[j] == 0) {
                System.out.println(j);
            }
        }
        br.close();
    }
}
