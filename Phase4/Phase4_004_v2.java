package BOJ.Phase4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Phase4_004_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        int count = 0;
        int max = 0;
        int index = 0;

        for (int i = 0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int value : arr) {
            count++;
            if (value > max) {
                max = value;
                index = count;

            }
        }
        System.out.println(max);
        System.out.println(index);

    }
}
