package cn.hackzone.ext.strategyimprove.application.humanservice.impl;

import cn.hackzone.ext.strategyimprove.application.humanservice.HumanServiceExtensionPoint;
import cn.hackzone.ext.strategyimprove.sdk.Extension;

@Extension(bizId = "Human", useCase = "Female", scenario = "success")
public class FemaleHumanServiceExtensionPointImpl implements HumanServiceExtensionPoint {

    @Override
    public void say() {
        System.out.println("this is female human say!");
    }
}