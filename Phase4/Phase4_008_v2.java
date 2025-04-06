package BOJ.Phase4;
import java.util.Scanner;
import java.util.HashSet;
/*
HashSet 은 자바 Collection 중 Set 의 파생 클래스이다.
set 은 집합이라고 생각하면 되는데, HashSet 의 경우 몇 가지 특징이 있다.
1. 중복되는 원소를 넣을 경우 하나만 저장한다. 즉 중복원소를 허용하지 않는다.
2. HashSet 은 순서 개념이 없다. 따라서 Collection.sort() 메소드를 사용할 수 없다.
만약 정렬을 하고 싶다면 리스트로 변환 후 정렬해야 한다.
이 문제는 나머지값에서 서로다른 개수를 세는 것이기 때문에 HashSet 을 이용하면 나머지 값은 저장되고 중복되는 나머지 값은
저장되지 않기 때문에 HashSet 의 사이즈가 서로 다른 나머지가 된다.
 */
public class Phase4_008_v2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i<10; i++) {
            h.add(in.nextInt() % 42);
            //입력받은 값의 나머지 값을 add 메소드를 통해 Hashset 에 저장
        }

        in.close();
        System.out.println(h.size());
    }
}
