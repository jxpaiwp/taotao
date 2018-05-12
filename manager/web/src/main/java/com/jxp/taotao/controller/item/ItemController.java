package com.jxp.taotao.controller.item;

import com.jxp.taotao.easyui.DataGridResult;
import com.jxp.taotao.pojo.Item;
import com.jxp.taotao.service.item.ItemService;
import com.jxp.taotao.utils.TaotaoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/22
 * Time: 15:58
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;


    /**
     * 单个商品获取
     * @param itemId
     * @return
     */
    @RequestMapping(value = "/item/{itemId}",method = RequestMethod.GET)
    @ResponseBody
    public Item getItemById(@PathVariable()Long itemId){
        Item item = this.itemService.selectItemById(itemId);
        return item;
    }

    /**
     * 商品列表返回
     * @return
     */
    @RequestMapping("/item/list")
    @ResponseBody
    public DataGridResult selectItemLists(Integer page,Integer rows){
        DataGridResult dataGridResult = this.itemService.listsItemInfo(page, rows);
        return dataGridResult;
    }
    /**
     * 商品列表返回
     * @return
     */
    @RequestMapping("/item/save")
    @ResponseBody
    public TaotaoResult saveItem(Item item){
        TaotaoResult taotaoResult = this.itemService.saveItem(item);
        return taotaoResult;
    }

}
