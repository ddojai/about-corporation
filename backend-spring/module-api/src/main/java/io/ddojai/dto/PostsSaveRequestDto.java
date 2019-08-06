package io.ddojai.dto;

import io.ddojai.domain.Posts;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class PostsSaveRequestDto {

    @NotNull
    private String title;
    @NotNull
    private String content;
    @NotNull
    private List<String> tags;

    private String userId;

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .tags(tags)
                .build();
    }
}