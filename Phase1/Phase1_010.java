package BOJ.Phase1;
import java.util.Scanner;
public class Phase1_010 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        String B = in.next();

        in.close();

        System.out.println(A * (B.charAt(2) - '0'));
        /*
        charAt()은 문자열의 인덱스 위치에 있는 문자(Character) 값을 반환한다.
        예시) String str = "abcdef"
        System.out.println((str.charAt(3))
        d
        char값은 아스키코드를 사용하기 때문에 - '0'을 하지 않으면 아스키 코드 값이 나옴
        따라서 내가 원하는 값을 받기 위해서는 - '0' 가 필수
         */
        System.out.println(A * (B.charAt(1) - '0'));
        System.out.println(A * (B.charAt(0) - '0'));
        System.out.println(A * Integer.parseInt(B));
        /*
        B가 String 타입이기 때문에 곱하기 위해서는 정수형으로 변환이 필요하다.
        정수형으로의 변환은 Integer.parseInt();를 사용한다
        나머지 예시로는
        Byte.parseByte();
        Short.parseShort();
        Integer.parseInt();
        Long.parseLong();
        Float.parseFloat();
        Double.parseDouble();
         */


    }
}
