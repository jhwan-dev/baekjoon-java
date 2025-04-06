package BOJ.Phase3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Phase3_001_v2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i = 1;i<10;i++){
            System.out.println(a + " * " + i + " = " + (a*i));
        }
    }
}
