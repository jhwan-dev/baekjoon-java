package BOJ.Phase5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Phase5_005_v3 {
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        int sum = 0;

        for (byte value : br.readLine().getBytes()) {
            sum += (value - '0');
        }
        System.out.println(sum);
    }
}
/*
getBytes() 메소드는 String (문자열) 에 대하여 해당 문자열을 하나의 byte 배열로 변환해준다.
 */
