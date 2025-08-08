import lgcns.inspire.loop.LoopDemo;

public class LoopApp {
    public static void main(String[] args) {
        LoopDemo app = new LoopDemo(); //객체 생성
        int sum = app.sumOneToTen(10,100); // 반환+파라미터 값 전달
        System.out.println("sum = "+sum); // 출력

        app.sumRandom();

        System.out.println();
        app.loopBreak(100);

        System.out.println();
        app.popStr("jslim");
    }
}
