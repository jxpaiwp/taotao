package com.jxp.taotao.service.item;

import com.jxp.taotao.easyui.DataGridResult;
import com.jxp.taotao.pojo.Item;
import com.jxp.taotao.pojo.ItemCat;
import com.jxp.taotao.utils.TaotaoResult;


/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/22
 * Time: 14:41
 * To change this template use File | Settings | File Templates.
 * Description:
 */

public interface ItemService {
    public Item selectItemById(Long id);
    public DataGridResult listsItemInfo(int page, int rows);
    public TaotaoResult saveItem(Item item);
}
