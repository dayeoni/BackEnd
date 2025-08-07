package lgcns;

public class Teacher {

    public String name ;
    public double height ;
    public int age;
    public String mbti;
    public String birthplace ;
    public boolean isMarriage ;
 

    /*
    생성자: Constructor
    - like method
    - 반환타입 x, 메서드의 이름이 클래스 이름과 동일
    - 일반 메서드처럼 호출할 수 없음, 객체 생성 시 호출 가능
    - 인자없는 생성자를 기본 생성자
    - 인자있는 생성자를 스페셜 생성자
    - 여러 개의 생성자가 인자의 개수와 타입을 달리해서 정의되는 것을 생성자 오버로딩
    */

    // 기본 생성자
    public Teacher() {

    }

    // 매개변수가 있는 스페셜 생성자 (오른쪽 클릭->소스 작업->constructor 생성)
    public Teacher(String name, double height, int age, String mbti, String birthplace, boolean isMarriage) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.mbti = mbti;
        this.birthplace = birthplace;
        this.isMarriage = isMarriage;
    }   
    



}

