package BOJ.Phase5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Phase5_001_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int i = Integer.parseInt(br.readLine()) - 1;
        System.out.println(S.charAt(i));
    }
}
