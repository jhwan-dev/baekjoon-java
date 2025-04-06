package BOJ.Phase5;
import java.util.Scanner;
public class Phase5_001_v1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int i = in.nextInt() - 1;//charAt 은 0부터 시작
        System.out.println(S.charAt(i));
    }
}
