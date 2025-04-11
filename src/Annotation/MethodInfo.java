package Annotation;

import java.lang.annotation.*;

@Inherited
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)

public @interface MethodInfo {

    String nameMethod() default "no title";
    String typeValue() default "unknown";
    String description() default "unknown";
}

