package com.example;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mvnsearch.spring.boot.redisson.RedissonAutoConfiguration;
import org.redisson.RedissonClient;
import org.redisson.core.RList;
import org.redisson.core.RMap;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * redisson auto configuration tests
 *
 * @author linux_china
 */
@Configuration
public class Hibernate5AutoConfigurationTests {
    private static ApplicationContext context;

    @BeforeClass
    public static void setUp() {
        context = new AnnotationConfigApplicationContext(
                Hibernate5AutoConfigurationTests.class, RedissonAutoConfiguration.class);
    }

    @Bean
    public RedisProperties redisProperties() {
        RedisProperties properties = new RedisProperties();
        properties.setHost("192.168.99.100");
        return properties;
    }

    @Test
    public void testRedisson() throws Exception {
        RedissonClient redissonClient = context.getBean(RedissonClient.class);
        RMap<Integer, String> users = redissonClient.<Integer, String>getMap("users");
        users.put(1, "linux_china");
        System.out.println(users.get(1));
        users.remove(1);
    }

}
