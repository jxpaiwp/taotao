package com.jxp.taotao.controller.content;

import com.jxp.taotao.easyui.DataGridResult;
import com.jxp.taotao.pojo.Content;
import com.jxp.taotao.service.content.ContentService;
import com.jxp.taotao.utils.EasyUIResult;
import com.jxp.taotao.utils.TaotaoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/29
 * Time: 13:24
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
@RequestMapping(value = "/content")
public class ContentController {

    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/query/list", method = RequestMethod.GET)
    @ResponseBody
    public DataGridResult selectContent(@RequestParam Long categoryId, Integer page, Integer rows) {
        DataGridResult contents = this.contentService.listContent(categoryId, page, rows);
        return contents;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public TaotaoResult saveContent(Content content){
        return this.contentService.saveContent(content);
    }
}
