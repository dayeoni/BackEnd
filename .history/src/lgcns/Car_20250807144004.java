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
        return "";
    }

}
