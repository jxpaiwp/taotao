package com.jxp.taotao.rest.dao.impl;

import com.jxp.taotao.rest.dao.JedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * 单机版redis
 * User: jason
 * Date: 2018/5/1
 * Time: 8:16
 */

public class JedisClientSingleImpl implements JedisClient {
    @Autowired
    private JedisPool jedisPool;
    @Override
    public String get(String key) {
        Jedis jedis = jedisPool.getResource();
        String resultString = jedis.get(key);
        jedis.close();
        return resultString;
    }

    @Override
    public String set(String key, String value) {
        Jedis jedis = jedisPool.getResource();
        String resultString = jedis.set(key,value);
        jedis.close();
        return resultString;
    }

    @Override
    public String hget(String hash, String key) {
        Jedis jedis = jedisPool.getResource();
        String resultString = jedis.hget(hash,key);
        jedis.close();
        return resultString;
    }

    @Override
    public Long hset(String hash, String key, String value) {
        Jedis jedis = jedisPool.getResource();
        Long resultLong = jedis.hset(hash,key,value);
        jedis.close();
        return resultLong;
    }

    @Override
    public Long incr(String key) {
        Jedis jedis = jedisPool.getResource();
        Long resultLong = jedis.incr(key);
        jedis.close();
        return resultLong;
    }

    @Override
    public Long decr(String key) {
        Jedis jedis = jedisPool.getResource();
        Long resultLong = jedis.decr(key);
        jedis.close();
        return resultLong;
    }

    @Override
    public Long expire(String key,Integer second) {
        Jedis jedis = jedisPool.getResource();
        Long resultLong = jedis.expire(key,second);
        jedis.close();
        return resultLong;
    }

    @Override
    public Long ttl(String key) {
        Jedis jedis = jedisPool.getResource();
        Long resultLong = jedis.ttl(key);
        jedis.close();
        return resultLong;
    }

    @Override
    public Long del(String key) {
        Jedis jedis = jedisPool.getResource();
        Long resultLong = jedis.del(key);
        jedis.close();
        return resultLong;
    }
}
