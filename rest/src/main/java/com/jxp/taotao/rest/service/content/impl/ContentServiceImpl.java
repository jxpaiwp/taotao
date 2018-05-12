package com.jxp.taotao.rest.service.content.impl;

import com.jxp.taotao.dao.ContentMapper;
import com.jxp.taotao.pojo.Content;
import com.jxp.taotao.pojo.ContentExample;
import com.jxp.taotao.rest.dao.JedisClient;
import com.jxp.taotao.rest.service.content.ContentService;
import com.jxp.taotao.utils.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/28
 * Time: 23:35
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class ContentServiceImpl implements ContentService {
    @Autowired
    private ContentMapper contentMapper;

    @Autowired
    private JedisClient jedisClient;
    @Value("${INDEX_CONTENT_REDIS_KEY}")
    private  String INDEX_CONTENT_REDIS_KEY;
    @Override
    public List<Content> getContentList(Long contentId) {
        // 获取缓存
        try {
            String resultCache = jedisClient.hget(INDEX_CONTENT_REDIS_KEY, contentId + "");
            if (!StringUtils.isEmpty(resultCache)) {
                // 把字符串转换成list
                List<Content> contents = JsonUtils.jsonToList(resultCache, Content.class);
                return contents;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        // 从数据库中获取数据
        ContentExample example = new ContentExample();
        ContentExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdEqualTo(contentId);
        List<Content> contents = this.contentMapper.selectByExample(example);
        // 向缓存中存入数据
        try {
            String cacheString = JsonUtils.objectToJson(contents);
            jedisClient.hset(INDEX_CONTENT_REDIS_KEY, contentId+"", cacheString);
        } catch (Exception e){
            e.printStackTrace();
        }
        return contents;
    }
}
