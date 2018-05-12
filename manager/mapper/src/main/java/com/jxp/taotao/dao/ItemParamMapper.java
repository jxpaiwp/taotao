package com.jxp.taotao.dao;

import com.jxp.taotao.pojo.ItemParam;
import com.jxp.taotao.pojo.ItemParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemParamMapper {
    /**
     * 构造方法
     * @param example
     */
    long countByExample(ItemParamExample example);

    /**
     * 构造方法
     * @param example
     */
    int deleteByExample(ItemParamExample example);

    /**
     * 根据主键删除记录
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 根据对象插入记录
     * @param record
     */
    int insert(ItemParam record);

    /**
     * 根据对象选择性插入记录
     * @param record
     */
    int insertSelective(ItemParam record);

    /**
     * 构造方法
     * @param example
     */
    List<ItemParam> selectByExampleWithBLOBs(ItemParamExample example);

    /**
     * 构造方法
     * @param example
     */
    List<ItemParam> selectByExample(ItemParamExample example);

    /**
     * 根据主键返回单条记录
     * @param id
     */
    ItemParam selectByPrimaryKey(Long id);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") ItemParam record, @Param("example") ItemParamExample example);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExampleWithBLOBs(@Param("record") ItemParam record, @Param("example") ItemParamExample example);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") ItemParam record, @Param("example") ItemParamExample example);

    /**
     * 根据主键选择性更新记录
     * @param record
     */
    int updateByPrimaryKeySelective(ItemParam record);

    /**
     * 构造方法
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(ItemParam record);

    /**
     * 根据主键更新记录
     * @param record
     */
    int updateByPrimaryKey(ItemParam record);
}