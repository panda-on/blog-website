package com.blog.web.controller.home;

import com.blog.web.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {

    @Autowired
    ContentService contentService;

    @GetMapping("/")
    public String index(){
        return null;
    }

    @GetMapping("/{id}")
    public String getArticleById(@PathVariable("id") String id){
        return null;
    }
}
