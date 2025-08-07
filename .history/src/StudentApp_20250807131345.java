import lgcns.Student;

public class StudentApp {
    public static void main(String[] args) {
        Student instance = new Student();
        System.out.println("[debug] >>> "+instance);
        instance.name="이현진";
        instance.gender='M';


    }
}
