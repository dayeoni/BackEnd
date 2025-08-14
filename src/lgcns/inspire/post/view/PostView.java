package lgcns.inspire.post.view;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import lgcns.inspire.post.ctrl.PostController;
import lgcns.inspire.post.domain.dto.PostResponseDTO;

public class PostView {
    
    private Scanner scan;
    
    // Dependency Injection (DI)
    private PostController ctrl;
    
    public PostView(){
        scan = new Scanner(System.in);
        ctrl = new PostController();
    }


    public void mainMenu(){
        while(true) {
            System.out.println(">>> Inspire Camp Post Ver(1.0)");
            System.out.println("1. 전체 검색");
            System.out.println("2. 게시글 상세보기");
            System.out.println("3. 입력 폼으로 이동");
            System.out.println("4. 수정 페이지 이동");
            System.out.println("5. 삭제하기");
            System.out.println("99. 프로그램 종료");
            System.out.print("번호를 선택하세요 : ");
            int number = Integer.parseInt(scan.nextLine());
            switch (number) {
                case 1:
                    list();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    insert();
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
        System.out.println();
        System.out.println(">>> 데이터 출력 <<<");

        List<PostResponseDTO> list = ctrl.list();
        System.out.println("view list data : "+list);
        
        // 1.8 version
        // stream api 이용해서 출력
        // list.stream()
        //     .forEach(System.out::println);

        // 특정 속성에 대한 정보만 추출(title)
        // list.stream()
        //     .map(PostResponseDTO::getTitle)
        //     .forEach(System.out::println);

        list.stream()
            .filter(post -> post.getId() >= 2)
            .forEach(System.out::println);
    }

    public void read() {
        System.out.println();
        System.out.println(">>>> 특정 게시물 상세보기 <<<<");
        
        System.out.println(">>> 게시물 번호 입력 : ");
        int id = Integer.parseInt(scan.nextLine());
        Optional<PostResponseDTO> result = ctrl.findPost(id);
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println(">>>> 특정 게시물 찾기 실패!!");
        }
    }

    public void insert() {
        System.out.println();
        System.out.println(">>>> title, content, writer <<<<");

        System.out.print(">>> 제목 : ");
        String title = scan.nextLine();  
        System.out.println();
        System.out.print(">>> 내용 : ");
        String content = scan.nextLine(); 
        System.out.println();
        System.out.print(">>>작성자 : ");
        String writer = scan.nextLine(); 
        /*
        요구사항)
        - 입력받은 3개의 파라미터를 ctrl에 전달(메서드 정의)
        - 반환타입 int형으로 1이 넘어오면 정상, 0이 넘어오면 입력실패

        - 전달된 파라미터를 PostResponseDTO 객체로 바인딩하고
        - 기본키 값은 size()+1로 id 값을 할당
        - service로 전달하고
        - service는 DAO로 전달
        - DAO는 기존 list에 전달받은 request 객체를 담고 
        - 성공이면 1, 실패면 2 반환
        */
        //System.out.println("[debug] >>> "+title+"\t"+content+"\t"+writer);
        int successFlag = ctrl.insert(title, content, writer);
        if(successFlag == 1) {
            System.out.println("압력성공");
        } else {
            System.out.println("입력실패");
        }
    }
}
