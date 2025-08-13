package lgcns.inspire.inheritance.service;

import lgcns.inspire.inheritance.PersonDTO;
import lgcns.inspire.inheritance.sub.StudentDTO;
import lgcns.inspire.inheritance.sub.TeacherDTO;
import lgcns.inspire.inheritance.util.Division;

/*
XXServiceImpl이란 비지니스 로직을 담당하는 객체
- Tea, stu 인스턴스 생성 및 배열 관리하는 역할
- 프론트 쪽에 데이터 전달(=관리하고 있는 배열 전달)
- 프론트 쪽에서 찾기 요청받으면 객체 전달 
*/

public class OopServiceImpl implements OopService{
    private PersonDTO [] ary;
    private int idx;

    public OopServiceImpl() {
        ary = new PersonDTO[10];

    }

    @Override
    public void setMakePer(Division division, String name, int age, String address, String comm) {  
        switch (division.getDivision()) {
            case "학생" :
                StudentDTO stu = StudentDTO.builder()
                                    .name(name)
                                    .age(age)
                                    .address(address)
                                    .stuId(comm)
                                    .build();
                setPer(stu); //매개변수의 다형성
                break;
            case "강사" :
                TeacherDTO tea = TeacherDTO.builder()
                                    .name(name)
                                    .age(age)
                                    .address(address)
                                    .subject(comm)
                                    .build();
                setPer(tea);
                break;
            
        }
    }

    @Override
    public PersonDTO getFindPer(String name) {
        // 있는지 없는지 스캔해보기 by 반복문
        for(PersonDTO data : ary){
            if (data != null && data.getName().equals(name)) {
                return data;
            }
        }
        return null;
    }

    @Override
    public PersonDTO[] getAryPer() {
        return ary;
    }

    private void setPer(PersonDTO per) {
        ary[idx++] = per;
    }

}
