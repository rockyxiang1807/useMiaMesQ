package com.rocky;

import com.miaMesQ.First;
import com.miaMesQ.Second;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.annotation.Resource;

@EnableAsync
@SpringBootApplication
//@ComponentScan({"com.miaMesQ","填写自己启动类所在的包名或者填写想要扫描的包名，否则将不会扫描到自己所写的bean"})
@ComponentScan({"com.miaMesQ","com.rocky"})
public class UseMiaMesQApplication {

    @Resource
    private Second second;

    public static void main(String[] args) {
        SpringApplication.run(UseMiaMesQApplication.class, args);
    }

    @Bean
    public First createFirst(){
        second.setClazz(MesQService.class); // 自己编写的实现类
        second.setRetry(3); // retry 最大次数
        return new First(second);
    }

}
