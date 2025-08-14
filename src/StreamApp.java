
/*
Collection - Java Stream(코드의 가독성, 병렬처리, 유지보수 향상)
Stream API
- 원본데이터의 소스를 변경X
- 일회용(한번 사용하면 재사용 불가)
- 병렬처리(thread)로 실행속도가 빠르다
- 작업을 내부 반복으로 처리(람다식이 필요하다)
*/

/*
함수형 인터페이스
- 가질 수 있는 메서드는 딱 하나

Supplier : 매개변수 없음, 반환값만 가짐
Function : 매개변수 있음, 반환값 가짐
Consumer : 매개변수 있음, 반환값 없음
Predicate : 매개변수 있음, Boolean 반환함

람다식은 하나의 메서드를 식으로 표현하는 것
- 메서드의 이름이 없다.
- 익명 형태를 가진다. 

public String getName(){
    return "jslim";        
}

람다식)
() -> {실행문}
*/

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import lgcns.inspire.function.InspireFunction;
import lgcns.inspire.post.domain.dto.PostResponseDTO;

public class StreamApp {
    
    public static void main(String[] args) {
        InspireFunction lambdaFunc = (x,y) -> x > y ? x : y;
        System.out.println(lambdaFunc.max(100, 200));

        InspireFunction lambdaSumFunc = (x,y) -> x+y;
        System.out.println(lambdaSumFunc.max(100, 200));

        System.out.println(">>>> Supplier");
        Supplier<String> supplier = ()-> "inspire";
        System.out.println(supplier.get());

        System.out.println();
        System.out.println(">>>> Consumer");
        Consumer<String> consumer = (str) -> System.out.println(str.split(" ")[1]);
        consumer
            .andThen(System.out::println)
            .accept("lgcns inspire");

        System.out.println();
        System.out.println(">>>> Function");
        Function<String, Integer> function =(str) -> str.length();
        int len = function.apply("jslim lgcns inspire");
        System.out.println(len);

        System.out.println();
        System.out.println(">>>> Pridicate");
        Predicate<String> predicate = (str) -> str.equals("lgcns");
        boolean flag = predicate.test("inspire");
        System.out.println(flag); 

        List<String> brands = Arrays.asList("samsung", "lg");
        brands.stream()
                //.forEach(brand -> System.out.println(brand));
                .forEach(System.out::println);
        
        
        System.out.println();
        System.out.println(">>>> Optional "); 
        /*
        Optional
        - 어떤 메서드가 null을 반환할지 확실할 수 없거나,
        - null 처리를 놓쳐서 발생하는 예외를 피할 때 사용
        주의사항)
        - 메서드의 반환타입으로 사용(전역변수 타입 X, 매개변수 X)
        - 사용의도에 맞게 사용해야 한다( null할당 X )
        */
        Optional<String> op01 = Optional.of("jslim"); //더미데이터
        if(op01.isPresent()) {
            System.out.println(op01.get());
        }

        Optional<PostResponseDTO> op02 = Optional.empty();
        System.out.println(op02.get().getTitle());
        System.out.println(">>>> main end");


    }
}
