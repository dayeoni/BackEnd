package lgcns;

import lgcns.inspire.inheritance.PersonDTO;
import lgcns.inspire.inheritance.sub.StudentDTO;
import lgcns.inspire.inheritance.sub.TeacherDTO;

public class ArgPolyApp {

    private static PersonDTO [] perAry = new PersonDTO[10];
    private static int idx = 0;
    public static void main(String[] args) {
        TeacherDTO tea = TeacherDTO.builder()
                             .name("정다연")
                             .age(25)
                             .address("서울")
                             .subject("자바")
                             .build() ;

        StudentDTO stu = StudentDTO.builder()
                             .name("정다연")
                             .age(25)
                             .address("서울")
                             .stuId("2025")
                             .build() ;

        setPerAry(tea);
        setPerAry(stu);

        printAry();
    }

    public static void setPerAry(PersonDTO element) {
        perAry[idx++] = element;
    }

    public static void printAry() {
        System.out.println(">>>>> 전체 출력");
        System.out.println();
        for(PersonDTO element : perAry) {
            if (element != null) {
                System.out.println(element.perInfo());
            }else {
                break;
            }
        }
    }

}
