package com.jxp.rest.jedis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

import java.io.IOException;
import java.security.Key;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/30
 * Time: 16:43
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class JedisTest {

    /**
     * 单机连接redis
     */
    @Test
    public  void testJedisSingle(){
        Jedis jedis = new Jedis("192.168.88.182", 6379);
        jedis.set("aa", "bb");
        String aa = jedis.get("aa");
        System.out.println(aa);
        jedis.close();

    }

    /**
     * 连接池连接redis
     */
    @Test
    public  void testJedisPool(){
        JedisPool pool = new JedisPool("192.168.88.182", 6379);
        Jedis jedis = pool.getResource();
//        jedis.set("key1", "bb");
        String aa = jedis.get("key1");
        System.out.println(aa);
        jedis.close();
        pool.close();
    }

    /**
     * 连接集群
     */
    @Test
    public void testJedisCluster(){
        HashSet<HostAndPort> nodes = new HashSet<>();
        nodes.add(new HostAndPort("192.168.88.182", 8001));
        nodes.add(new HostAndPort("192.168.88.182", 8002));
        nodes.add(new HostAndPort("192.168.88.182", 8003));
        nodes.add(new HostAndPort("192.168.88.182", 8004));
        nodes.add(new HostAndPort("192.168.88.182", 8005));
        nodes.add(new HostAndPort("192.168.88.182", 8006));
        JedisCluster cluster = new JedisCluster(nodes);
        cluster.set("key1", "111");
        String key1String = cluster.get("key1");
        System.out.println(key1String);

    }
    @Test
    public  void testJedisSpringTest(){
        ApplicationContext application = new ClassPathXmlApplicationContext("spring/applicationContext-redis.xml");
        JedisPool pool = (JedisPool) application.getBean("redisClient");
        Jedis jedis = pool.getResource();
        String key1 = jedis.get("key1");
        System.out.println(key1);
        Set<String> keys = jedis.keys("*");
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key);
        }
        jedis.close();
        pool.close();
    }
    @Test
    public  void testJedisSpringClusterTest() throws IOException {
        ApplicationContext application = new ClassPathXmlApplicationContext("spring/applicationContext-redis.xml");
        JedisCluster cluster = (JedisCluster) application.getBean("redisClient");
        String key11 = cluster.get("key1");
        System.out.println(key11);
        cluster.close();
    }
}
