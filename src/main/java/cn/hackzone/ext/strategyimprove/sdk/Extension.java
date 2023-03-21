package cn.hackzone.ext.strategyimprove.sdk;

import java.lang.annotation.*;

/**
 * @author maxwell
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Extension {
    /**
     * 业务 ID （电商业务）
     */
    String bizId() default "";

    /**
     * 具体用例 （支付用例）
     */
    String useCase() default "";

    /**
     * 具体场景（支付失败的场景）
     */
    String scenario() default "";
}
