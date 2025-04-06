package BOJ.Phase3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Phase3_010_v2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i<=N; i++) {
            for (int j = N-1; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
