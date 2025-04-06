package BOJ.Phase4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Phase4_008_v1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[42]; //나머지는 0~41까지 나오므로 길이가 42인 boolean 배열 생성;

        for (int i = 0; i<10; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }

        int count = 0;

        for (boolean value : arr) {
            if(value) { // value 가 true 라면
                count ++;
            }
        }

        System.out.println(count);
    }
}
