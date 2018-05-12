package com.jxp.taotao.pojo;

import java.util.Date;

public class OrderShipping {
    /**
     * 表名:tb_order_shipping
     * 数据库字段名:order_id
     * 数据库注释:订单ID
     */
    private String orderId;

    /**
     * 表名:tb_order_shipping
     * 数据库字段名:receiver_name
     * 数据库注释:收货人全名
     */
    private String receiverName;

    /**
     * 表名:tb_order_shipping
     * 数据库字段名:receiver_phone
     * 数据库注释:固定电话
     */
    private String receiverPhone;

    /**
     * 表名:tb_order_shipping
     * 数据库字段名:receiver_mobile
     * 数据库注释:移动电话
     */
    private String receiverMobile;

    /**
     * 表名:tb_order_shipping
     * 数据库字段名:receiver_state
     * 数据库注释:省份
     */
    private String receiverState;

    /**
     * 表名:tb_order_shipping
     * 数据库字段名:receiver_city
     * 数据库注释:城市
     */
    private String receiverCity;

    /**
     * 表名:tb_order_shipping
     * 数据库字段名:receiver_district
     * 数据库注释:区/县
     */
    private String receiverDistrict;

    /**
     * 表名:tb_order_shipping
     * 数据库字段名:receiver_address
     * 数据库注释:收货地址，如：xx路xx号
     */
    private String receiverAddress;

    /**
     * 表名:tb_order_shipping
     * 数据库字段名:receiver_zip
     * 数据库注释:邮政编码,如：310001
     */
    private String receiverZip;

    private Date created;

    private Date updated;

    /**
     * 构造方法
     */
    public OrderShipping(String orderId, String receiverName, String receiverPhone, String receiverMobile, String receiverState, String receiverCity, String receiverDistrict, String receiverAddress, String receiverZip, Date created, Date updated) {
        this.orderId = orderId;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.receiverMobile = receiverMobile;
        this.receiverState = receiverState;
        this.receiverCity = receiverCity;
        this.receiverDistrict = receiverDistrict;
        this.receiverAddress = receiverAddress;
        this.receiverZip = receiverZip;
        this.created = created;
        this.updated = updated;
    }

    /**
     * 构造方法
     */
    public OrderShipping() {
        super();
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
     * 获取receiverName属性的方法
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 设置receiverName的方法
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * 获取receiverPhone属性的方法
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * 设置receiverPhone的方法
     */
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    /**
     * 获取receiverMobile属性的方法
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * 设置receiverMobile的方法
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    /**
     * 获取receiverState属性的方法
     */
    public String getReceiverState() {
        return receiverState;
    }

    /**
     * 设置receiverState的方法
     */
    public void setReceiverState(String receiverState) {
        this.receiverState = receiverState == null ? null : receiverState.trim();
    }

    /**
     * 获取receiverCity属性的方法
     */
    public String getReceiverCity() {
        return receiverCity;
    }

    /**
     * 设置receiverCity的方法
     */
    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity == null ? null : receiverCity.trim();
    }

    /**
     * 获取receiverDistrict属性的方法
     */
    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    /**
     * 设置receiverDistrict的方法
     */
    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict == null ? null : receiverDistrict.trim();
    }

    /**
     * 获取receiverAddress属性的方法
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * 设置receiverAddress的方法
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    /**
     * 获取receiverZip属性的方法
     */
    public String getReceiverZip() {
        return receiverZip;
    }

    /**
     * 设置receiverZip的方法
     */
    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip == null ? null : receiverZip.trim();
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
}