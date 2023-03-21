package cn.hackzone.ext.strategyimprove.application.messageserver;

import cn.hackzone.ext.strategyimprove.sdk.ExtensionPoint;

/**
 * @author maxwell
 */
public interface MessageServerPoint extends ExtensionPoint {

    /**
     * 服务器类型
     * @return 服务器类型
     */
    String type();

    /**
     * 发送消息
     * @param message 消息
     */
    void sendMessage(String message);
}