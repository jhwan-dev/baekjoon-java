package BOJ.Phase1;
import java.util.Scanner;
public class Phase1_005 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        double A = in.nextDouble(); //오차범위 제한하기 위해 int가 아닌 double 사용
        double B = in.nextDouble(); //오차범위 제한하기 위해 int가 아닌 double 사용

        System.out.print(A/B);

        in.close();

    }
}
