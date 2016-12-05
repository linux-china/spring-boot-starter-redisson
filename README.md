Spring Boot Starter Redisson
=============================================
在Spring Boot下整合Redisson,方便客户端使用.

### 如何使用

* 在Spring Boot项目的pom.xml中添加以下依赖:

          <dependency>
                 <groupId>org.mvnsearch.spring.boot</groupId>
                 <artifactId>spring-boot-starter-redisson</artifactId>
                 <version>1.0.0-SNAPSHOT</version>
          </dependency>

* 在spring-boot-starter-redisson是依赖spring-boot-starter-redis的配置,所以你只需要加入spring redis的相关配置即可,如下:
                    
          spring.redis.host=localhost

* 接下来在你的代码中直接应用cacheManager，然后就可以啦。
        
            @Autowired
            private RedissonClient redissonClient;

### spring-boot-start-hibernate5提供的服务

* org.redisson.RedissonClient: Redisson Client

### 参考文档

* Redisson Site: http://redisson.org/
* Redisson github: https://github.com/mrniko/redisson/wiki/Usage-examples