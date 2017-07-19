package com.model;

import lombok.Data;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
@Data
public class LearnResouce {
    private String author;
    private String title;
    private String url;
    public LearnResouce(String author, String title, String url) {
        this.author = author;
        this.title = title;
        this.url = url;
    }
}
