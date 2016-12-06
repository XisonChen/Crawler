package com.xison.mapper.model;

/**
 * Created by admin on 2016/12/6.
 */
public class Song {

    private String url;
    private String title;
    private Long commentCount;

    public Song() {
        super();
    }

    public Song(String url, String title, Long commentCount) {
        this.url = url;
        this.title = title;
        this.commentCount = commentCount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }
}
