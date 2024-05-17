package com.blog.web.service;

import com.blog.web.model.Article;

/**
 * 提供内容的访问，发布，编辑，分页，删除
 */
public interface ContentService {
    /**
     * 发布文章
     *
     * @param article
     */
    void publish(Article article);

    /**
     * 访问数据页
     *
     * @param p 业序号
     * @param limit 偏移量
     */
    void getPage(Integer p, Integer limit);

    /**
     * 根据id获取文章
     * @param id 文章id
     */
    void getArticle(String id);
}
