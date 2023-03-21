package cn.hackzone.ext;

import cn.hackzone.ext.javaspi.IMessageServer;
import cn.hackzone.ext.javaspi.MessageServerFactory;
import org.junit.jupiter.api.Test;

class JavaSpiTest {

    @Test
    void testJavaSpi() {
        // init message server factory（只实例化一次）
        MessageServerFactory messageServerFactory = new MessageServerFactory();

        // client invoke
        IMessageServer emailMessageServer = messageServerFactory.getByType("email");
        emailMessageServer.sendMessage("I am hungry");
    }
}