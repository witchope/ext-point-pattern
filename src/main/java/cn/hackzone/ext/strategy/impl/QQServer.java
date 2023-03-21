package cn.hackzone.ext.strategy.impl;

import cn.hackzone.ext.strategy.AbstractMessageServer;

/**
 * QQ server
 *
 * @author maxwell
 * @date 2023/03/21
 */
public class QQServer extends AbstractMessageServer {

    @Override
    public String type() {
        return "QQ";
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("this is QQ's message! " + message);
    }
}