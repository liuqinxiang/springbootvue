package org.lqx.framework.core.aop;

import org.springframework.objenesis.instantiator.annotations.Instantiator;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OperLog {
    String description() default "";
}