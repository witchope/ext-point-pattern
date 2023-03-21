package cn.hackzone.ext.strategy;

/**
 * 摘要消息服务器
 *
 * @author maxwell
 * @date 2023/03/21
 */
public abstract class AbstractMessageServer implements IMessageServer {

    public void doCommon() {
        // 这里可以抽取一些公共流程
        System.out.println("执行公共流程");
        sendMessage("common message");
    }
}