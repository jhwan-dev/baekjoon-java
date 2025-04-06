package BOJ.Phase4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Phase4_002_v3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," "); //N과 X저장

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine()," "); //배열 저장

        for (int i = 0; i<N; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (value < X) {
                sb.append(value).append(" ");
            }
        }
        System.out.println(sb);
    }
}
