package Annotation;

import java.lang.annotation.*;

@Inherited
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    String nameAuthor() default "no data";
    String surnameAuthor() default "no data";
}
