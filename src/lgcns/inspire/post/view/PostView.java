package lgcns.inspire.post.view;

import java.util.Scanner;

public class PostView {
    
    private Scanner scan;
    
    public PostView(){
        scan = new Scanner(System.in);
    }


    public void mainMenu(){
        while(true) {
            System.out.println(">>> Inspire Camp Post Ver(1.0)");
            System.out.println("1. 전체 검색");
            System.out.println("2. 키워드 검색");
            System.out.println("3. 입력 폼으로 이동");
            System.out.println("4. 수정 페이지 이동");
            System.out.println("5. 삭제하기");
            System.out.println("99. 프로그램 종료");
            System.out.print("번호를 선택하세요 : ");
            int number = scan.nextInt();
            switch (number) {
                case 1:
                    list();
                    break;
                case 99:
                    System.out.println("포스트 앱 수행을 종료합니다.");
                    System.exit(0); //이게 없으면 안끝남. switch문만 나갈 뿐 while문을 빠져나가지 못함
                    break;
                default :
                    System.out.println("선택하신 번호는 없는 번호입니다.");
            }
        }
        
    } // main menu end

    /*
    - 컨트롤러에게 데이터를 요청하고 전달받은 값을 출력하는 역할
    */
    public void list() {
        System.out.println(">>> 데이터 출력 <<<");
    }
}
