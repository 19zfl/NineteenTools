package com.nineteentools.core.authCodeUtil.utils;

import com.nineteentools.core.authCodeUtil.constants.AnonymousVariableResources;
import com.nineteentools.core.authCodeUtil.constants.CharacterResources;

import java.util.Random;

/**
 * @author: 19zfl
 * @description: 验证码工具
 * @date 2023-09-19
 */
public class VerificationCodeUtil {

    static Random random = new Random();
    static char[] chars;

    // 自定义位数验证码(数字)
    public static String CustomBitNumberVerificationCode(int bit) {
        chars = CharacterResources.RS_ONLYNUMBERCHAR.toCharArray();
        for (int i = 0; i < bit - 1; i++) {
            int index = random.nextInt(chars.length);
            AnonymousVariableResources.VerificationCode += chars[index];
        }
        return AnonymousVariableResources.VerificationCode;
    }

    // 自定义位数验证码(字母)
    public static String CustomBitCharVerificationCode(int bit) {
        chars = CharacterResources.RS_ONLYCHAR.toCharArray();
        for (int i = 0; i < bit - 1; i++) {
            int index = random.nextInt(chars.length);
            AnonymousVariableResources.VerificationCode += chars[index];
        }
        return AnonymousVariableResources.VerificationCode;
    }

    // 六位验证码(字母数字随机)
    public static String SixCharNumberRandomVerificationCode() {

        chars = CharacterResources.RS_MAIN_CHAR.toCharArray();
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

        chars = CharacterResources.RS_ONLYCHAR.toCharArray();
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(10);
            AnonymousVariableResources.VerificationCode += chars[index];
        }

        return AnonymousVariableResources.VerificationCode;
    }

    // 六位验证码（全大写）
    public static String SixUppercaseRandomVerificationCode() {

        chars = CharacterResources.RS_ONLYUPPERCHAR.toCharArray();
        while (true) {
            int index = random.nextInt(chars.length);
            AnonymousVariableResources.VerificationCode += chars[index];
            if (AnonymousVariableResources.VerificationCode.length() > 6) {
                break;
            }
        }

        return AnonymousVariableResources.VerificationCode;
    }

    // 四位验证码（纯数字）
    public static String FourRandomVerificationCode() {

        for (int i = 0; i < 4; i++) {
            int num = random.nextInt(10);
            AnonymousVariableResources.VerificationCode += num;
        }

        return AnonymousVariableResources.VerificationCode;
    }

}
