package cn.grape.lion.annotation;

import java.lang.annotation.*;

/**
 * Created by solis on 2015/6/16.
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FastJson {
}
