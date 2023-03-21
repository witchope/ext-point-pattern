package cn.hackzone.ext.strategy.impl;

import cn.hackzone.ext.strategy.AbstractMessageServer;

/**
 * 钉钉发消息
 *
 * @author maxwell
 * @date 2022-08-08 10:31
 */
public class DingDingServer extends AbstractMessageServer {

    @Override
    public String type() {
        return "DingDing";
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("this id DingDing's message! " + message);
    }
}