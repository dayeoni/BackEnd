import lgcns.Student;
import lgcns.inspire.inheritance.PersonDTO;
import lgcns.inspire.inheritance.sub.StudentDTO;
import lgcns.inspire.inheritance.sub.TeacherDTO;

public class InheritanceApp {
    public static void main(String[] args) {
        
        // // 강사객체를 생성하고 싶다면?
        // PersonDTO tea = PersonDTO.builder()
        //                     .name("임섭순")
        //                     .age(20)
        //                     .address("서울")
        //                     .subject("자바")
        //                     .build() ;
        // System.out.println(">>> tea : "+tea);
        // // 학생객체를 생성하고 싶다면?
        // PersonDTO stu = PersonDTO.builder()
        //                     .name("이현진")
        //                     .age(24)
        //                     .address("서울")
        //                     .stuId("2025")
        //                     .build() ;
        // System.out.println(">>> stu : "+stu);

        //Teacher instance
        TeacherDTO tea = TeacherDTO.builder()
                             .name("정다연")
                             .age(25)
                             .address("서울")
                             .subject("자바")
                             .build() ;
        //Student instance
        StudentDTO stu = StudentDTO.builder()
                             .name("정다연")
                             .age(25)
                             .address("서울")
                             .stuId("2025")
                             .build() ;
        
        // TeacherDTO [] teaAry = new TeacherDTO[10]; // 생성된 인스턴스를 위해 배열 생성.관리
        // teaAry[0] = tea;

        // StudentDTO [] stuAry = new StudentDTO[10];
        // stuAry[0] = stu;

        // 다형성 (polymorphism)
        // PersonDTO tea = new TeacherDTO() ; //부모의 데이터 타입으로 자식의 객체 생성 가능
        // PersonDTO stu = new StudentDTO() ;

        PersonDTO [] perAry = new PersonDTO[10]; // Person 객체가 아니라 배열 객체를 만들고, 타입을 PersonDTO로 설정한 것
        perAry[0] = tea; // 상속관계에서 sub만 적힐 수 있음. upCasting
        perAry[1] = stu; // upCasting

        // instanceof 연산자: 런타임 시점에 타입체크해주는 논리연산자
        for(int idx=0; idx < perAry.length; idx++){

            PersonDTO per = perAry[idx];

            // if(per == null){
            //     break;
            // }else if(per instanceof TeacherDTO){
            //     System.out.println(((TeacherDTO)per).teaInfo());
            // }else if(per instanceof StudentDTO){
            //     System.out.println(((StudentDTO)per).stuInfo());
            // }

            if (per == null) {
                break;
            } else {
                System.out.println(per.perInfo());
            }
        } 
    }

    
}
