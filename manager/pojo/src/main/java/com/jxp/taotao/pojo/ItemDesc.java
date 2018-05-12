package com.jxp.taotao.pojo;

import java.util.Date;

public class ItemDesc {
    /**
     * 表名:tb_item_desc
     * 数据库字段名:item_id
     * 数据库注释:商品ID
     */
    private Long itemId;

    /**
     * 表名:tb_item_desc
     * 数据库字段名:created
     * 数据库注释:创建时间
     */
    private Date created;

    /**
     * 表名:tb_item_desc
     * 数据库字段名:updated
     * 数据库注释:更新时间
     */
    private Date updated;

    /**
     * 表名:tb_item_desc
     * 数据库字段名:item_desc
     * 数据库注释:商品描述
     */
    private String itemDesc;

    /**
     * 构造方法
     */
    public ItemDesc(Long itemId, Date created, Date updated, String itemDesc) {
        this.itemId = itemId;
        this.created = created;
        this.updated = updated;
        this.itemDesc = itemDesc;
    }

    /**
     * 构造方法
     */
    public ItemDesc() {
        super();
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

    /**
     * 获取itemDesc属性的方法
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * 设置itemDesc的方法
     */
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
    }
}