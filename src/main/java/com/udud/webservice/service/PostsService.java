package com.udud.webservice.service;

import com.udud.webservice.domain.PostsRepository;
import com.udud.webservice.dto.PostsMainResponseDto;
import com.udud.webservice.dto.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service

public class PostsService {

    private PostsRepository postsRepository;
    @Transactional
    public Long save(PostsSaveRequestDto dto){
        return  postsRepository.save(dto.toEntity()).getId();
    }

    // import를 잘하자..
    @Transactional(readOnly = true)
    public List<PostsMainResponseDto> findAllDesc() {
        return postsRepository.findAllDesc()
                .map(PostsMainResponseDto::new)
                .collect(Collectors.toList());
    }
}

