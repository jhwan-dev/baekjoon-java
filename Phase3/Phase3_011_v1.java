package BOJ.Phase3;
import java.util.Scanner;
public class Phase3_011_v1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            int A = in.nextInt();
            int B = in.nextInt();

            if (A == 0 && B == 0) {
                break;
            }

            System.out.println(A+B);
        }
    }
}
