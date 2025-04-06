package BOJ.Phase2;
/*BufferedReader 사용 + br.readLine()을 통해 읽어온것을 split(" ")하여 공백 단위로 나눠준 뒤
String 배열에 각각 저장하는 방법이다.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Phase2_001_v4 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);

        System.out.println((A>B) ? ">" : ((A<B) ? "<" : "=="));

    }
}
