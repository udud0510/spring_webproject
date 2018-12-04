package com.udud.webservice.web;

import com.udud.webservice.domain.PostsRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }


}
