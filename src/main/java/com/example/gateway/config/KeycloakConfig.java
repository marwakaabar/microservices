/*package com.example.gateway.config;

import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.keycloak.OAuth2Constants;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class KeycloakConfig {
    @Bean
    public KeycloakSpringBootConfigResolver keycloakSpringBootConfigResolver() {
        return new KeycloakSpringBootConfigResolver();
    }
    static Keycloak keycloak=null;
    final static String serverUrl = "http://localhost:8180/auth";
    public final static String realm = "GatewayKeycloack";
    public final static String clientId = "gateway-service";
    final static String clientSecret = "178003a2-558d-4f4b-bfb7-2c46e8b2df36";
    final static String userName = "admin";
    final static String password = "admin";
    public KeycloakConfig() {
    }
    @Bean
    public static Keycloak getInstance() {
        if (keycloak == null) {
            keycloak = KeycloakBuilder.builder()
                    .serverUrl(serverUrl)
                    .realm(realm)
                    .grantType(OAuth2Constants.PASSWORD)
                    .username(userName)
                    .password(password)
                    .clientId(clientId)
                    .clientSecret(clientSecret)
                    .resteasyClient(new ResteasyClientBuilder()

                            .connectionPoolSize(10)

                            .build())
                    .build();
        }
        return keycloak;
    }
}*/