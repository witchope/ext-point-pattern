package cn.hackzone.ext.strategyimprove.application.messageserver.impl;

import cn.hackzone.ext.strategyimprove.application.messageserver.MessageServerPoint;
import cn.hackzone.ext.strategyimprove.sdk.Extension;

/**
 * @author maxwell
 */
@Extension(bizId = "Message", useCase = "Email", scenario = "success")
public class EmailServer implements MessageServerPoint {

    @Override
    public String type() {
        return "email";
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("this is email's message! " + message);
    }
}