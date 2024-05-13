package com.freerun.media.task;

import cn.hutool.jwt.JWT;

import java.util.HashMap;

public class app {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis() / 1000;
        HashMap<String, Object> contentInfo = new HashMap<>(1);
        contentInfo.put("audioVideoType","Original");
        HashMap<String, Object> urlAccessInfo = new HashMap<>(1);
        urlAccessInfo.put("domain","1317268999.vod-qcloud.com");
        urlAccessInfo.put("scheme","HTTPS");

        String a = JWT.create()
                .setKey("nX8qUmO733tmiJfZIE57".getBytes())
                .setPayload("appId", 1317268999)
                .setPayload("fileId", "1253642696928638737")
                .setPayload("contentInfo", contentInfo)
                .setPayload("currentTimeStamp", currentTime)
                .setPayload("expireTimeStamp", currentTime + 3600)
                .setPayload("urlAccessInfo", urlAccessInfo)
                .sign();
        System.out.println(a);
    }
}