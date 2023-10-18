package com.nineteentools;

import com.nineteentools.core.authCodeUtil.AuthCode;
import com.nineteentools.core.authCodeUtil.constants.CharacterResources;
import com.nineteentools.http.spider.SpiderTool;
import org.jsoup.nodes.Document;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> collect = Arrays.stream(CharacterResources.types).collect(Collectors.toList());
        System.out.println(collect);
    }
}