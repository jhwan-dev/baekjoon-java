package BOJ.Phase3;
import java.util.Scanner;
public class phase3_003_v1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;

        for(int i=1; i<=n; i++){

            sum += i;

        }
        in.close();
        System.out.println(sum);
    }
}
