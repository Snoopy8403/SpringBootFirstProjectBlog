package com.firstProject.Blog.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private Date posted;
    @ManyToOne
    private Blogger blogger;

    private Story() {
    }

    public Story(String title, String content,Date posted, Blogger blogger){
        this.title = title;
        this.content = content;
        this.posted = posted;
        this.blogger = blogger;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPosted() {
        return posted;
    }

    public void setPosted(Date posted) {
        this.posted = posted;
    }

    public Blogger getBlogger() {
        return blogger;
    }

    public void setBlogger(Blogger blogger) {
        this.blogger = blogger;
    }

    @Override
    public String toString() {
        return "Story{" +
                "title='" + title + "}";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
