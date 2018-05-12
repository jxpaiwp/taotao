package com.jxp.taotao.dao;

import com.jxp.taotao.pojo.ItemParamItem;
import com.jxp.taotao.pojo.ItemParamItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemParamItemMapper {
    /**
     * 构造方法
     * @param example
     */
    long countByExample(ItemParamItemExample example);

    /**
     * 构造方法
     * @param example
     */
    int deleteByExample(ItemParamItemExample example);

    /**
     * 根据主键删除记录
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 根据对象插入记录
     * @param record
     */
    int insert(ItemParamItem record);

    /**
     * 根据对象选择性插入记录
     * @param record
     */
    int insertSelective(ItemParamItem record);

    /**
     * 构造方法
     * @param example
     */
    List<ItemParamItem> selectByExampleWithBLOBs(ItemParamItemExample example);

    /**
     * 构造方法
     * @param example
     */
    List<ItemParamItem> selectByExample(ItemParamItemExample example);

    /**
     * 根据主键返回单条记录
     * @param id
     */
    ItemParamItem selectByPrimaryKey(Long id);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") ItemParamItem record, @Param("example") ItemParamItemExample example);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExampleWithBLOBs(@Param("record") ItemParamItem record, @Param("example") ItemParamItemExample example);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") ItemParamItem record, @Param("example") ItemParamItemExample example);

    /**
     * 根据主键选择性更新记录
     * @param record
     */
    int updateByPrimaryKeySelective(ItemParamItem record);

    /**
     * 构造方法
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(ItemParamItem record);

    /**
     * 根据主键更新记录
     * @param record
     */
    int updateByPrimaryKey(ItemParamItem record);
}