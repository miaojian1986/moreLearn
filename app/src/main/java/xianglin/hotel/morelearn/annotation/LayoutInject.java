package xianglin.hotel.morelearn.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//运行时注解
@Target(ElementType.TYPE)//类注解
public @interface LayoutInject {
    int getLayout() default -1;
}
