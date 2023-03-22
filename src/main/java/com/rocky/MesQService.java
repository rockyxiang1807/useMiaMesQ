package com.rocky;

import org.springframework.stereotype.Service;

/**
 * wenhui.xiang
 * 2023/03/22 4:31 下午
 */

public class MesQService {
    public static void operation(Object  s)throws Exception{
        Thread.sleep(10000L);
        System.out.println("operation"+s);
    }
    public static void faildHandler(Object s){
        System.out.println("faild"+s);
    }
}
