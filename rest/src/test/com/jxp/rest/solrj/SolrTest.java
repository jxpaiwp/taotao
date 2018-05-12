package com.jxp.rest.solrj;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/5/2
 * Time: 23:15
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class SolrTest {

    @Test
    public void addDocument() throws IOException, SolrServerException {
        // 创建一个连接
        String url = "http://192.168.88.183:8080/solr";
        SolrClient solrClient = new HttpSolrClient.Builder(url).build();
        // 创建一个文档对象
        SolrInputDocument document = new SolrInputDocument();
        document.addField("id", "test001");
        document.addField("item_title", "测试商品");
        document.addField("item_price", 123123);
        // 吧文档对象写入到索引库
        solrClient.add(document);
        // 提交
        solrClient.commit();
    }
    @Test
    public  void deleteDocument() throws IOException, SolrServerException {
        String url = "http://192.168.88.183:8080/solr";
        HttpSolrClient client = new HttpSolrClient.Builder(url).build();
//        client.deleteById("test001");
        client.deleteByQuery("*:*");
        client.commit();
    }
}
