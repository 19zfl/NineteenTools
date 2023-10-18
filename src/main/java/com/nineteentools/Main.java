package com.nineteentools;

import com.nineteentools.http.spider.SpiderTool;
import org.jsoup.nodes.Document;

public class Main {
    public static void main(String[] args) {
        Document documentElement = SpiderTool.getDocumentElement("https://wallhaven.cc/");
        System.out.println(documentElement);
    }
}