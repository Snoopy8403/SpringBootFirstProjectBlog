package com.firstProject.Blog.repository;

import com.firstProject.Blog.domain.Blogger;
import com.firstProject.Blog.domain.Story;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface BloggerRepository extends CrudRepository<Blogger, Long> {
    List<Blogger> findAll();
}
