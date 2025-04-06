package BOJ.Phase3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Phase3_002_v2 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        /*String 객체는 불변이기 때문에 객체에 변화가 필요할 때는 StringBuilder를 주로 사용한다.
        주요 메소드로는 append(String s) - 문자열을 추가 insert(int offset, String s) - 특정 위치에 문자열 삽입
        replace(int start, int end, String s) - 특정 구간의 문자열을 변경 이때 변경 범위는 start~end-1
        delete(int start, int end) - 특정 구간의 문자열 삭제
        reverse() 문자열을 뒤집음 toString() - StringBuilder 객체를 String으로 변환
         */

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append('\n');
        }

        System.out.println(sb);
    }
}