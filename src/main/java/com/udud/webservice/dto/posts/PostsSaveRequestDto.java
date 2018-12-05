package com.udud.webservice.dto.posts;

import com.udud.webservice.domain.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/* Controller 에서 사용할 DTO 클래스 */

@Getter
@Setter     // Controller에서 @RequestBody로 외부에서 데이터를 받는 경우에는 setter사용
@NoArgsConstructor

public class PostsSaveRequestDto {
    private  String title;
    private  String content;
    private  String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}

