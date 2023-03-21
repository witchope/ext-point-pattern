package cn.hackzone.ext.strategyimprove.sdk;

/**
 * 扩展路由器工厂
 *
 * @author maxwell
 * @date 2023/03/21
 */
public class ExtensionRouterFactory {

    public static <T extends ExtensionPoint> T getPlugin(String bizId, String name) {
        return ExtensionPluginBoot.getInstance().getNameExtension(bizId, name);
    }
}