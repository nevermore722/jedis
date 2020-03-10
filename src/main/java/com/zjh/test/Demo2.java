package com.zjh.test;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/10 22:13
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Demo2 {

  @Test
  public void test1() {
    Jedis jedis = new Jedis();
    Set<HostAndPort> set = new HashSet<HostAndPort>();
    set.add(new HostAndPort("192.168.58.150", 7001));
    set.add(new HostAndPort("192.168.58.150", 7002));
    set.add(new HostAndPort("192.168.58.150", 7003));
    set.add(new HostAndPort("192.168.58.150", 7004));
    set.add(new HostAndPort("192.168.58.150", 7005));
    set.add(new HostAndPort("192.168.58.150", 7006));
    JedisCluster cluster = new JedisCluster(set);

    String result = cluster.get("a");
    System.out.println(result);
  }

}
