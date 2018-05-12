package com.jxp.taotao.dao;

import com.jxp.taotao.pojo.OrderItem;
import com.jxp.taotao.pojo.OrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderItemMapper {
    /**
     * 构造方法
     * @param example
     */
    long countByExample(OrderItemExample example);

    /**
     * 构造方法
     * @param example
     */
    int deleteByExample(OrderItemExample example);

    /**
     * 根据主键删除记录
     * @param id
     */
    int deleteByPrimaryKey(String id);

    /**
     * 根据对象插入记录
     * @param record
     */
    int insert(OrderItem record);

    /**
     * 根据对象选择性插入记录
     * @param record
     */
    int insertSelective(OrderItem record);

    /**
     * 构造方法
     * @param example
     */
    List<OrderItem> selectByExample(OrderItemExample example);

    /**
     * 根据主键返回单条记录
     * @param id
     */
    OrderItem selectByPrimaryKey(String id);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    /**
     * 根据主键选择性更新记录
     * @param record
     */
    int updateByPrimaryKeySelective(OrderItem record);

    /**
     * 根据主键更新记录
     * @param record
     */
    int updateByPrimaryKey(OrderItem record);
}