package lgcns.inspire.loop;

public class LoopDemo {
    /*
    배열 또는 Collection(List, Set, Map)
    반복구문 : for, while ~, do ~ while
    - for : 반복횟수가 정의되어 있을 때
    for(초기식 ; 조건식 ; 증감식) {
    
    }
    - while, do ~ while : 반복횟수가 정의되어 있지 않고 어떤 상황이 올 때까지 반복

    - while : 한번도 반복구문을 수행하지 않을 수 있는 상황 존재
    초기식 ;
    while(조건식) {
        statement ;
        증감식 ;
    }
    - do ~ while : 무조건 한번은 반복구문을 수행
    초기식 ;
    do {
        statement ;
        증감식 ;    
    } while(조건식)

    Stream API
    - lambda expression
    - 4가지 함수형 (Suppllier, Consumer, Function, Predicate) 인터페이스
    */

    // 메서드 생성
    public int sumOneToTen(int startIdx, int endIdx) {
        int sum = 0;
        for (int idx= startIdx ; idx <=endIdx ; idx++){
            sum += idx;
        }
        return sum;
        
    }

}
