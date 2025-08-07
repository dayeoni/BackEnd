package lgcns;

public class Car {
    // 클래스의 구성 요소
    // 인스턴스 소유(변수 + 메서드) + 생성자(new 연산자 뒤에서만 호출)

    public String maker, model;
    public int price;

    // 메서드 1
    public void drive() {
        System.out.println("매개변수 없고 반환타입이 없다");
    }

    // 메서드 2
    public String repair() {
        System.out.println("매개변수 없고 반환타입이 문자열");
        return "차량이 수리되었습니다.";
    }

    // 메서드 3
    public void performance(String fuel) {
        System.out.println("매개변수로 문자열을 전달받고 반환타입이 없다");
        System.out.println(fuel+ "로 성능이 향상되었습니다.");
    }

    // 메서드 4
    public String speed(int speed) {
        System.out.println("매개변수가 정수형이고 반환타입이 문자열");
        System.out.println("당신의 스피드 : "+speed);
        return "과속중입니다.";
    }

    // 기본 생성자 
    public Car() {

    }
}
