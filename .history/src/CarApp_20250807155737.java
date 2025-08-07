import lgcns.Car;

public class CarApp {
    
    public static void main(String[] args) {
        /*
        Quiz
        - 여러분의 드림카를 만들어보세요
        - 객체생성 후 maker, model, price 접근하여 드림카를 만들고
        - 인스턴스 소유의 메서드를 호출해 본다면?
        
        내가 한거
        Car dream = new Car();
        dream.maker = "볼보";
        dream.model = "SUV";
        dream.price = 30000;
        System.out.println(dream.maker);
        System.out.println(dream.model);
        System.out.println(dream.price);
        */
        Car car = new Car();
        car.setMaker("아우디");
        car.setModel("A8");
        car.setPrice(120000000);

        String carInfo = car.dreamCarInfo();
        System.out.println(carInfo);

        ////인스턴스 소유의 메서드 호출
        car.drive();

        String repaireInfo = car.repair();
        System.out.println(repaireInfo);

        car.performance("고급 휘발류");

        String speedInfo = car.speed(200);
        System.out.println(speedInfo);


    }
}
