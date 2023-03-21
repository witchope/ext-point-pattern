package cn.hackzone.ext.dubbospi.impl;

import cn.hackzone.ext.dubbospi.HumanService;

/**
 * 男性服务
 *
 * @author maxwell
 * @date 2023/03/21
 */
public class MaleHumanServiceImpl implements HumanService {
    @Override
    public void say() {
        System.out.println("this is man human say!");
    }
}