package com.jxp.taotao.pojo;

import java.util.Date;

public class Item {
    /**
     * 表名:tb_item
     * 数据库字段名:id
     * 数据库注释:商品id，同时也是商品编号
     */
    private Long id;

    /**
     * 表名:tb_item
     * 数据库字段名:title
     * 数据库注释:商品标题
     */
    private String title;

    /**
     * 表名:tb_item
     * 数据库字段名:sell_point
     * 数据库注释:商品卖点
     */
    private String sellPoint;

    /**
     * 表名:tb_item
     * 数据库字段名:price
     * 数据库注释:商品价格，单位为：分
     */
    private Long price;

    /**
     * 表名:tb_item
     * 数据库字段名:num
     * 数据库注释:库存数量
     */
    private Integer num;

    /**
     * 表名:tb_item
     * 数据库字段名:barcode
     * 数据库注释:商品条形码
     */
    private String barcode;

    /**
     * 表名:tb_item
     * 数据库字段名:image
     * 数据库注释:商品图片
     */
    private String image;

    /**
     * 表名:tb_item
     * 数据库字段名:cid
     * 数据库注释:所属类目，叶子类目
     */
    private Long cid;

    /**
     * 表名:tb_item
     * 数据库字段名:status
     * 数据库注释:商品状态，1-正常，2-下架，3-删除
     */
    private Byte status;

    /**
     * 表名:tb_item
     * 数据库字段名:created
     * 数据库注释:创建时间
     */
    private Date created;

    /**
     * 表名:tb_item
     * 数据库字段名:updated
     * 数据库注释:更新时间
     */
    private Date updated;

    /**
     * 构造方法
     */
    public Item(Long id, String title, String sellPoint, Long price, Integer num, String barcode, String image, Long cid, Byte status, Date created, Date updated) {
        this.id = id;
        this.title = title;
        this.sellPoint = sellPoint;
        this.price = price;
        this.num = num;
        this.barcode = barcode;
        this.image = image;
        this.cid = cid;
        this.status = status;
        this.created = created;
        this.updated = updated;
    }

    /**
     * 构造方法
     */
    public Item() {
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
     * 获取sellPoint属性的方法
     */
    public String getSellPoint() {
        return sellPoint;
    }

    /**
     * 设置sellPoint的方法
     */
    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint == null ? null : sellPoint.trim();
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
     * 获取barcode属性的方法
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * 设置barcode的方法
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    /**
     * 获取image属性的方法
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置image的方法
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * 获取cid属性的方法
     */
    public Long getCid() {
        return cid;
    }

    /**
     * 设置cid的方法
     */
    public void setCid(Long cid) {
        this.cid = cid;
    }

    /**
     * 获取status属性的方法
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置status的方法
     */
    public void setStatus(Byte status) {
        this.status = status;
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

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", sellPoint='" + sellPoint + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", barcode='" + barcode + '\'' +
                ", image='" + image + '\'' +
                ", cid=" + cid +
                ", status=" + status +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}