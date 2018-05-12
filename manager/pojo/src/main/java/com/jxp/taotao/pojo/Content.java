package com.jxp.taotao.pojo;

import java.util.Date;

public class Content {
    private Long id;

    /**
     * 表名:tb_content
     * 数据库字段名:category_id
     * 数据库注释:内容类目ID
     */
    private Long categoryId;

    /**
     * 表名:tb_content
     * 数据库字段名:title
     * 数据库注释:内容标题
     */
    private String title;

    /**
     * 表名:tb_content
     * 数据库字段名:sub_title
     * 数据库注释:子标题
     */
    private String subTitle;

    /**
     * 表名:tb_content
     * 数据库字段名:title_desc
     * 数据库注释:标题描述
     */
    private String titleDesc;

    /**
     * 表名:tb_content
     * 数据库字段名:url
     * 数据库注释:链接
     */
    private String url;

    /**
     * 表名:tb_content
     * 数据库字段名:pic
     * 数据库注释:图片绝对路径
     */
    private String pic;

    /**
     * 表名:tb_content
     * 数据库字段名:pic2
     * 数据库注释:图片2
     */
    private String pic2;

    private Date created;

    private Date updated;

    /**
     * 表名:tb_content
     * 数据库字段名:content
     * 数据库注释:内容
     */
    private String content;

    public Content(Long id, Long categoryId, String title, String subTitle, String titleDesc, String url, String pic, String pic2, Date created, Date updated, String content) {
        this.id = id;
        this.categoryId = categoryId;
        this.title = title;
        this.subTitle = subTitle;
        this.titleDesc = titleDesc;
        this.url = url;
        this.pic = pic;
        this.pic2 = pic2;
        this.created = created;
        this.updated = updated;
        this.content = content;
    }

    public Content(Long id, Long categoryId, String title, String subTitle, String titleDesc, String url, String pic, String pic2, Date created, Date updated) {
        this.id = id;
        this.categoryId = categoryId;
        this.title = title;
        this.subTitle = subTitle;
        this.titleDesc = titleDesc;
        this.url = url;
        this.pic = pic;
        this.pic2 = pic2;
        this.created = created;
        this.updated = updated;
    }

    /**
     * 构造方法
     */
    public Content() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取categoryId属性的方法
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * 设置categoryId的方法
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取title属性的方法
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置title的方法
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取subTitle属性的方法
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * 设置subTitle的方法
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    /**
     * 获取titleDesc属性的方法
     */
    public String getTitleDesc() {
        return titleDesc;
    }

    /**
     * 设置titleDesc的方法
     */
    public void setTitleDesc(String titleDesc) {
        this.titleDesc = titleDesc == null ? null : titleDesc.trim();
    }

    /**
     * 获取url属性的方法
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置url的方法
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取pic属性的方法
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置pic的方法
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * 获取pic2属性的方法
     */
    public String getPic2() {
        return pic2;
    }

    /**
     * 设置pic2的方法
     */
    public void setPic2(String pic2) {
        this.pic2 = pic2 == null ? null : pic2.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * 获取content属性的方法
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置content的方法
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

}