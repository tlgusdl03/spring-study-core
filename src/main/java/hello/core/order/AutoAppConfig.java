package hello.core.order;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        //수동으로 등록해야 하는 빈들과 테스트 빈들과 충돌을 피하기 위해 @Configuration 애노테이션을 제외시킴 실무에서는 그렇지 않음
)
public class AutoAppConfig {

}