package BOJ.Phase3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Phase3_012_v2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while ( (str=br.readLine()) != null) {

            int A = str.charAt(0) - 48;
            int B = str.charAt(2) - 48;
            sb.append(A+B).append("\n");

        }
        System.out.print(sb);
        br.close();
    }
}
