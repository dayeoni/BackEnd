package lgcns.inspire.post.ctrl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import lgcns.inspire.post.domain.dto.PostResponseDTO;
import lgcns.inspire.post.service.PostService;

public class PostSearchCtrl {
    private PostService service;
    public PostSearchCtrl() {

    }

    public PostSearchCtrl(PostService service) {
        this.service = service;
    }

    public Optional<List<PostResponseDTO>> search(String writer) {
        System.out.println(">>>> post service searchService : params request "+writer); 
        return service.searchService(writer);                             
    }

}
