package com.jxp.taotao.dao;

import com.jxp.taotao.pojo.ItemDesc;
import com.jxp.taotao.pojo.ItemDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemDescMapper {
    /**
     * 构造方法
     * @param example
     */
    long countByExample(ItemDescExample example);

    /**
     * 构造方法
     * @param example
     */
    int deleteByExample(ItemDescExample example);

    /**
     * 根据主键删除记录
     * @param itemId
     */
    int deleteByPrimaryKey(Long itemId);

    /**
     * 根据对象插入记录
     * @param record
     */
    int insert(ItemDesc record);

    /**
     * 根据对象选择性插入记录
     * @param record
     */
    int insertSelective(ItemDesc record);

    /**
     * 构造方法
     * @param example
     */
    List<ItemDesc> selectByExampleWithBLOBs(ItemDescExample example);

    /**
     * 构造方法
     * @param example
     */
    List<ItemDesc> selectByExample(ItemDescExample example);

    /**
     * 根据主键返回单条记录
     * @param itemId
     */
    ItemDesc selectByPrimaryKey(Long itemId);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") ItemDesc record, @Param("example") ItemDescExample example);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExampleWithBLOBs(@Param("record") ItemDesc record, @Param("example") ItemDescExample example);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") ItemDesc record, @Param("example") ItemDescExample example);

    /**
     * 根据主键选择性更新记录
     * @param record
     */
    int updateByPrimaryKeySelective(ItemDesc record);

    /**
     * 构造方法
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(ItemDesc record);

    /**
     * 根据主键更新记录
     * @param record
     */
    int updateByPrimaryKey(ItemDesc record);
}