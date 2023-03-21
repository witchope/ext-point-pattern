package cn.hackzone.ext.javaspi.impl;

import cn.hackzone.ext.javaspi.IMessageServer;

public class EmailServer implements IMessageServer {

    @Override
    public String type() {
        return "email";
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("this is email's message! " + message);
    }
}
