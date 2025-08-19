package lgcns.inspire.post.service;

import java.util.List;
import java.util.Optional;

import lgcns.inspire.post.domain.dto.PostRequestDTO;
import lgcns.inspire.post.domain.dto.PostResponseDTO;

public interface PostService {
    public List<PostResponseDTO>        selectService() ; //전체 반환 메서드
    public Optional<PostResponseDTO>    selectSerivce(int id) ; 
    public int                          insertService(PostRequestDTO request); 

    /////////////////
    //public List<PostResponseDTO>         searchService(String writer); // 키워드 '작성자'를 받아 객체 정보를 리스트에 담아 반환
    public Optional<List<PostResponseDTO>> searchService(String writer);

}

