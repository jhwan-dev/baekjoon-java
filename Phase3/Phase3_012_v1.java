package BOJ.Phase3;
import java.util.Scanner;
public class Phase3_012_v1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {

            int A = in.nextInt();
            int B = in.nextInt();

            System.out.println(A+B);

        }
        in.close();
    }
}
