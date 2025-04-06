package BOJ.Phase4;
import java.util.Scanner;
public class Phase4_010_v1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        double sum = 0; //변수 선언과 동시에 += 같은 연산 불가

        for (int i = 0; i<N; i++) {
            arr[i] = in.nextInt();
        }
        double max = arr[0];
        for (int j = 1; j<N; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        for (int p = 0; p<N; p++) {
            sum += arr[p] / max * 100;
        }
        double avr = sum / N;
        System.out.println(avr);
    }
}
