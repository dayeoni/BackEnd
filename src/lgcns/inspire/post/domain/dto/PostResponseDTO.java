package lgcns.inspire.post.domain.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PostResponseDTO {
    private String title ;
    private String content;
    private String writer;
    private LocalDateTime regData;
    private int viewCnt;
}


