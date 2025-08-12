import lgcns.inspire.abstraction.Animal;
import lgcns.inspire.abstraction.Bird;
import lgcns.inspire.abstraction.SuperMan;

public class AbstractApp {
    public static void main(String[] args) {
        // 추상 클래스는 객체생성 불가
        //Animal animal = new Animal() ;

        // 배열객체생성으로 가능하다
        Animal [] animalAry = new Animal[2];
        animalAry[0] = new Bird();
        animalAry[1] = new SuperMan();
        for(Animal element : animalAry){
            if(element instanceof Bird) {
                ((Bird)element).fly();
            }
            if(element instanceof SuperMan){
                ((SuperMan)element).fly();
            }
        }
    }
}
