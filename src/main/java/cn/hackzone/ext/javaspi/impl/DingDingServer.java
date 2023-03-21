package cn.hackzone.ext.javaspi.impl;

import cn.hackzone.ext.javaspi.IMessageServer;

/**
 * 钉钉服务器
 *
 * @author maxwell
 * @date 2023/03/21
 */
public class DingDingServer implements IMessageServer {

    @Override
    public String type() {
        return "DingDing";
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("this id DingDing's message! " + message);
    }

}