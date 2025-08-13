import lgcns.inspire.generic.ErrorCode;

public class GenericApp {
    
    public static void main(String[] args) {
        ErrorCode<Integer> err = new ErrorCode<>(); //객체 생성 시 타입 지정
        err.setCode(400);
        System.out.println(err.getCode());

        ErrorCode<String> msg = new ErrorCode<>();
        msg.setCode("코드넘버");
        System.out.println(msg.getCode());
    }
}
