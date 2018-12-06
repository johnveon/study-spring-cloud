package com.lichking.stuuseredgeservice.feign;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @author zhoufe
 * @date 2018/11/29 17:47
 */
@Configuration
public class FeignConfig {
    /*
     * 重试间隔为 100 毫秒，最大重试时间为 1 秒，重试次数为 5 次。
     */
    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1), 5);
    }

}
