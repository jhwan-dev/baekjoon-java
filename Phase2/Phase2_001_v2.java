//삼항연산자 사용

package BOJ.Phase2;
import java.util.Scanner;
public class Phase2_001_v2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        in.close();

        String str = (A>B) ? ">" : ((A<B) ? "<" : "==");
        System.out.println(str);
    }
}
