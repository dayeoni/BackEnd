import lgcns.inspire.loop.LoopDemo;

public class LoopApp {
    public static void main(String[] args) {
        LoopDemo app = new LoopDemo(); //객체 생성
        int sum = app.sumOneToTen(1,10); // 반환
        System.out.println("sum = "+sum); // 출력
    }
}
