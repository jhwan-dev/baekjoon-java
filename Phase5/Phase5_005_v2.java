package BOJ.Phase5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Phase5_005_v2 {
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;

        for (int i = 0; i<N; i++) {
            sum += s.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
