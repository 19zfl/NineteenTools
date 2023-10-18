package com.nineteentools.core.authCodeUtil;

import com.nineteentools.core.authCodeUtil.constants.CharacterResources;
import com.nineteentools.core.authCodeUtil.utils.VerificationCodeUtil;
import com.nineteentools.system.exception.CustomException;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: 19zfl
 * @description: 验证码工具（链式调用）
 * @date 2023-10-18
 */
public class AuthCode {

    public static String allCharWithoutNumber(Boolean flag) {
            return flag ? VerificationCodeUtil.SixCharRandomVerificationCode() : VerificationCodeUtil.SixCharNumberRandomVerificationCode();
    }

    public static String verificationCode(String type, Integer bit) {

        // 判断是否遵循规则
        List<String> typeList = Arrays.stream(CharacterResources.types).collect(Collectors.toList());
        if (!typeList.contains(type)) {

        }

        return null;
    }

}
