package com.jxp.taotao.service.content;

import com.jxp.taotao.dao.ContentCategoryMapper;
import com.jxp.taotao.easyui.TreeNode;
import com.jxp.taotao.pojo.ContentExample;
import com.jxp.taotao.utils.TaotaoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/27
 * Time: 21:52
 * 内容管理
 */
public interface CategoryService {
    /**
     * 根据节点id创建内容管理
     * @param parentId
     * @return
     */
    List<TreeNode> getCategory(Long parentId);

    TaotaoResult createCategory(Long parentId,String name);
    TaotaoResult updateCategory(Long id,String name);
    TaotaoResult deleteCategory(Long id);
}
