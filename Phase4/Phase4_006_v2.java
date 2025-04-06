package BOJ.Phase4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Phase4_006_v2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int M = Integer.parseInt(st.nextToken());
        int temp;

        for (int i = 0; i<N; i++) {
            arr[i] = i + 1;
        }
        for (int j = 0; j<M; j++) {
            st = new StringTokenizer(br.readLine()," ");
            int I = Integer.parseInt(st.nextToken()) - 1;
            int J = Integer.parseInt(st.nextToken()) - 1;

            temp = arr[I];
            arr[I] = arr[J];
            arr[J] = temp;
        }
        for (int i = 0; i<N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
