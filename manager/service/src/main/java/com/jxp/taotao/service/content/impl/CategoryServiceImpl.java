package com.jxp.taotao.service.content.impl;

import com.jxp.taotao.dao.ContentCategoryMapper;
import com.jxp.taotao.easyui.TreeNode;
import com.jxp.taotao.pojo.ContentCategory;
import com.jxp.taotao.pojo.ContentCategoryExample;
import com.jxp.taotao.service.content.CategoryService;
import com.jxp.taotao.utils.TaotaoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/27
 * Time: 21:56
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ContentCategoryMapper categoryMapper;

    @Override
    public List<TreeNode> getCategory(Long parentId) {
        ContentCategoryExample example = new ContentCategoryExample();
        ContentCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<TreeNode> listNodes = new ArrayList<>();
        List<ContentCategory> contentCategories = this.categoryMapper.selectByExample(example);
        for (ContentCategory contentCategory : contentCategories) {
            // 创建一个节点
            TreeNode treeNode = new TreeNode();
            treeNode.setId(contentCategory.getId());
            treeNode.setState(contentCategory.getIsParent()?"closed":"open");
            treeNode.setText(contentCategory.getName());
            listNodes.add(treeNode);
        }
        return listNodes;
    }

    @Override
    public TaotaoResult createCategory(Long parentId, String name) {
        ContentCategoryExample example = new ContentCategoryExample();
        ContentCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<ContentCategory> contentCategoryParent = categoryMapper.selectByExample(example);
        ContentCategory contentCategory = new ContentCategory();
        contentCategory.setParentId(parentId);
        contentCategory.setName(name);
        contentCategory.setStatus(1);
        contentCategory.setSortOrder(1);
        contentCategory.setCreated(new Date());
        contentCategory.setUpdated(new Date());

        Long id = contentCategory.getId();
        if (contentCategoryParent.get(0).getIsParent()){
            contentCategory.setIsParent(true);
        }else {
            contentCategory.setIsParent(false);
        }
        this.categoryMapper.insertSelective(contentCategory);
        return TaotaoResult.ok(contentCategory);
    }

    @Override
    public TaotaoResult updateCategory(Long id, String name) {
        ContentCategory contentCategory = new ContentCategory();
        contentCategory.setId(id);
        contentCategory.setName(name);
        this.categoryMapper.updateByPrimaryKeySelective(contentCategory);

        return TaotaoResult.ok();
    }

    @Override
    public TaotaoResult deleteCategory(Long id) {
        this.categoryMapper.deleteByPrimaryKey(id);
        return TaotaoResult.ok();
    }
}
