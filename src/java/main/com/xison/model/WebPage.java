package com.xison.model;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * Created by admin on 2016/12/6.
 */
@Entity
public class WebPage {

    public enum PageType {
        song, playlist, playlists;
    }

    public enum Status {
        crawled, uncrawl;
    }

    @Id
    private String url;
    private String title;

    @Enumerated(EnumType.STRING)
    private PageType type;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Transient
    private String html;

    public WebPage() {
        super();
    }

    public WebPage(String url, PageType type) {
        super();
        this.url = url;
        this.type = type;
        this.status = Status.uncrawl;
    }

    public WebPage(String url, PageType type, String title) {
        super();
        this.url = url;
        this.type = type;
        this.title = title;
        this.status = Status.uncrawl;
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

    public PageType getType() {
        return type;
    }

    public void setType(PageType type) {
        this.type = type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }
}
