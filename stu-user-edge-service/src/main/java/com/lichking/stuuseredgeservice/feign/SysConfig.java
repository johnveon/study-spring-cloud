package com.lichking.stuuseredgeservice.feign;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhoufe
 * @date 2018/12/5 15:42
 */
@Configuration
@RefreshScope
public class SysConfig {

    @Value("${server.port}")
    private String serverPort;

    @Value("${boo}")
    private String boo;

    public String getBoo() {
        return boo;
    }

    public void setBoo(String boo) {
        this.boo = boo;
    }

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }
}
