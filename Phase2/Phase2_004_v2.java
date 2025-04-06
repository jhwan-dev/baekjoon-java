package BOJ.Phase2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Phase2_004_v2 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        System.out.println((x>0)?((y>0)?"1":"4"):((y>0)?"2":"3"));
    }
}
