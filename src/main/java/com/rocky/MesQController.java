package com.rocky;

import com.miaMesQ.First;
import com.miaMesQ.Mes;
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
    private First first;

    @GetMapping
    public void a(@RequestParam("s") String s)throws Exception{

        Mes mes = new Mes(s);
        first.pushMes(mes);
        System.out.println("ok");
    }

}
