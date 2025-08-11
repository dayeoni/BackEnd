package lgcns.inspire.game;

import java.util.Scanner;

public class GuessGame {
    
    // static으로 만듦->클래스다
    // 1~100 사이의 난수 생성 후 반환
    public static int generatorNan(){
        int answer = (int)(Math.random()*100)+1;
        return answer;
    }

    /*
    기회는 총 10번
    - 매개변수로 정답을 전달받음
    - 반환값으로 
    -- 성공)xx번째 정답을 맞췄습니다
    -- 실패)10번의 기회를 모두 사용하였습니다
    */
    public String gameStart(int answer) {
        String result = null;
        int i = 0;
        result = "10번의 기회를 모두 사용했습니다";

        //게임 10번 반복
        for(i=1; i<=10; i++){
            Scanner scanner = new Scanner(System.in); //콘솔로부터 데이터 입력 받음
            System.out.print("정답을 입력하세요: ");
            int guess = scanner.nextInt();
            System.out.printf("당신의 생각은 %d이네요\n", guess);
            if (guess > answer) {
                System.out.println("더 낮은 숫자입니다.");
            } else if (guess < answer) {
                System.out.println("더 높은 숫자입니다");
            }else {
                result = i+"번째 정답을 맞혔습니다";
                break;
            } 
        }
       
        
        return result;
    }
}
