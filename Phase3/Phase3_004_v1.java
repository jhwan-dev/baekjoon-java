package BOJ.Phase3;
import java.util.Scanner;
public class Phase3_004_v1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int X = in.nextInt(); //총 금액
        int N = in.nextInt(); //물건의 종류 수
        int sum = 0;

        for (int i = 0; i<N; i++){
            int a = in.nextInt(); //가격
            int b = in.nextInt(); //개수

            sum += a*b;
        }
        if(sum == X) {
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
