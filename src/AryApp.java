import lgcns.inspire.post.domain.dto.PostResponseDTO;

public class AryApp {
    public static void main(String[] args) {
        /*
        배열(Array)
        - 고정 길이를 갖는다(리사이징 X)
        - 단일 타입만 담는 그릇
        - 참조타입으로 취급 (=객체 생성 후 사용 가능)
        - length 속성을 통해서 배열의 길이를 확인
        - 첨자번지(Index)는 0 ~ 
        - []
        */

        //int [] ary = new int [10]; // 배열에 대한 인스턴스 생성: 배열 생성 + 고정길이
        int [] ary = {1,2,3,4,5};
        System.out.println(">>> ary length : "+ary.length);
        //내부 순환
        for (int idx = 0 ; idx < ary.length ; idx++) {
            System.out.println(ary[idx]);
        }
        System.out.println();
        //외부 순환
        for(int data : ary) {
            System.out.println(data);

        }

        ///////////////////////////////////////////////////////
        
        System.out.println(">>> 참조타입의 객체를 배열에 담는다면? ");
        PostResponseDTO [] postAry = new PostResponseDTO[10]; // 배열 객체 생성하고 이걸 postAry가 참조하는 상황
        //postAry[0] = new PostResponseDTO(); // 배열에 PostResponseDTO타입으로 생성되는 instance를 담기
        
        // Builder Pattern을 이용한 객체 생성 방법
        PostResponseDTO data = PostResponseDTO.builder()
                                    .title("빌더패턴")
                                    .build();
        System.out.println(" >>> getter call : "+data.getTitle());
        postAry[0] = data ;

        for (PostResponseDTO dto : postAry) {
            if (dto != null) {
                System.out.println(">>> title : "+ dto.getContent());
            }
            System.out.println(">>> main end <<<");
        }
    }
}
