package com.jxp.taotao.dao;

import com.jxp.taotao.pojo.User;
import com.jxp.taotao.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * 构造方法
     * @param example
     */
    long countByExample(UserExample example);

    /**
     * 构造方法
     * @param example
     */
    int deleteByExample(UserExample example);

    /**
     * 根据主键删除记录
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 根据对象插入记录
     * @param record
     */
    int insert(User record);

    /**
     * 根据对象选择性插入记录
     * @param record
     */
    int insertSelective(User record);

    /**
     * 构造方法
     * @param example
     */
    List<User> selectByExample(UserExample example);

    /**
     * 根据主键返回单条记录
     * @param id
     */
    User selectByPrimaryKey(Long id);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * 构造方法
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * 根据主键选择性更新记录
     * @param record
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 根据主键更新记录
     * @param record
     */
    int updateByPrimaryKey(User record);
}