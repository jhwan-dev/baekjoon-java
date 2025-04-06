package BOJ.Phase2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Phase2_005_v2 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int H = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        if(M>=45) System.out.printf("%d %d%n", H, M-45);
        else {
            if(H>0) System.out.printf("%d %d%n", H-1, M+15);
            else if(H==0) System.out.printf("%d %d%n", 23, M+15);
        }
    }
}
