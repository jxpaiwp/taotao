package com.jxp.taotao.rest.dao.impl;

import com.jxp.taotao.rest.dao.JedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.JedisCluster;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/5/1
 * Time: 8:27
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class JedisClientClusterImpl implements JedisClient{
    @Autowired
    private JedisCluster jedisCluster;

    @Override
    public String get(String key) {
        return jedisCluster.get(key);
    }

    @Override
    public String set(String key, String value) {
        return jedisCluster.set(key,value);
    }

    @Override
    public String hget(String hash, String key) {
        return jedisCluster.hget(hash,key);
    }

    @Override
    public Long hset(String hash, String key, String value) {
        return jedisCluster.hset(hash, key, value);
    }

    @Override
    public Long incr(String key) {
        return jedisCluster.incr(key);
    }

    @Override
    public Long decr(String key) {
        return jedisCluster.decr(key);
    }

    @Override
    public Long expire(String key, Integer second) {
        return jedisCluster.expire(key,second);
    }

    @Override
    public Long ttl(String key) {
        return jedisCluster.ttl(key);
    }

    @Override
    public Long del(String key) {
        return jedisCluster.del(key);
    }
}
