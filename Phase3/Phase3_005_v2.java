package BOJ.Phase3;
import java.io.*;
public class Phase3_005_v2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int a = (N-4)/4;

        for(int i = 0; i<a; i++) {
            System.out.print("long ");
        }
        System.out.print("long int");
    }
}
