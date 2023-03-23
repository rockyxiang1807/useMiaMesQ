package com.rocky;

import com.miaMesQ.Mes;
import com.miaMesQ.MesQEntrance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * wenhui.xiang
 * 2023/03/22 4:37 下午
 */
@RestController
@RequestMapping("/api")
public class MesQController {

    @Autowired
    private MesQEntrance mesQEntrance;

    @GetMapping
    public void a(@RequestParam("s") String s)throws Exception{ // 自行定义错误处理
        Mes mes = new Mes(s); // 消息实体类, s 可以是任意类型
        mesQEntrance.pushMes(mes);   // 发送消息
        System.out.println("ok");
    }

}
