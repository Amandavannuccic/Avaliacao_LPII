package br.gov.sp.bd.demoprojeto_spring2042.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    @Bean
        public OpenAPI springShopOpenAPI(){
            return new OpenAPI()
                    .info(new Info().title("Avaliacao")
                            .description("Back-end application responsible for getting and posting data from database.")
                            .version("v1.0.0")
                            .license(new License().name("Apache 2.0").url("http://springdoc.org")));
        }
    }


