package com.zjh.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/10 10:20
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Demo {

  /**
   * Junit5单元测试插件
   *
   * 直接测试方法，不用再编写主方法
   *
   * 在需要运行的方法上面添加@Test
   *
   * 方法有强制要求：
   *        必须是public
   *        必须是没有返回值
   *        没有参数的。
   *
   * 当前项目中不要有Test类
   */
  private static Jedis jedis;

  @BeforeAll
  static void mybefore(){
    System.out.println("mybefore");
     jedis = new Jedis("192.168.58.150",6379);
  }

  @AfterAll
  static void myafter(){
    System.out.println("myafter");
    jedis.close();
  }

  @Test
  public void testInsert(){
    System.out.println("test");
    //新增或修改
//    String result = jedis.set("address", "海淀");
//    System.out.println(result);
//    String result1 = jedis.set("address", "昌平");
//    System.out.println(result1);

/*    //删除
    Long index = jedis.del("address");
    System.out.println(index);*/

    //查询
    String result = jedis.get("address");
    System.out.println(result);
  }
}
