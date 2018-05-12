package com.jxp.taotao.service.content;

import com.jxp.taotao.easyui.DataGridResult;
import com.jxp.taotao.pojo.Content;
import com.jxp.taotao.utils.EasyUIResult;
import com.jxp.taotao.utils.TaotaoResult;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/29
 * Time: 13:29
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface ContentService {
    DataGridResult listContent(Long categoryId, Integer page, Integer rows);

    TaotaoResult saveContent(Content content);
}
