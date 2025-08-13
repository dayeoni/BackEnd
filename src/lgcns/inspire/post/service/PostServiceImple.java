package lgcns.inspire.post.service;

import java.util.List;

import lgcns.inspire.post.domain.dto.PostResponseDTO;

public class PostServiceImple implements PostService {

    @Override
    public List<PostResponseDTO> selectService() {
        System.out.println(">>> post service selectService");
        return null;
    }
    
}
