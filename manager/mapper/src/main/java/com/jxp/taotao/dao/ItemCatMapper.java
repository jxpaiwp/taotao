package com.jxp.taotao.dao;

import com.jxp.taotao.pojo.ItemCat;
import com.jxp.taotao.pojo.ItemCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemCatMapper {
    /**
     * 构造方法
     * @param example
     */
    long countByExample(ItemCatExample example);

    /**
     * 构造方法
     * @param example
     */
    int deleteByExample(ItemCatExample example);

    /**
     * 根据主键删除记录
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 根据对象插入记录
     * @param record
     */
    int insert(ItemCat record);

    /**
     * 根据对象选择性插入记录
     * @param record
     */
    int insertSelective(ItemCat record);

    /**
     * 构造方法
     * @param example
     */
    List<ItemCat> selectByExample(ItemCatExample example);

    /**
     * 根据主键返回单条记录
     * @param id
     */
    ItemCat selectByPrimaryKey(Long id);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") ItemCat record, @Param("example") ItemCatExample example);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") ItemCat record, @Param("example") ItemCatExample example);

    /**
     * 根据主键选择性更新记录
     * @param record
     */
    int updateByPrimaryKeySelective(ItemCat record);

    /**
     * 根据主键更新记录
     * @param record
     */
    int updateByPrimaryKey(ItemCat record);
}