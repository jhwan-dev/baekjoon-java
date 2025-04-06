package BOJ.Phase3;
import java.util.Scanner;
public class Phase3_005_v1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int a = (N-4)/4;

        for(int i = 0; i<a; i++) {
            System.out.print("long ");
        }
        System.out.print("long int");
    }
}
