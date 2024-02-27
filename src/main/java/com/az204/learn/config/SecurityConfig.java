package com.az204.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

	@Bean
    public SecurityFilterChain filterChainHttpBasci(HttpSecurity http) throws Exception {
      return http.authorizeHttpRequests(authorize -> authorize
              	.anyRequest().permitAll())
				.csrf(csrf -> csrf.disable())
				.cors(cors -> cors.disable())
		        .build();
    }
	
}
