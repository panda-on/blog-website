package com.blog.web.model;

import com.blog.web.model.enumerate.ArticleState;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Article {
    private String id;
    private String content;
    private Date create_time;
    private Date update_time;
    private String author;
    private ArrayList<String> catalog;
    private BigInteger pv;
    private BigInteger uv;
    private ArticleState state;

    public ArticleState getState() {
        return state;
    }

    public void setState(ArticleState state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<String> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<String> catalog) {
        this.catalog = catalog;
    }

    public BigInteger getPv() {
        return pv;
    }

    public void setPv(BigInteger pv) {
        this.pv = pv;
    }

    public BigInteger getUv() {
        return uv;
    }

    public void setUv(BigInteger uv) {
        this.uv = uv;
    }
}
