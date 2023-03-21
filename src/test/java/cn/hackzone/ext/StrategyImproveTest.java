package cn.hackzone.ext;

import cn.hackzone.ext.strategyimprove.application.humanservice.HumanServiceExtensionPoint;
import cn.hackzone.ext.strategyimprove.application.messageserver.MessageServerPoint;
import cn.hackzone.ext.strategyimprove.sdk.ExtensionRouterFactory;
import org.junit.jupiter.api.Test;

class StrategyImproveTest {

    @Test
    void testStrategyImprove() {
        // 使用 qq 服务器进行发送
        MessageServerPoint qqMessageServer = ExtensionRouterFactory.getPlugin("Message", "QQ");
        qqMessageServer.sendMessage("hello world");

        // 男人说话
        HumanServiceExtensionPoint maleHumanService = ExtensionRouterFactory.getPlugin("Human", "Male");
        maleHumanService.say();
    }
}