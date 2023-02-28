package com.demo.ope.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class ResourceServerConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.mvcMatcher("/ope/**")
                .authorizeRequests()
                .mvcMatchers("/ope/**")
                .access("hasAuthority('SCOPE_ope.write')")
                .and()
                .oauth2ResourceServer()
                .jwt();
        return http.build();
    }
}