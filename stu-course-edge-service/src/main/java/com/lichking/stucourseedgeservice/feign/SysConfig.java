package com.lichking.stucourseedgeservice.feign;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhoufe
 * @date 2018/11/30 15:34
 */
@Configuration
@RefreshScope
public class SysConfig {

    @Value("${server.port}")
    private String serverPort;

    @Value("${foo}")
    private String foo;


    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
}
