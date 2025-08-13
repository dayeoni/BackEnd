package lgcns.inspire.post.service;

import java.util.List;

import lgcns.inspire.post.domain.dto.PostResponseDTO;

public interface PostService {
    public List<PostResponseDTO> selectService();
}
