package com.jxp.taotao.dao;

import com.jxp.taotao.pojo.Item;
import com.jxp.taotao.pojo.ItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemMapper {
    /**
     * 构造方法
     * @param example
     */
    long countByExample(ItemExample example);

    /**
     * 构造方法
     * @param example
     */
    int deleteByExample(ItemExample example);

    /**
     * 根据主键删除记录
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 根据对象插入记录
     * @param record
     */
    int insert(Item record);

    /**
     * 根据对象选择性插入记录
     * @param record
     */
    int insertSelective(Item record);

    /**
     * 构造方法
     * @param example
     */
    List<Item> selectByExample(ItemExample example);

    /**
     * 根据主键返回单条记录
     * @param id
     */
    Item selectByPrimaryKey(Long id);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Item record, @Param("example") ItemExample example);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Item record, @Param("example") ItemExample example);

    /**
     * 根据主键选择性更新记录
     * @param record
     */
    int updateByPrimaryKeySelective(Item record);

    /**
     * 根据主键更新记录
     * @param record
     */
    int updateByPrimaryKey(Item record);
}