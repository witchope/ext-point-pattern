package cn.hackzone.ext.dubbospi;

import org.apache.dubbo.common.extension.SPI;

/**
 * 人类服务
 *
 * @author maxwell
 * @date 2022-08-08 12:08
 */
@SPI
public interface HumanService {

    /**
     * 说话的能力
     */
    void say();

}