package cn.hackzone.ext.strategyimprove.sdk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author maxwell
 */
public class ExtensionPluginBoot {

    private static volatile ExtensionPluginBoot instance = null;

    /**
     * bizId --> (name, instance)
     */
    private static final Map<String, Map<String, ExtensionPoint>> EXTEND_PLUGINS = new LinkedHashMap<>();

    public static ExtensionPluginBoot getInstance() {
        if (instance == null) {
            synchronized (ExtensionPluginBoot.class) {
                if (instance == null) {
                    new ExtensionPluginBoot().init();
                }
            }
        }
        return instance;
    }

    public void init() {
        // 加载扩展点，将服务实现类 put 进 extendPlugins
        loadExtendPluginClasses();
        instance = this;
    }

    private static void loadExtendPluginClasses() {
        // 这里可使用扫描注解、配置文件等方式
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Map<String, Object> beansWithAnnotation = context.getBeansWithAnnotation(Extension.class);
        for (Map.Entry<String, Object> entry : beansWithAnnotation.entrySet()) {
            ExtensionPoint value = (ExtensionPoint) entry.getValue();
            Extension extAnnotation = value.getClass().getAnnotation(Extension.class);
            String bizId = extAnnotation.bizId();
            String useCase = extAnnotation.useCase();
            Map<String, ExtensionPoint> map = EXTEND_PLUGINS.computeIfAbsent(bizId, k -> new HashMap<>(16));
            map.put(useCase, value);
        }
    }


    /**
     * @param name 名称
     * @param <T>  扩展类实例
     * @return 根据扩展接口和名称，获取具体的实现
     */
    public <T extends ExtensionPoint> T getNameExtension(String bizId, String name) {
        Map<String, ExtensionPoint> pluginMap = EXTEND_PLUGINS.get(bizId);
        if (pluginMap == null) {
            return null;
        }
        return (T) pluginMap.get(name);
    }
}