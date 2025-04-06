package BOJ.Phase5;
import java.util.Scanner;
public class Phase5_005_v1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String s = in.next();
        int sum = 0;

        for (int i = 0; i<N; i++) {
            sum += s.charAt(i) - '0'; //charAt()은 해당 문자의 아스키코드 반환 -> -48 or - '0'
        }
        System.out.println(sum);
    }
}
