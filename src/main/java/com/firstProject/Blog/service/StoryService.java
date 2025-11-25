package com.firstProject.Blog.service;

import com.firstProject.Blog.domain.Blogger;
import com.firstProject.Blog.domain.Story;
import com.firstProject.Blog.repository.BloggerRepository;
import com.firstProject.Blog.repository.StoryRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StoryService {

    private StoryRepository storyRepository;
    private BloggerRepository bloggerRepository;

    @Autowired
    public void setStoryRepository(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    @Autowired
    public void setBloggerRepository(BloggerRepository bloggerRepository) {
        this.bloggerRepository = bloggerRepository;
    }

    public List<Story> getStories() {
        return storyRepository.findAll();
    }

    @PostConstruct
    public void init(){
        Blogger blogger = new Blogger("Sanyi", 33);
        bloggerRepository.save(blogger);

        Story story = new Story("Az én sztorim", "Ez egy másik sztori aminek ez a lesírása", new Date(), blogger);
        storyRepository.save(story);
    }
 }
