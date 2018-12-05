package com.udud.webservice.service;

import com.udud.webservice.domain.PostsRepository;
import com.udud.webservice.dto.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service

public class PostsService {

    private PostsRepository postsRepository;

    // 예외 발생시 모든 DB작업 초기화 해주는 어노테이션 ( 완료시에만 커밋해줌 )
    @Transactional
    /*
    호출한 쪽에서 게시글의 id를 알수 있게 Long타입으로 return
    Controller에서 바로 Dto.toEntity를 사용하지 않고 service에서 Dto를 받는이유는?
      : Controller와 Service의 역할 분리 위해
    */
    /*public Long save(PostsSaveRequestDto dto){
        return postsRepository.save(dto.toEntity()).getId();
    }*/

    public Long save (PostsSaveRequestDto dto){
        return  postsRepository.save(dto.toEntity()).getId();
    }
}

