package cn.hackzone.ext;

import cn.hackzone.ext.dubbospi.HumanService;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.jupiter.api.Test;

class DubboSpiTest {

    @Test
    void testDubboSpi() {
        HumanService maleHumanService = ExtensionLoader.getExtensionLoader(HumanService.class)
                .getExtension("maleHumanService");
        maleHumanService.say();
    }
}
