package com.jxp.taotao.pojo;

import java.util.Date;

public class Order {
    /**
     * 表名:tb_order
     * 数据库字段名:order_id
     * 数据库注释:订单id
     */
    private String orderId;

    /**
     * 表名:tb_order
     * 数据库字段名:payment
     * 数据库注释:实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    private String payment;

    /**
     * 表名:tb_order
     * 数据库字段名:payment_type
     * 数据库注释:支付类型，1、在线支付，2、货到付款
     */
    private Integer paymentType;

    /**
     * 表名:tb_order
     * 数据库字段名:post_fee
     * 数据库注释:邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    private String postFee;

    /**
     * 表名:tb_order
     * 数据库字段名:status
     * 数据库注释:状态：1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭
     */
    private Integer status;

    /**
     * 表名:tb_order
     * 数据库字段名:create_time
     * 数据库注释:订单创建时间
     */
    private Date createTime;

    /**
     * 表名:tb_order
     * 数据库字段名:update_time
     * 数据库注释:订单更新时间
     */
    private Date updateTime;

    /**
     * 表名:tb_order
     * 数据库字段名:payment_time
     * 数据库注释:付款时间
     */
    private Date paymentTime;

    /**
     * 表名:tb_order
     * 数据库字段名:consign_time
     * 数据库注释:发货时间
     */
    private Date consignTime;

    /**
     * 表名:tb_order
     * 数据库字段名:end_time
     * 数据库注释:交易完成时间
     */
    private Date endTime;

    /**
     * 表名:tb_order
     * 数据库字段名:close_time
     * 数据库注释:交易关闭时间
     */
    private Date closeTime;

    /**
     * 表名:tb_order
     * 数据库字段名:shipping_name
     * 数据库注释:物流名称
     */
    private String shippingName;

    /**
     * 表名:tb_order
     * 数据库字段名:shipping_code
     * 数据库注释:物流单号
     */
    private String shippingCode;

    /**
     * 表名:tb_order
     * 数据库字段名:user_id
     * 数据库注释:用户id
     */
    private Long userId;

    /**
     * 表名:tb_order
     * 数据库字段名:buyer_message
     * 数据库注释:买家留言
     */
    private String buyerMessage;

    /**
     * 表名:tb_order
     * 数据库字段名:buyer_nick
     * 数据库注释:买家昵称
     */
    private String buyerNick;

    /**
     * 表名:tb_order
     * 数据库字段名:buyer_rate
     * 数据库注释:买家是否已经评价
     */
    private Integer buyerRate;

    /**
     * 构造方法
     */
    public Order(String orderId, String payment, Integer paymentType, String postFee, Integer status, Date createTime, Date updateTime, Date paymentTime, Date consignTime, Date endTime, Date closeTime, String shippingName, String shippingCode, Long userId, String buyerMessage, String buyerNick, Integer buyerRate) {
        this.orderId = orderId;
        this.payment = payment;
        this.paymentType = paymentType;
        this.postFee = postFee;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.paymentTime = paymentTime;
        this.consignTime = consignTime;
        this.endTime = endTime;
        this.closeTime = closeTime;
        this.shippingName = shippingName;
        this.shippingCode = shippingCode;
        this.userId = userId;
        this.buyerMessage = buyerMessage;
        this.buyerNick = buyerNick;
        this.buyerRate = buyerRate;
    }

    /**
     * 构造方法
     */
    public Order() {
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
     * 获取payment属性的方法
     */
    public String getPayment() {
        return payment;
    }

    /**
     * 设置payment的方法
     */
    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    /**
     * 获取paymentType属性的方法
     */
    public Integer getPaymentType() {
        return paymentType;
    }

    /**
     * 设置paymentType的方法
     */
    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * 获取postFee属性的方法
     */
    public String getPostFee() {
        return postFee;
    }

    /**
     * 设置postFee的方法
     */
    public void setPostFee(String postFee) {
        this.postFee = postFee == null ? null : postFee.trim();
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
     * 获取createTime属性的方法
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置createTime的方法
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取updateTime属性的方法
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置updateTime的方法
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取paymentTime属性的方法
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * 设置paymentTime的方法
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * 获取consignTime属性的方法
     */
    public Date getConsignTime() {
        return consignTime;
    }

    /**
     * 设置consignTime的方法
     */
    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    /**
     * 获取endTime属性的方法
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime的方法
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取closeTime属性的方法
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * 设置closeTime的方法
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * 获取shippingName属性的方法
     */
    public String getShippingName() {
        return shippingName;
    }

    /**
     * 设置shippingName的方法
     */
    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    /**
     * 获取shippingCode属性的方法
     */
    public String getShippingCode() {
        return shippingCode;
    }

    /**
     * 设置shippingCode的方法
     */
    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode == null ? null : shippingCode.trim();
    }

    /**
     * 获取userId属性的方法
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置userId的方法
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取buyerMessage属性的方法
     */
    public String getBuyerMessage() {
        return buyerMessage;
    }

    /**
     * 设置buyerMessage的方法
     */
    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage == null ? null : buyerMessage.trim();
    }

    /**
     * 获取buyerNick属性的方法
     */
    public String getBuyerNick() {
        return buyerNick;
    }

    /**
     * 设置buyerNick的方法
     */
    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    /**
     * 获取buyerRate属性的方法
     */
    public Integer getBuyerRate() {
        return buyerRate;
    }

    /**
     * 设置buyerRate的方法
     */
    public void setBuyerRate(Integer buyerRate) {
        this.buyerRate = buyerRate;
    }
}