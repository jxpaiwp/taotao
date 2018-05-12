package com.jxp.taotao.pojo;

public class OrderItem {
    private String id;

    /**
     * 表名:tb_order_item
     * 数据库字段名:item_id
     * 数据库注释:商品id
     */
    private String itemId;

    /**
     * 表名:tb_order_item
     * 数据库字段名:order_id
     * 数据库注释:订单id
     */
    private String orderId;

    /**
     * 表名:tb_order_item
     * 数据库字段名:num
     * 数据库注释:商品购买数量
     */
    private Integer num;

    /**
     * 表名:tb_order_item
     * 数据库字段名:title
     * 数据库注释:商品标题
     */
    private String title;

    /**
     * 表名:tb_order_item
     * 数据库字段名:price
     * 数据库注释:商品单价
     */
    private Long price;

    /**
     * 表名:tb_order_item
     * 数据库字段名:total_fee
     * 数据库注释:商品总金额
     */
    private Long totalFee;

    /**
     * 表名:tb_order_item
     * 数据库字段名:pic_path
     * 数据库注释:商品图片地址
     */
    private String picPath;

    /**
     * 构造方法
     */
    public OrderItem(String id, String itemId, String orderId, Integer num, String title, Long price, Long totalFee, String picPath) {
        this.id = id;
        this.itemId = itemId;
        this.orderId = orderId;
        this.num = num;
        this.title = title;
        this.price = price;
        this.totalFee = totalFee;
        this.picPath = picPath;
    }

    /**
     * 构造方法
     */
    public OrderItem() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取itemId属性的方法
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置itemId的方法
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * 获取orderId属性的方法
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置orderId的方法
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * 获取num属性的方法
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置num的方法
     */
    public void setNum(Integer num) {
        this.num = num;
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
     * 获取price属性的方法
     */
    public Long getPrice() {
        return price;
    }

    /**
     * 设置price的方法
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * 获取totalFee属性的方法
     */
    public Long getTotalFee() {
        return totalFee;
    }

    /**
     * 设置totalFee的方法
     */
    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * 获取picPath属性的方法
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * 设置picPath的方法
     */
    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }
}