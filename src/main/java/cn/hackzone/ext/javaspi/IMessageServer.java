package cn.hackzone.ext.javaspi;

/**
 * IMessage 服务器接口
 *
 * @author maxwell
 * @date 2023/03/21
 */
public interface IMessageServer {

    String type();

    /**
     * 发送消息
     *
     * @param message 讯息
     */
    void sendMessage(String message);

}
