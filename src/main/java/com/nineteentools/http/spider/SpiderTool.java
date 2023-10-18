package com.nineteentools.http.spider;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.List;

/**
 * @author: 19zfl
 * @description: java爬虫
 * @date 2023-10-17
 */
public class SpiderTool {

    /**
     * @description: 爬取网页document元素
     * @param website 网页地址
     * @return
     */
    public static Document getDocumentElement(String website) {
        Document document;
        try {
            document = Jsoup.connect(website).get();
        } catch (IOException e) {
            throw new RuntimeException("Requset timeout!");
        }
        return document;
    }

}
