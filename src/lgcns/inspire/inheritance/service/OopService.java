package lgcns.inspire.inheritance.service;

import lgcns.inspire.inheritance.PersonDTO;
import lgcns.inspire.inheritance.util.Division;

// int flag -> Division division: enum 타입으로 수정
public interface OopService {

    public void         setMakePer(Division division, String name, int age, String address, String comm);
    public PersonDTO    getFindPer(String name);
    public PersonDTO [] getAryPer();
    
    //impl spec~~
    // public void         setPer(PersonDTO per);
}
    

