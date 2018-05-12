package com.jxp.taotao.dao;

import com.jxp.taotao.pojo.Content;
import com.jxp.taotao.pojo.ContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentMapper {
    /**
     * 构造方法
     * @param example
     */
    long countByExample(ContentExample example);

    /**
     * 构造方法
     * @param example
     */
    int deleteByExample(ContentExample example);

    /**
     * 根据主键删除记录
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 根据对象插入记录
     * @param record
     */
    int insert(Content record);

    /**
     * 根据对象选择性插入记录
     * @param record
     */
    int insertSelective(Content record);

    /**
     * 构造方法
     * @param example
     */
    List<Content> selectByExampleWithBLOBs(ContentExample example);

    /**
     * 构造方法
     * @param example
     */
    List<Content> selectByExample(ContentExample example);

    /**
     * 根据主键返回单条记录
     * @param id
     */
    Content selectByPrimaryKey(Long id);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Content record, @Param("example") ContentExample example);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExampleWithBLOBs(@Param("record") Content record, @Param("example") ContentExample example);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Content record, @Param("example") ContentExample example);

    /**
     * 根据主键选择性更新记录
     * @param record
     */
    int updateByPrimaryKeySelective(Content record);

    /**
     * 构造方法
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(Content record);

    /**
     * 根据主键更新记录
     * @param record
     */
    int updateByPrimaryKey(Content record);
}