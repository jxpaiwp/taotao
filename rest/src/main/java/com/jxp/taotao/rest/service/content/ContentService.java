package com.jxp.taotao.rest.service.content;

import com.jxp.taotao.pojo.Content;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/28
 * Time: 23:34
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface ContentService {
    /**
     * 根据id返回内容列表
     * @param contentId
     * @return
     */
    List<Content> getContentList(Long contentId);

}
