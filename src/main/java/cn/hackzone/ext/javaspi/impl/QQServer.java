package cn.hackzone.ext.javaspi.impl;

import cn.hackzone.ext.javaspi.IMessageServer;

/**
 * QQ 服务器
 *
 * @author maxwell
 * @date 2023/03/21
 */
public class QQServer implements IMessageServer {

    @Override
    public String type() {
        return "QQ";
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("this is QQ's message! " + message);
    }
}