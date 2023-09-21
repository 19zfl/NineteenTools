package com.nineteentools.core.idUtil;

import java.util.UUID;

/**
 * @author: 19zfl
 * @description: uuid工具
 * @date 2023-09-20
 */
public class FastIdUtil {

    // UUID
    public static String RandomUuidUtil() {
        return UUID.randomUUID().toString();
    }



    // 文件命名uuid + 时间戳
    public static String FileNameUUID() {
        String prefix = UUID.randomUUID().toString();
        String suffix = String.valueOf(System.currentTimeMillis());
        return prefix + suffix;
    }

}
