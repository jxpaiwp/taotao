package com.jxp.taotao.dao;

import com.jxp.taotao.pojo.OrderShipping;
import com.jxp.taotao.pojo.OrderShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderShippingMapper {
    /**
     * 构造方法
     * @param example
     */
    long countByExample(OrderShippingExample example);

    /**
     * 构造方法
     * @param example
     */
    int deleteByExample(OrderShippingExample example);

    /**
     * 根据主键删除记录
     * @param orderId
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * 根据对象插入记录
     * @param record
     */
    int insert(OrderShipping record);

    /**
     * 根据对象选择性插入记录
     * @param record
     */
    int insertSelective(OrderShipping record);

    /**
     * 构造方法
     * @param example
     */
    List<OrderShipping> selectByExample(OrderShippingExample example);

    /**
     * 根据主键返回单条记录
     * @param orderId
     */
    OrderShipping selectByPrimaryKey(String orderId);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") OrderShipping record, @Param("example") OrderShippingExample example);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") OrderShipping record, @Param("example") OrderShippingExample example);

    /**
     * 根据主键选择性更新记录
     * @param record
     */
    int updateByPrimaryKeySelective(OrderShipping record);

    /**
     * 根据主键更新记录
     * @param record
     */
    int updateByPrimaryKey(OrderShipping record);
}