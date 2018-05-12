package com.jxp.taotao.pojo;

import java.util.Date;

public class ContentCategory {
    /**
     * 表名:tb_content_category
     * 数据库字段名:id
     * 数据库注释:类目ID
     */
    private Long id;

    /**
     * 表名:tb_content_category
     * 数据库字段名:parent_id
     * 数据库注释:父类目ID=0时，代表的是一级的类目
     */
    private Long parentId;

    /**
     * 表名:tb_content_category
     * 数据库字段名:name
     * 数据库注释:分类名称
     */
    private String name;

    /**
     * 表名:tb_content_category
     * 数据库字段名:status
     * 数据库注释:状态。可选值:1(正常),2(删除)
     */
    private Integer status;

    /**
     * 表名:tb_content_category
     * 数据库字段名:sort_order
     * 数据库注释:排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    private Integer sortOrder;

    /**
     * 表名:tb_content_category
     * 数据库字段名:is_parent
     * 数据库注释:该类目是否为父类目，1为true，0为false
     */
    private Boolean isParent;

    /**
     * 表名:tb_content_category
     * 数据库字段名:created
     * 数据库注释:创建时间
     */
    private Date created;

    /**
     * 表名:tb_content_category
     * 数据库字段名:updated
     * 数据库注释:创建时间
     */
    private Date updated;

    /**
     * 构造方法
     */
    public ContentCategory(Long id, Long parentId, String name, Integer status, Integer sortOrder, Boolean isParent, Date created, Date updated) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.status = status;
        this.sortOrder = sortOrder;
        this.isParent = isParent;
        this.created = created;
        this.updated = updated;
    }

    /**
     * 构造方法
     */
    public ContentCategory() {
        super();
    }

    /**
     * 获取id属性的方法
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id的方法
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取parentId属性的方法
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置parentId的方法
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取name属性的方法
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name的方法
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取status属性的方法
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置status的方法
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取sortOrder属性的方法
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * 设置sortOrder的方法
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * 获取isParent属性的方法
     */
    public Boolean getIsParent() {
        return isParent;
    }

    /**
     * 设置isParent的方法
     */
    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    /**
     * 获取created属性的方法
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置created的方法
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取updated属性的方法
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置updated的方法
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}