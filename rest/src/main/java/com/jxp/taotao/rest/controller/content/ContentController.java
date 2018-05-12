package com.jxp.taotao.rest.controller.content;

import com.jxp.taotao.pojo.Content;
import com.jxp.taotao.rest.service.content.ContentService;
import com.jxp.taotao.utils.ExceptionUtil;
import com.jxp.taotao.utils.TaotaoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/28
 * Time: 23:37
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
@RequestMapping("/content")
public class ContentController {


    @Autowired
    private ContentService contentService;

    /**
     *
     * @param contentId
     * @return
     */
    @RequestMapping(value = "/list/{contentId}",method = RequestMethod.GET)
    @ResponseBody
    public TaotaoResult getContentList(@PathVariable("contentId")Long contentId){
        try {
            List<Content> contentList = this.contentService.getContentList(contentId);
            return TaotaoResult.ok(contentList);
        }catch (Exception e){
            return TaotaoResult.build(500, ExceptionUtil.getStackTrace(e));
        }

    }
}
