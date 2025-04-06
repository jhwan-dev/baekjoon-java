package BOJ.Phase1;
import java.util.Scanner; //키보드로 입력받기 위한 방법 Scanner

public class Phase1_002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Scanner 객체명 = new Scanner(System.in);
        //Scanner 객체명으로는 주로 in, scan, sc 사용
        int A = in.nextInt();
        int B = in.nextInt();
        System.out.print(A+B);

        in.close();
    }
}
