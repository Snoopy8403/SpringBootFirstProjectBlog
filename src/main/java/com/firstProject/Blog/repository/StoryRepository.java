package com.firstProject.Blog.repository;

import com.firstProject.Blog.domain.Story;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StoryRepository extends CrudRepository<Story, Long> {

    List<Story> findAll();
    Story findFirstByOrderByIdAsc();
}
