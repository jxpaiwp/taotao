package com.jxp.taotao.pojo;

import java.util.Date;

public class ItemParam {
    private Long id;

    /**
     * 表名:tb_item_param
     * 数据库字段名:item_cat_id
     * 数据库注释:商品类目ID
     */
    private Long itemCatId;

    private Date created;

    private Date updated;

    /**
     * 表名:tb_item_param
     * 数据库字段名:param_data
     * 数据库注释:参数数据，格式为json格式
     */
    private String paramData;

    /**
     * 构造方法
     */
    public ItemParam(Long id, Long itemCatId, Date created, Date updated, String paramData) {
        this.id = id;
        this.itemCatId = itemCatId;
        this.created = created;
        this.updated = updated;
        this.paramData = paramData;
    }

    /**
     * 构造方法
     */
    public ItemParam() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取itemCatId属性的方法
     */
    public Long getItemCatId() {
        return itemCatId;
    }

    /**
     * 设置itemCatId的方法
     */
    public void setItemCatId(Long itemCatId) {
        this.itemCatId = itemCatId;
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
     * 获取paramData属性的方法
     */
    public String getParamData() {
        return paramData;
    }

    /**
     * 设置paramData的方法
     */
    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }
}