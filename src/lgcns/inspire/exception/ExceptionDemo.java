package lgcns.inspire.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 예외 처리
public class ExceptionDemo {
    
    public void printAry(String [] ary) {
        System.out.println(">>>> ary print start");
        try {
           for(int idx=0; idx < ary.length; idx++) {
                System.out.println(ary[idx]);
            } 
            System.out.println(">>>> inner try");
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println(">>>> 예외 여부와 상관없이 수행하는 블럭");
        }
        
        System.out.println(">>>> ary print end");
    }

    public String readConsole() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("input data : ");
        String data = null;
        try {
            data = br.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return data;

    }

    public void first(int x) {
        System.out.println(">>>> first start");
        second(x);
        System.out.println(">>>> first end");
    }
    public void second(int x){
        System.out.println(">>>> second start");
        try{
            third(x);
        } catch(Exception e) {
            e.printStackTrace();
        }
       
        System.out.println(">>>> second end");
    }
    public void third(int x) throws Exception{
        System.out.println(">>>> third start");
        try {
            if(x < 0) {
                throw new Exception("양수를 입력해 주세요.");
            }
        } finally {
            System.out.println(">>>> third end");
        }
    }

}
