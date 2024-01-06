package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static org.springframework.context.annotation.FilterType.ANNOTATION;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
