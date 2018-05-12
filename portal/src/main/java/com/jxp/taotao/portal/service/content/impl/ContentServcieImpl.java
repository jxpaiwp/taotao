package com.jxp.taotao.portal.service.content.impl;

import com.jxp.taotao.pojo.Content;
import com.jxp.taotao.portal.service.content.ContentService;
import com.jxp.taotao.utils.HttpClientUtil;
import com.jxp.taotao.utils.JsonUtils;
import com.jxp.taotao.utils.TaotaoResult;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/29
 * Time: 16:08
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class ContentServcieImpl implements ContentService {
    @Value("${REST_BASE_URL}")
    private String restBaseUrl;

    @Value("${REST_INDEX_AD_URL}")
    private String restIndexAdUrl;
    @Override
    public String getContentList() {
        String result = HttpClientUtil.doGet(restBaseUrl + restIndexAdUrl);
        TaotaoResult taotaoResult = TaotaoResult.formatToList(result, Content.class);
        List<Content> lists = (List<Content>) taotaoResult.getData();
        List<Map> resultList = new ArrayList<>();
        for (Content content : lists) {
            Map map = new HashMap();
            map.put("src", content.getPic());
            map.put("height", 240);
            map.put("width", 670);
            map.put("srcB", content.getPic2());
            map.put("widthB", 550);
            map.put("height", 240);
            map.put("href", content.getUrl());
            map.put("alt", content.getSubTitle());
            resultList.add(map);
        }
        return JsonUtils.objectToJson(resultList);
    }
}
