package com.blog.web.controller.home;

import com.blog.web.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class IndexController {

    @Autowired
    ContentService contentService;

    @GetMapping("/")
    public String index(){
        return "this is index";
    }

    @GetMapping("/{id}")
    public String getArticleById(@PathVariable("id") String id){
        return null;
    }
}
