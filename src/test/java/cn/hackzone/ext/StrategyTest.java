package cn.hackzone.ext;

import cn.hackzone.ext.strategy.IMessageServer;
import cn.hackzone.ext.strategy.MessageServerFactory;
import cn.hackzone.ext.strategy.impl.DingDingServer;
import cn.hackzone.ext.strategy.impl.EmailServer;
import cn.hackzone.ext.strategy.impl.QQServer;
import org.junit.jupiter.api.Test;

class StrategyTest {

    @Test
    void testStrategy() {
        /*
         * 初始化 MessageServerFactory，在Spring 容器中可使用构造器注入方式进行服务类进行自动注入
         */
        IMessageServer[] iMessageServers = new IMessageServer[]{
                new DingDingServer(),
                new EmailServer(),
                new QQServer()
        };
        MessageServerFactory messageServerFactory = new MessageServerFactory(iMessageServers);

        // 调用
        IMessageServer emailMessageServer = messageServerFactory.getByType("email");
        emailMessageServer.sendMessage("hello world");
    }
}