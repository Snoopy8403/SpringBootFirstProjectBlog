package com.firstProject.Blog.controller;

import com.firstProject.Blog.domain.Story;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String stories(Model model, Locale locale){
        model.addAttribute("pageTitle", "Minden napra egy stori");
        model.addAttribute("stories", getStories());
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

    private ArrayList<Story> getStories(){
        ArrayList<Story> stories = new ArrayList<>();

//        Story story1 = new Story();
//        story1.setTitle("Első sztori");
//        story1.setPosted(new Date());
//        story1.setAuthor("Én");
//        story1.setContent("<p>Hello, ez itt az első storym</p>");
//
//        Story story2 = new Story();
//        story2.setTitle("Második sztori");
//        story2.setPosted(new Date());
//        story2.setAuthor("Én");
//        story2.setContent("<p>Hello, ez itt a második storym</p>");
//
//        stories.add(story1);
//        stories.add(story2);

        return stories;
    }
}
