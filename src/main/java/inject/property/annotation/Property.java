package inject.property.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;

@Retention(RUNTIME)
@Target({ METHOD, FIELD, PARAMETER })
@Qualifier
public @interface Property {

	@Nonbinding
	public String value() default "";
}
