package com.jxp.taotao.dao;

import com.jxp.taotao.pojo.ContentCategory;
import com.jxp.taotao.pojo.ContentCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentCategoryMapper {
    /**
     * 构造方法
     * @param example
     */
    long countByExample(ContentCategoryExample example);

    /**
     * 构造方法
     * @param example
     */
    int deleteByExample(ContentCategoryExample example);

    /**
     * 根据主键删除记录
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 根据对象插入记录
     * @param record
     */
    int insert(ContentCategory record);

    /**
     * 根据对象选择性插入记录
     * @param record
     */
    int insertSelective(ContentCategory record);

    /**
     * 构造方法
     * @param example
     */
    List<ContentCategory> selectByExample(ContentCategoryExample example);

    /**
     * 根据主键返回单条记录
     * @param id
     */
    ContentCategory selectByPrimaryKey(Long id);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") ContentCategory record, @Param("example") ContentCategoryExample example);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") ContentCategory record, @Param("example") ContentCategoryExample example);

    /**
     * 根据主键选择性更新记录
     * @param record
     */
    int updateByPrimaryKeySelective(ContentCategory record);

    /**
     * 根据主键更新记录
     * @param record
     */
    int updateByPrimaryKey(ContentCategory record);
}