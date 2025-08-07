
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
        Teacher tea02 = new Teacher(name:"jslim",height:177.6, age:20, mbti:"isfj", birthplace:"광주", isMarriage:true);
    }
}
