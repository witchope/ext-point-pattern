package cn.hackzone.ext.javaspi;

import java.util.Objects;
import java.util.ServiceLoader;

/**
 * 消息服务器工厂
 *
 * @author maxwell
 * @date 2023/03/21
 */
public class MessageServerFactory {

    private final ServiceLoader<IMessageServer> messageServerServiceLoader = ServiceLoader.load(IMessageServer.class);

    public IMessageServer getByType(String type) {
        for (IMessageServer messageServer : messageServerServiceLoader) {
            if (Objects.equals(messageServer.type(), type)) {
                return messageServer;
            }
        }
        return null;
    }

}