package com.nineteentools.core.idUtil;

import java.util.UUID;

/**
 * @author: 19zfl
 * @description: uuid工具
 * @date 2023-09-20
 */
public class fastIdUtil {

    // UUID
    public static String uuidUtil() {
        return UUID.randomUUID().toString();
    }

    // 文件命名uuid + 时间戳
    public static String fileNameUUID() {
        String prefix = UUID.randomUUID().toString();
        String suffix = String.valueOf(System.currentTimeMillis());
        return prefix + suffix;
    }

}
