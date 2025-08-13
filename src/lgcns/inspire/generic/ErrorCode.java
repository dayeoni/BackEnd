package lgcns.inspire.generic;

public class ErrorCode<T> {
    
    private T code; // 타입: T ->GenericApp.java에서 Integer로 설정

    public void setCode(T code) {
        this.code = code;
    }

    public T getCode() {
        return code;
    }
}
