package com.rocky;

import org.springframework.stereotype.Service;

/**
 * wenhui.xiang
 * 2023/03/22 4:31 下午
 */

public class MesQService {
    // 正常执行的方法 命名须为 operation
    // 传参只有一个，如有多个参数建议将其封装到一个类中
    public static void operation(Object  s)throws Exception{
        Thread.sleep(10000L);
        System.out.println("operation"+s);
    }
    // 达到 retry 最大次数后执行的方法 命名须为 faildHandler
    // 传参同  operation
    public static void faildHandler(Object s){
        System.out.println("faild"+s);
    }
}
