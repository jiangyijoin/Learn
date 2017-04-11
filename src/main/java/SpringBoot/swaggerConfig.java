package SpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by fanya on 2017/4/11.
 */
@Controller
@EnableSwagger2
public class swaggerConfig {
    @Bean
    public Docket swaggerSpringMvcPlugin() {
        ApiInfo apiInfo = new ApiInfo("sample of springboot", "sample of springboot", null, null, null, null, null);
        Docket docket = new Docket(DocumentationType.SWAGGER_2).select().paths(regex("/user/.*")).build()
                .apiInfo(apiInfo).useDefaultResponseMessages(false);
        return docket;
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("测试API")
                .description("樊亚的测试API11")
                .termsOfServiceUrl("www.baidu.com")
                .version("1.0.0")
                .build();
    }
}
