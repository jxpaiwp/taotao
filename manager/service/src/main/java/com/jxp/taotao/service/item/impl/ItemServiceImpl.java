package com.jxp.taotao.service.item.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jxp.taotao.easyui.DataGridResult;
import com.jxp.taotao.service.item.ItemService;
import com.jxp.taotao.dao.ItemMapper;
import com.jxp.taotao.pojo.Item;
import com.jxp.taotao.pojo.ItemExample;
import com.jxp.taotao.utils.TaotaoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/22
 * Time: 14:43
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;

    public Item selectItemById(Long id){
//        Item item = this.itemMapper.selectByPrimaryKey(id);
//        itemMapper.insertSelective();
        ItemExample example=new ItemExample();
        ItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<Item> itemLists = this.itemMapper.selectByExample(example);
        if (itemLists!=null&& itemLists.size()!=0){
            Item item = itemLists.get(0);
            return item;
        }
        return null;
    }

    public DataGridResult listsItemInfo(int page,int rows){
        ItemExample example = new ItemExample();
        PageHelper.startPage(page, rows);
        List<Item> items = itemMapper.selectByExample(example);
        PageInfo<Item> pageInfo=new PageInfo<>(items);
        DataGridResult dataGridResult = new DataGridResult();
        dataGridResult.setTotal(pageInfo.getTotal());
        dataGridResult.setRows(items);
        return dataGridResult;
    }

    @Override
    public TaotaoResult saveItem(Item item) {
        item.setCreated(new Date());
        item.setStatus((byte) 1);
        item.setUpdated(new Date());
        this.itemMapper.insertSelective(item);
        return TaotaoResult.ok();
    }


}
