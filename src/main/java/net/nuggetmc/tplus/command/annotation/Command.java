package net.nuggetmc.tplus.command.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Command {
    String name() default "";

    String[] aliases() default {};

    String desc() default "Blank description.";

    String usage() default "";

    String autofill() default "";

    boolean visible() default true;
}
