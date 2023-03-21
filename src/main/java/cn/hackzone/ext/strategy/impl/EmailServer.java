package cn.hackzone.ext.strategy.impl;

import cn.hackzone.ext.strategy.AbstractMessageServer;

/**
 * 邮件发送消息
 * @author maxwell
 * @date 2022-08-08 10:30
 */
public class EmailServer  extends AbstractMessageServer {

    @Override
    public String type() {
        return "email";
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("this is email's message! " + message);
    }
}
