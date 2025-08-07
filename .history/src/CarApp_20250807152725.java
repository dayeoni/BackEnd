import lgcns.Car;

public class CarApp {
    
    public static void main(String[] args) {
        /*
        Quiz
        - 여러분의 드림카를 만들어보세요
        - 객체생성 후 maker, model, price 접근하여 드림카를 만들고
        - 인스턴스 소유의 메서드를 호출해 본다면?
        */

        Car dream = new Car();
        dream.maker = "볼보";
        dream.model = "SUV";
        dream.price = 30000;
        System.out.println(dream.maker);
        System.out.println(dream.model);
        System.out.println(dream.price);



    }
}
