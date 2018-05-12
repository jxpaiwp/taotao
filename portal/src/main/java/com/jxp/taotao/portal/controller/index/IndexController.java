package com.jxp.taotao.portal.controller.index;

import com.jxp.taotao.pojo.Content;
import com.jxp.taotao.portal.service.content.ContentService;
import com.jxp.taotao.utils.TaotaoResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/24
 * Time: 0:30
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
public class IndexController {
    @Autowired
    private ContentService contentService;
    @RequestMapping("/index")
    public String showIndex(Model model){
        String contentList = contentService.getContentList();
        model.addAttribute("ad1", contentList);
        return "index";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST,consumes = "application/json;charset=UTF-8")
    @ResponseBody
    public String post(@RequestBody String name, Integer age){
        return "this is post request.param name="+name+";age="+age;
    }
}
