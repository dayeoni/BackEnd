package lgcns.inspire.factory;

import lgcns.inspire.abstraction.LgTV;
import lgcns.inspire.abstraction.SamsungTV;
import lgcns.inspire.abstraction.inter.TV;

public class BeanFactory {
    
    private static BeanFactory instance; //static 변수 생성
    private TV [] ary; // 배열객체선언O 생성X
    
    private BeanFactory(){
        ary = new TV[2]; //배열객체생성O
        ary[0] = new SamsungTV();
        ary[1] = new LgTV();
    }

    public static BeanFactory getInstance() {
        if(instance == null) {
            instance = new BeanFactory();

        }
        return instance;
    }
    public TV getBrand(String brand) {
        return (brand.equals("samsung")) ? ary[0]: ary[1];
    }
}
