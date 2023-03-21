package cn.hackzone.ext.dubbospi.impl;

import cn.hackzone.ext.dubbospi.HumanService;

/**
 * 女性服务
 *
 * @author maxwell
 * @date 2023/03/21
 */
public class FemaleHumanServiceImpl implements HumanService {
    @Override
    public void say() {
        System.out.println("this is female human say!");
    }
}