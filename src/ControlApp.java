import lgcns.inspire.control.ControlDemo;

public class ControlApp {
    
    public static void main(String[] args) {
        // ControlDemo app = new ControlDemo();
        // String result = app.woodMan(1); //반환값
        // System.out.println(result);

        // ControlDemo app = new ControlDemo();
        // String result = app.woodManSwitch(3);
        // System.out.println(result);

        // ControlDemo app = new ControlDemo();
        // String result = app.woodManTernary(3);
        // System.out.println(result);

        ControlDemo app = new ControlDemo();
        String result = app.passOrNonPass(40,40, 50);
        System.out.println(result);

    }
}
