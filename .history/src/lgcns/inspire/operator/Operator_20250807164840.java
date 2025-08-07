package lgcns.inspire.operator;

public class Operator {

    // 기본 생성자: 객체 생성 시 멤버변수의 초기화를 도와주는 like a method
    public Operator() {

    }

    // 반환값 X, 매개변수 X
    public void example01() {
        System.out.println(">>> 산술연산자 +, -, *, /, %");
        System.out.println(">>> 증감연산자 ++, --");
        System.out.println(">>> 삼항연산자 (조건식) ? true : false");
        System.out.println(">>> 논리연산자 &, |, !, &&, ||");
        System.out.println(">>> 관계연산자 >, >=, <, <=, ==, !=");

    }

    // 반환값 O, 매개변수 O
    public String example02(String str01, String str02) {
        return str01+"\t"+str02;
    }
    
}
