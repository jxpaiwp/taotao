package com.jxp.taotao.service.itemcat.impl;

import com.jxp.taotao.dao.ItemCatMapper;
import com.jxp.taotao.pojo.ItemCat;
import com.jxp.taotao.pojo.ItemCatExample;
import com.jxp.taotao.service.itemcat.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/22
 * Time: 18:15
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {
    @Autowired
    private ItemCatMapper itemCatMapper;
    @Override
    public  List<ItemCat> listsItemCat(Long parentId) {
        ItemCatExample example = new ItemCatExample();
        ItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<ItemCat> listsItemCat = this.itemCatMapper.selectByExample(example);
        return listsItemCat;
    }
}
