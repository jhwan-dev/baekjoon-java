package BOJ.Phase1;
import java.util.Scanner;
public class Phase1_011 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        long A = in.nextLong();
        long B = in.nextLong();
        long C = in.nextLong();
        //int 형으로 제출하면 A,B,C의 범위(1 ≤ A, B, C ≤ 10¹²)에서 벗어나기 때문에 런타임에러 발생


        in.close();

        System.out.println(A+B+C);
    }
}
