package BOJ.Phase1;

public class Phase1_012 {
    public static void main(String[] args){

        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
    }
}
/*
역슬래시는 단독으로 출력이 불가능하다.(큰 따옴표도 마찬가지)
문자를 출력하려면 조합을 만들어서 사용해야한다. 이를 Escape Sequance 라고 한다.
이스케이프 시퀀스는 백슬래시(\) + 문자의 조합으로 쓰인다.
따라서 \를 출력하기 위해서는 단순하게 백슬래시를 두번 쓰면 된다. \\
 */