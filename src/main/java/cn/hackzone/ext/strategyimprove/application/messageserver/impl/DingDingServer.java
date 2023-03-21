package cn.hackzone.ext.strategyimprove.application.messageserver.impl;

import cn.hackzone.ext.strategyimprove.application.messageserver.MessageServerPoint;
import cn.hackzone.ext.strategyimprove.sdk.Extension;

/**
 * @author maxwell
 */
@Extension(bizId = "Message", useCase = "Ding", scenario = "success")
public class DingDingServer implements MessageServerPoint {

    @Override
    public String type() {
        return "DingDing";
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("this id DingDing's message! " + message);
    }
}