package com.jxp.taotao.service.content.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jxp.taotao.dao.ContentMapper;
import com.jxp.taotao.easyui.DataGridResult;
import com.jxp.taotao.pojo.Content;
import com.jxp.taotao.pojo.ContentExample;
import com.jxp.taotao.service.content.ContentService;
import com.jxp.taotao.utils.EasyUIResult;
import com.jxp.taotao.utils.TaotaoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/29
 * Time: 13:29
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class ContentServiceImpl  implements ContentService {
    @Autowired
    private ContentMapper contentMapper;


    @Override
    public DataGridResult listContent(Long categoryId, Integer page, Integer rows) {
        ContentExample example = new ContentExample();
        ContentExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdEqualTo(categoryId);
        PageHelper.startPage(page, rows);
        List<Content> contents = contentMapper.selectByExample(example);
        PageInfo<Content> pageInfo = new PageInfo<>(contents);
        DataGridResult dataGridResult = new DataGridResult();
        dataGridResult.setTotal(pageInfo.getTotal());
        dataGridResult.setRows(contents
        );
        return dataGridResult;
    }

    @Override
    public TaotaoResult saveContent(Content content) {
        content.setUpdated(new Date());
        content.setCreated(new Date());
        this.contentMapper.insert(content);
        return TaotaoResult.ok();
    }
}
