package com.jdiaz.parte21curso_antoniones;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAtributo {

    String nombre() default "";
    boolean capitalizar() default false;

}
