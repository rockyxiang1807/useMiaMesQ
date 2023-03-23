package com.rocky;

import org.springframework.stereotype.Service;

/**
 * wenhui.xiang
 * 2023/03/22 4:31 下午
 */

public class MesQService {
    // 正常执行的方法 命名须为 normalProcess
    // 传参只有一个，如有多个参数建议将其封装到一个类中
    public static void normalProcess(Object  s)throws Exception{
        Thread.sleep(10000L);
        System.out.println("normalProcess "+s);
    }
    // 达到 retry 最大次数后执行的方法 命名须为 exceptionalProcess
    // 传参同  normalProcess
    public static void exceptionalProcess(Object s){
        System.out.println("exceptionalProcess "+s);
    }
}
