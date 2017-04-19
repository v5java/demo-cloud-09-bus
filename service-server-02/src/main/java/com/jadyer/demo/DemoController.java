package com.jadyer.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//支持配置中心属性热加载
@RefreshScope
@RestController
@RequestMapping("/demo/config")
public class DemoController {
    //获取配置中心的属性
    @Value("${host.ifs}")
    private String ifsHost;

    @GetMapping("/getHost")
    public String getHost(){
        return this.ifsHost;
    }
}