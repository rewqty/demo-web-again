package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts() {
        ArrayList<Post> listPosts = new ArrayList<>();
        listPosts.add(new Post("first"));
        listPosts.add(new Post("second"));
        listPosts.add(new Post("third"));
        return listPosts;
    }
}
