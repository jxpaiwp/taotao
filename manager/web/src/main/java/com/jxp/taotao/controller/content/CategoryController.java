package com.jxp.taotao.controller.content;

import com.jxp.taotao.easyui.TreeNode;
import com.jxp.taotao.service.content.CategoryService;
import com.jxp.taotao.utils.TaotaoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/27
 * Time: 21:48
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
@RequestMapping(value = "/content/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public List<TreeNode> getCategory(@RequestParam(value = "id",defaultValue = "0")Long parenId){
        List<TreeNode> category = this.categoryService.getCategory(parenId);
        return category;

    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public TaotaoResult createCategory(@RequestParam(value = "parentId",defaultValue = "0")Long parenId, String name){

        TaotaoResult category = this.categoryService.createCategory(parenId, name);
        return category;

    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public TaotaoResult updateCategory(Long id, String name){

        TaotaoResult category = this.categoryService.updateCategory(id, name);
        return category;

    }
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public TaotaoResult updateCategory(@RequestParam(value = "id") Long id){

        TaotaoResult category = this.categoryService.deleteCategory(id);
        return category;

    }
}
