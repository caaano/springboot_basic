package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static org.springframework.context.annotation.FilterType.ANNOTATION;

@Configuration
@ComponentScan(
        //basePackages = "hello.core", // 지정하지 않으면 @ComponentScan이 붙은 설정 정보 클래스의 패키지가 시작 위치
        excludeFilters = @ComponentScan.Filter(type = ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
