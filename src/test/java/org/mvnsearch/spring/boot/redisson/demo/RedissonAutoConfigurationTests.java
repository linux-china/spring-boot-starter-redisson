package org.mvnsearch.spring.boot.redisson.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.RedissonClient;
import org.redisson.core.RMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * redisson auto configuration tests
 *
 * @author linux_china
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RedissonDemoApplication.class)
public class RedissonAutoConfigurationTests {
    @Autowired
    RedissonClient redissonClient;

    @Test
    public void testRedisson() throws Exception {
        RMap<Integer, String> users = redissonClient.<Integer, String>getMap("users");
        users.put(1, "linux_china");
        System.out.println(users.get(1));
        users.remove(1);
    }

}
