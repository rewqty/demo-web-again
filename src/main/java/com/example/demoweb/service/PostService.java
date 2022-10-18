package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts() {
        ArrayList<Post> listPosts = new ArrayList<>();
        listPosts.add(new Post("first", new Date()));
        listPosts.add(new Post("second", new Date()));
        listPosts.add(new Post("third", new Date()));
        return listPosts;
    }
}
