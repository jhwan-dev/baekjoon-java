package BOJ.Phase5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Phase5_003_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i<T; i++) {
            String s = br.readLine();
            String start = s.substring(0,1);
            String last = s.substring(s.length() - 1);
            System.out.println(start + last);
        }
    }
}
