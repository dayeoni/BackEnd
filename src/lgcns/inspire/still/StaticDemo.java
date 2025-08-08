package lgcns.inspire.still;

public class StaticDemo {
    
    /*
    static keyword (변수, 메서드, 내부클래스에 사용 가능)
        - 인스턴스 소유가 아닌 클래스 소유 !!!

    final keyword (변수, 메서드, 클래스에 사용 가능)
        - 변수에 정의되면? 상수가 됨
        -public static final int CONSTVAR = 10; 상수정의 방법(대문자, 초기값)
    */
    public int nonStaticVar ; //변수생성
    public static int staticVar ; //변수 생성

    public static final int CONSTVAR = 10; //상수

    public void nonStaticMethod() {
        System.out.println(">>> nonStaticMethod");
        nonStaticVar = 10;
        staticVar = 10;
        int sum = nonStaticVar + staticVar;
        System.out.println(">>> sum :"+sum);
    }
    public static void staticMethod() {
        System.out.println(">>> staticMethod");
        //nonStaticVar = 10;
        staticVar = 10;
        //int sum = nonStaticVar + staticVar;
        int sum = staticVar;
        System.out.println(">>> sum :"+sum);
    }

}
