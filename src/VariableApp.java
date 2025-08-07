public class VariableApp {
    
    public static void main(String[] args) {
        // 변수 선언 및 값 할당
        int age = 20;
        double height = 177.5;
        char gender = 'M';
        String name = "jslim";
        boolean isMarriage = true;

        // 변수를 사용해서 출력
        System.out.println(age);
        System.out.println(height);
        System.out.println(gender);
        System.out.println(name);
        System.out.println(isMarriage);

        // casting (), upCasting(자동), downCasting(연산자를 이용해서 강제로)
        // (타입)변수명 ;
        byte x = 10, y = 10, sum = 0;
        sum = (byte)(x + y) ;
        System.out.println("연산된 결과는 : "+sum);

        char charVar01 = 'A', charVar02 = 'B';
        System.out.println(charVar01);
        System.out.println(charVar01 + charVar02);
        System.out.println(97);
        System.out.println((char)97);

    }
}
