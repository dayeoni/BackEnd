package lgcns.inspire.abstraction;

import lgcns.inspire.abstraction.inter.TV;

public class SamsungTV implements TV{
    
    @Override
    public void powerOn() {
        System.out.println("SAMSUNG TV 전원을 켜다.");
    }
}
