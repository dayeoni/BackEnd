
import lgcns.Teacher;

public class TeacherApp {
    
    public static void main(String[] args) {
        Teacher tea01 = new Teacher(); // 기본 생성자 호출
        System.out.println(tea01.name);
        System.out.println(tea01.height);
        System.out.println(tea01.age);
        System.out.println(tea01.mbti);
        System.out.println(tea01.birthplace);
        System.out.println(tea01.isMarriage);
        ///
        Teacher tea02 = new Teacher("jslim", 177.6, 20, "isfj", "광주", true);
        System.out.println(tea02.name);
        System.out.println(tea02.height);
        System.out.println(tea02.age);
        System.out.println(tea02.mbti);
        System.out.println(tea02.birthplace);
        System.out.println(tea02.isMarriage);
    }
}
