package com.fyp.Ghumantey.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class GhumanteyConfig {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .requestMatchers("/user/**").hasRole("USER")
                        .requestMatchers("/**").permitAll()
                        .anyRequest().authenticated())
                .formLogin(login -> login
                        .loginPage("/login")
                        .loginProcessingUrl("/perform_login")
                        .defaultSuccessUrl("/welcome", true)
                        .failureUrl("/login?failed")
                        .permitAll())
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .invalidateHttpSession(true)
                        .logoutSuccessUrl("/login?logout"))
                .csrf(csrf -> csrf.disable());

        return http.build();
    }

    // JDBC authentication
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .passwordEncoder(passwordEncoder)
                .usersByUsernameQuery(
                        "SELECT username, password, active FROM user_detail_table WHERE username=?")
                .authoritiesByUsernameQuery(
                        "SELECT ud.username, ur.role " +
                        "FROM user_detail_table AS ud " +
                        "JOIN user_role AS ur ON ud.id = ur.user_id " +
                        "WHERE ud.username=?");

        // Optional in-memory admin for testing
        auth.inMemoryAuthentication()
                .passwordEncoder(passwordEncoder)
                .withUser("admin")
                .password(passwordEncoder.encode("admin123"))
                .roles("ADMIN");
    }
}