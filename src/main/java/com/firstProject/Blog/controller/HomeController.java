package com.firstProject.Blog.controller;

import com.firstProject.Blog.domain.Blogger;
import com.firstProject.Blog.domain.Story;
import com.firstProject.Blog.repository.StoryRepository;
import com.firstProject.Blog.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Controller
public class HomeController {

    StoryService storyService;

    @Autowired
    public void setStoryService(StoryService storyService) {
        this.storyService = storyService;
    }



    @RequestMapping("/")
    public String stories(Model model, Locale locale){
        model.addAttribute("pageTitle", "Minden napra egy stori");
        model.addAttribute("stories", storyService. getStories());
        System.out.println(String.format("Request received. Language: %s, Country: %s %n", locale.getLanguage(), locale.getDisplayCountry()));
        return "stories";
    }

    @RequestMapping("/user/{id}")
    public String searchForUser(@PathVariable(value = "id") String id) throws Exception{
    if (id == null){
        throw new Exception("Nincs ilyen ID-val felhasználó!");
        }
    else return "user";
    }


}
