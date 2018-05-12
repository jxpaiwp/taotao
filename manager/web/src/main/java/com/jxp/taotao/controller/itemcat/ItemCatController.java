package com.jxp.taotao.controller.itemcat;

import com.jxp.taotao.easyui.TreeNode;
import com.jxp.taotao.pojo.ItemCat;
import com.jxp.taotao.service.itemcat.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/22
 * Time: 18:20
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {

    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping("/list")
    @ResponseBody
    public List<TreeNode> listItemCat(@RequestParam(value = "id",defaultValue = "0")Long parentId){
        List listCat = new ArrayList();
        List<ItemCat> itemCats = this.itemCatService.listsItemCat(parentId);
        for (ItemCat itemCat : itemCats) {
            TreeNode treeNode = new TreeNode();
            treeNode.setId(itemCat.getId());
            treeNode.setText(itemCat.getName());
            treeNode.setState(itemCat.getIsParent()?"closed":"open");
            listCat.add(treeNode);
        }
        return listCat;
    }

}
