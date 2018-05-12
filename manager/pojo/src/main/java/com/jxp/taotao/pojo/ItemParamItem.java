package com.jxp.taotao.pojo;

import java.util.Date;

public class ItemParamItem {
    private Long id;

    /**
     * 表名:tb_item_param_item
     * 数据库字段名:item_id
     * 数据库注释:商品ID
     */
    private Long itemId;

    private Date created;

    private Date updated;

    /**
     * 表名:tb_item_param_item
     * 数据库字段名:param_data
     * 数据库注释:参数数据，格式为json格式
     */
    private String paramData;

    /**
     * 构造方法
     */
    public ItemParamItem(Long id, Long itemId, Date created, Date updated, String paramData) {
        this.id = id;
        this.itemId = itemId;
        this.created = created;
        this.updated = updated;
        this.paramData = paramData;
    }

    /**
     * 构造方法
     */
    public ItemParamItem() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取itemId属性的方法
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * 设置itemId的方法
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
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