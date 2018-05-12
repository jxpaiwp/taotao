package com.jxp.taotao.rest.dao;

/**
 * 封装类:
 *  jedis单机版和jedis集群版
 * User: jason
 * Date: 2018/5/1
 * Time: 8:09
 */
public interface JedisClient {
    /**
     * 获取key对应的value
     * @param key
     * @return
     */
    String get(String key);

    /**
     * 设置key和value
     * @param key
     * @param value
     * @return
     */
    String set(String key, String value);

    /**
     * 根据hash和key获取对应的value
     * @param hash
     * @param key
     * @return
     */
    String hget(String hash, String key);

    /**
     * 根据hash和key设置对应的value
     * @param hash
     * @param key
     * @param value
     * @return
     */
    Long hset(String hash, String key,String value);

    /**
     * 自增value++
     * @param key
     * @return
     */
    Long incr(String key);

    /**
     * 自减value--
     * @param key
     * @return
     */
    Long decr(String key);

    /**
     * 设置key的失效时间
     * @param key
     * @param second
     * @return
     */
    Long expire(String key,Integer second);

    /**
     * 查询key的实现时间
     * @param key
     * @return
     */
    Long ttl(String key);

    /**
     * 删除key
     * @param key
     * @return
     */
    Long del(String key);
}
