package BOJ.Phase4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Phase4_010_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        double sum = 0;
        double avr;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //이 시점에서 입력을 받아야 한다. BufferedReader 와 같이 선언하면 N을 받을 때 오류 발생
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        double max = arr[0];
        for (int j = 1; j < N; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        for (int k = 0; k < N; k++) {
            sum += arr[k] / max * 100;
        }
        avr = sum / N;
        System.out.println(avr);
    }
}
