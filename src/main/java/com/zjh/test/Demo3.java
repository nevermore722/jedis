package com.zjh.test;

import javax.annotation.Resource;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.JedisCluster;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/10 22:32
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Demo3 {

  @Resource
  private JedisCluster jedisCluster;

  @Test
  public void test(){

  }
}
