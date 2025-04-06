package BOJ.Phase5;
import java.util.Scanner;
public class Phase5_003_v1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i<T; i++) {
            String s = in.next();
            String first = s.substring(0,1);
            String last = s.substring(s.length() - 1);
            System.out.println(first + last);
        }
    }
}
/*
substring(start, end) 메서드는 문자열에서 start 인덱스부터 end-1 인덱스까지의 부분 문자열을 반환한다.
오버로딩되어 있어서 substring(start)처럼 사용할 경우, start 부터 문자열 끝까지를 반환한다.
 */
