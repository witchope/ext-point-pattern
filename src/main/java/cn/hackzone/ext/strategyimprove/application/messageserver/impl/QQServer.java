package cn.hackzone.ext.strategyimprove.application.messageserver.impl;

import cn.hackzone.ext.strategyimprove.application.messageserver.MessageServerPoint;
import cn.hackzone.ext.strategyimprove.sdk.Extension;

@Extension(bizId = "Message", useCase = "QQ", scenario = "success")
public class QQServer implements MessageServerPoint {

    @Override
    public String type() {
        return "QQ";
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("this is QQ's message! " + message);
    }
}