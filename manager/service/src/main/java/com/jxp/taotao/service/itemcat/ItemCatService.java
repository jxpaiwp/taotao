package com.jxp.taotao.service.itemcat;

import com.jxp.taotao.pojo.ItemCat;

import java.util.List;

public interface ItemCatService {

    public List<ItemCat> listsItemCat(Long parentId);

}
