package lgcns.inspire.abstraction;

import lgcns.inspire.abstraction.inter.Flyer;

public class Bird extends Animal implements Flyer{

    @Override
    public void fly() {
        System.out.println("새가 날개를 이용해서 날아다닙니다.");
    }

    @Override
    public void takeOff() {
        System.out.println("새가 날아오릅니다.");
    }

    @Override
    public void landing() {
        System.out.println("새가 착지합니다.");
    }
    
    
}
