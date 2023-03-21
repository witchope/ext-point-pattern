package cn.hackzone.ext.strategy;

import java.util.HashMap;
import java.util.Map;

public class MessageServerFactory {

    private final Map<String, IMessageServer> messageServerMap = new HashMap<>();

    private final IMessageServer[] iMessageServers;

    public MessageServerFactory(IMessageServer[] iMessageServers) {
        this.iMessageServers = iMessageServers;
        // init map
        for (IMessageServer iMessageServer : iMessageServers) {
            messageServerMap.put(iMessageServer.type(), iMessageServer);
        }
    }

    public IMessageServer getByType(String type) {
        return messageServerMap.get(type);
    }
}