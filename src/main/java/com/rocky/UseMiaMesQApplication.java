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
@ComponentScan({"com.miaMesQ","com.rocky"})
public class UseMiaMesQApplication {

    @Resource
    private Second second;

    public static void main(String[] args) {
        SpringApplication.run(UseMiaMesQApplication.class, args);
    }

    @Bean
    public First createFirst(){
        second.setClazz(MesQService.class);
        second.setRetry(3);
        return new First(second);
    }

}
