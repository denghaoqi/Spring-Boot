package com.base.demo.system.utils;

import java.util.UUID;

/**
 * UUID生成工具类
 *
 * @author denghq
 * @version v1.0
 * @date 2018/8/15 10:58
 */
public class UUIDUtil {

    /**
     * 获取一个UUID字符串
     *
     * @return UUID字符串
     */
    public static String getUUID() {
        //随机产生一个UUID
        UUID uuid = UUID.randomUUID();
        String suuid = uuid.toString().replaceAll("-", "");
        return suuid;
    }
}
