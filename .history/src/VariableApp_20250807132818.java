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

        // casting ()
        byte x = 10, y = 10, sum = 0;
        sum = (byte)(x + y) ;
        System.out.println("연산된 결과는 : "+sum);



    }
}
