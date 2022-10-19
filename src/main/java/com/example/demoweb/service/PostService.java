package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@Service
public class PostService {

    private ArrayList<Post> posts = new ArrayList<>(
            Arrays.asList(
                    new Post(0L,"first", new Date()),
                    new Post(1L, "second", new Date()),
                    new Post(2L, "third", new Date())
            )
    );

    public ArrayList<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long) posts.size(), text, new Date()));
    }
}
