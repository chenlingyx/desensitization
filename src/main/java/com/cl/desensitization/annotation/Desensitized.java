package com.cl.desensitization.annotation;

import com.cl.desensitization.enums.SensitiveTypeEnum;

import java.lang.annotation.*;


/**
 * 敏感 信息标记
 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Desensitized {

    /**脱敏类型(规则)**/
    SensitiveTypeEnum type();

    /**判断注解是否生效的方法*/
    String isEffictiveMethod() default "";

}
