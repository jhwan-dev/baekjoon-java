package BOJ.Phase2;
//BufferedReader 사용
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*문자열을 구분자를 이용하여 분리할 때 사용
1. 띄어쓰기 기준으로 문자열을 분리
StringTokenizer st = new StringTokenizer(문자열);
2. 구분자를 기준으로 문자열을 분리
StringTokenizer st = new StringTokenizer(문자열, 구분자);
3. 구분자를 기준으로 문자열을 분리할 때 구분자도 토큰으로 넣는다. (true)
* 구분자를 분리된 문자열 토큰에 포함 시키지 않는다. (false)
* (디폴트 : false)
 */
public class Phase2_001_v3 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));
    }
}

/*
굳이 String 변수 생성 안하고 입력과 동시에 구분자로 분리해줘도 된다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new String Tokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));

 */
