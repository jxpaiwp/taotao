package com.jxp.taotao.dao;

import com.jxp.taotao.pojo.Order;
import com.jxp.taotao.pojo.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    /**
     * 构造方法
     * @param example
     */
    long countByExample(OrderExample example);

    /**
     * 构造方法
     * @param example
     */
    int deleteByExample(OrderExample example);

    /**
     * 根据主键删除记录
     * @param orderId
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * 根据对象插入记录
     * @param record
     */
    int insert(Order record);

    /**
     * 根据对象选择性插入记录
     * @param record
     */
    int insertSelective(Order record);

    /**
     * 构造方法
     * @param example
     */
    List<Order> selectByExample(OrderExample example);

    /**
     * 根据主键返回单条记录
     * @param orderId
     */
    Order selectByPrimaryKey(String orderId);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * 根据主键选择性更新记录
     * @param record
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * 根据主键更新记录
     * @param record
     */
    int updateByPrimaryKey(Order record);
}