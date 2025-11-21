package org.spartahub.gatewayserver.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi userAPI() {
        return GroupedOpenApi.builder()
                .group("user-api")
                .displayName("USER API")
                .pathsToMatch("/v1/user/**")
                .build();
    }

    @Bean
    public GroupedOpenApi hubAPI() {
        return GroupedOpenApi.builder()
                .group("hub-api")
                .displayName("HUB API")
                .pathsToMatch("/v1/hub/**")
                .build();
    }
}
