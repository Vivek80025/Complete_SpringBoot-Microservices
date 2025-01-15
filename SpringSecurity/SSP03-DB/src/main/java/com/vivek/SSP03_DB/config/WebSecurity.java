package com.vivek.SSP03_DB.config;

import com.vivek.SSP03_DB.service.MyCustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurity {

    @Autowired
    private MyCustomUserDetailsService myCustomUserDetailsService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.csrf(e->e.disable())
                .authorizeHttpRequests(auth->auth
                        .requestMatchers(new AntPathRequestMatcher("/admin")).hasRole("ADMIN")
                        .requestMatchers(new AntPathRequestMatcher("/user")).hasAnyRole("USER","ADMIN")
                        .anyRequest().authenticated()
                )
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());
        return http.build();

    }

    @Bean
    public NoOpPasswordEncoder noOpPasswordEncoder(){
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }
}
