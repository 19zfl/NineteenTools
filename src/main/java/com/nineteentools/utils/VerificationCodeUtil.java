package com.nineteentools.utils;

import com.nineteentools.constants.AnonymousVariableResources;
import com.nineteentools.constants.CharacterResources;

import java.util.Random;

/**
 * @author: 19zfl
 * @description:
 * @date 2023-09-19
 */
public class VerificationCodeUtil {

    // 六位验证码(字母数字随机)
    public static String SixCharNumberRandomVerificationCode() {

        char[] chars = CharacterResources.RS_MAIN_CHAR.toCharArray();
        Random random = new Random();
        while (true) {
            int i = random.nextInt(chars.length);
            AnonymousVariableResources.VerificationCode += chars[i];
            if (AnonymousVariableResources.VerificationCode.length() == 6) {
                break;
            }
        }

        return AnonymousVariableResources.VerificationCode;
    }

    // 六位验证码（纯字母）
    public static String SixCharRandomVerificationCode() {

        char[] chars = CharacterResources.RS_ONLYCHAR.toCharArray();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(10);
            AnonymousVariableResources.VerificationCode += chars[index];
        }

        return AnonymousVariableResources.VerificationCode;
    }

    // 四位验证码（纯数字）
    public static String FourRandomVerificationCode() {

        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int num = random.nextInt(10);
            AnonymousVariableResources.VerificationCode += num;
        }

        return AnonymousVariableResources.VerificationCode;
    }


}
