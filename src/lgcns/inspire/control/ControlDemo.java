package lgcns.inspire.control;

public class ControlDemo {
    /*
    제어구문 : A 또는 B의 행위를 기대할 수 있는 것
    if(조건식){
        조건에 대한 값이 true일 때 수행하는 블럭
        중첩될 수 있다.
        if(조건식) {
        
        } else {
        
        }
    } else if(조건식){
        조건에 대한 값이 false일 때 수행하는 블럭
        if(조건식) {
        
        } else {
        
        }
    } else {
        조건에 대한 값이 false일 때 수행하는 블럭
        if(조건식) {
        
        } else {
        
        }
    }
    // 값: char, int, String, enum
    switch(값) {
        case 값 : 
            수행
            break;
        default :
            수행
    }

    (조건식) ? true : false
    */   

    /*
    Quiz
    조건) 매개변수의 값이 1~3
    조건) 1: 금도끼 2: 은도끼 3:쇠도끼
    조건) 나무꾼이 제 도끼는 1번입니다라고 한다면? ->'거짓말을 하는구나' 메시지 반환
         나무꾼이 제 도끼는 2번입니다라고 한다면? -> '또 거짓말을 하는구나' 메시지 반환
         나무꾼이 제 도끼는 3번입니다라고 한다면? -> '정직하구나 너에게 모든 도끼를 주겠다' 메시지 반환
    */
    
    public String woodMan(int number) {
        String result = null;
        
        if (number >=1 && number <= 3) {
            System.out.println("산신령이 나타나서 묻는데 네 도끼는 몇번이냐?");
            if (number == 1) {
                System.out.println("나무꾼이 대답하길 제 도끼는 1번입니다");
                result = "거짓말을 하는구나";
            } else if (number == 2) {
                System.out.println("나무꾼이 대답하길 제 도끼는 2번입니다");
                result = "또 거짓말을 하는구나";
            } else {
                System.out.println("나무꾼이 대답하길 제 도끼는 3번입니다");
                result = "정직하구나 너에게 모든 도끼를 주겠다";
            }
        } else {
            result = "정확한 숫자를 입력하세요(1~3)";
        }
        return result;
    }

    public String woodManSwitch(int number) {
        String result = null;
        
        if (number >=1 && number <= 3) {
            System.out.println("산신령이 나타나서 묻는데 네 도끼는 몇번이냐?");
           
            switch (number) {
                case 1:
                    System.out.println("나무꾼이 대답하길 제 도끼는 1번입니다");
                    result = "거짓말을 하는구나";
                    break;
                case 2:
                    System.out.println("나무꾼이 대답하길 제 도끼는 2번입니다");
                    result = "또 거짓말을 하는구나";
                    break;
                case 3:
                    System.out.println("나무꾼이 대답하길 제 도끼는 3번입니다");
                    result = "정직하구나 너에게 모든 도끼를 주겠다";
                    break;
                default :
                    break;

            }
        } else {
            result = "정확한 숫자를 입력하세요(1~3)";
        }
        return result;
    }

    public String woodManTernary(int number) {
        String result = null;
        
        if (number >=1 && number <= 3) {
            System.out.println("산신령이 나타나서 묻는데 네 도끼는 몇번이냐?");
            
            result = (number == 1) ? "거짓말을 하는구나"
                : (number == 2) ? "또 거짓말을 하는구나"     
                : "정직하구나 너에게 모든 도끼를 주겠다";
            System.out.println("산신령이 연못으로 사라졌다.");
        } else {
            result = "정확한 숫자를 입력하세요(1~3)";
        }
        return result;
    }

    /* Quiz
    parameter :  kro, eng, math
    return type : String
    method name : passOrNonPass
    합격 조건)
    -세 과목의 점수가 각각 40점이상 이면서(and)
    -평균 60점 이상이면 합격
    -아니면 불합격
    */
    public String passOrNonPass(int kor, int eng, int math) {
        String result = null;
        double avg = (kor+eng+math)/3;
            if( kor >= 40 && eng >= 40 && math >=40) {
                if(avg >= 60) {
                    result= "평균 60점 이상으로 합격입니다";
                } else{
                    result= "평균 60점을 넘지 못해 불합격입니다";
                }
            } else {
                result = "세 과목의 점수가 40점을 넘지 않아 불합격입니다";
            }
        return result;
    }
    
}
