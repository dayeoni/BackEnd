import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


import lgcns.inspire.inheritance.PersonDTO;
import lgcns.inspire.inheritance.sub.StudentDTO;
import lgcns.inspire.inheritance.sub.TeacherDTO;

public class CollectionApp {
    
    public static void main(String[] args) {
        System.out.println(">>>> Array");
        int [] ary = new int[5]; //int 타입의 배열 변수 ary 생성
        ary[0] = 10;
        ary[1] = 20;
        ary[2] = 30;
        ary[3] = 40;
        ary[4] = 50;
        System.out.println(">>>> length : "+ary.length);

        ary[2] = 0; // 값 수정

        System.out.println(Arrays.toString(ary)); //문자열로 반환
                                                  // [자바 특징]클래스 이름으로 메소드에 접근: static 문법
        
        System.out.println();
        System.out.println(">>>> List");                                          

        List<Integer> list = new ArrayList<Integer>(); // 다형성
        list.add(10);        
        list.add(20 );
        list.add(10);  
        System.out.println( list.toString());
        for(int idx=0; idx < list.size(); idx++){
            Integer data = list.get(idx);
            System.out.println(">>>> data: "+data);
        }
        
        //////////////////////////////////////////////
        List<PersonDTO> perList = new ArrayList<PersonDTO>();
        //Teacher instance
        TeacherDTO tea = TeacherDTO.builder()
                             .name("정다연")
                             .age(25)
                             .address("서울")
                             .subject("자바")
                             .build() ;
        //Student instance
        StudentDTO stu = StudentDTO.builder()
                             .name("정다미")
                             .age(25)
                             .address("서울")
                             .stuId("2025")
                             .build() ;
        perList.add(tea);
        perList.add(stu);
        for(int idx=0; idx < perList.size(); idx++){
            System.out.println(perList.get(idx).perInfo());
        }

        // Set
        System.out.println();
        System.out.println(">>>> Set");
        Set<String> set = new HashSet<>();
        set.add("jslim"); set.add("inspire"); set.add("lgcns");
        System.out.println(set);

        Object [] setAry = set.toArray();
        for (Object value : setAry) {
            System.out.println(value);
        }

        // Map
        System.out.println();
        System.out.println(">>>> Map");

        Map<String, List<? extends PersonDTO>> map = new HashMap<>();

        List <StudentDTO> stuList = new ArrayList<>();
        stuList.add(stu);

        List <TeacherDTO> teaList = new ArrayList<>();
        teaList.add(tea);

        map.put("stu", stuList);
        map.put("tea", teaList);

        List<? extends PersonDTO> perTeaList = map.get("tea");
        for (PersonDTO per : perTeaList) {
            System.out.println(per.perInfo());
        }
    }
}
