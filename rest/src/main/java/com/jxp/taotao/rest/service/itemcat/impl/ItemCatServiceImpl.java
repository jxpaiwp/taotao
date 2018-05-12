package com.jxp.taotao.rest.service.itemcat.impl;

import com.jxp.taotao.dao.ItemCatMapper;
import com.jxp.taotao.pojo.ItemCat;
import com.jxp.taotao.pojo.ItemCatExample;
import com.jxp.taotao.rest.bean.itemcat.CatNode;
import com.jxp.taotao.rest.bean.itemcat.CatResult;
import com.jxp.taotao.rest.service.itemcat.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/24
 * Time: 23:28
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private ItemCatMapper itemCatMapper;
    @Override
    public CatResult getItemCatList() {
        // 递归查询
        CatResult catResult = new CatResult();
        catResult.setData(getCatlist(0L));
        return catResult;
    }

    /**
     * 查询分类分页查询
     * @param parendId
     * @return
     */
    public List<?> getCatlist(Long parendId){
        ItemCatExample example = new ItemCatExample();
        ItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parendId);
        // 执行查询
        List<ItemCat> itemCats = this.itemCatMapper.selectByExample(example);
        // 返回值
        List resultCatNodes = new ArrayList<>();
        for (ItemCat itemCat :itemCats) {
            if (itemCat.getIsParent()){
                CatNode catNode = new CatNode();
                if (parendId==0){
                    catNode.setName("<a href='/products/"+itemCat.getId()+".html'>"+itemCat.getName()+"</a>");
                }else {
                    catNode.setName(itemCat.getName());
                }
                catNode.setUrl("/products/"+itemCat.getId()+".html");
                catNode.setItem(getCatlist(itemCat.getId()));
                resultCatNodes.add(catNode);
            }else {
                resultCatNodes.add("/products/" + itemCat.getId() + ".html|" + itemCat.getName());
            }
        }

        return resultCatNodes;

    }
}
