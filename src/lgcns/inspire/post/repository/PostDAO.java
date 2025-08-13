package lgcns.inspire.post.repository;
/* 
    DAO(Data Access Object)
    - db와의 작업을 담당하는 클래스
    - 입력(C), 읽기(R), 수정(U), 삭제(D) : CRUD
    - Structure Query Language (SQL) : DDL, DML, DCL, Select Query 
*/

import java.util.List;

import lgcns.inspire.post.domain.dto.PostRequestDTO;
import lgcns.inspire.post.domain.dto.PostResponseDTO;

public class PostDAO {

    // 입력(C)
    public int insertRow(PostRequestDTO request) {
        System.out.println(">>> dao insertRow");
        return 0;
    }

    // 읽기(R)-전체 검색
    public List<PostResponseDTO> selectRow(){
        System.out.println(">>> dao selectRow");
        return null;
    }

    // 읽기(R)-조건에 만족하는 검색
    public PostResponseDTO selectRow(String id){
        System.out.println(">>> dao selectRow id");
        return null;
    }

    // 수정(U)
    public int updateRow(PostRequestDTO request) {
        System.out.println(">>> dao updateRow");
        return 0;
    }

    // 삭제(D)
    public int deleteRow(String id) {
        System.out.println(">>> dao deleteRow id");
        return 0;
    }
}

