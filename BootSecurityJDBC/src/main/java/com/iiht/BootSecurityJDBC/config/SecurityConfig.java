package com.iiht.BootSecurityJDBC.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
            .dataSource(dataSource)
            .usersByUsernameQuery("SELECT username, password, enabled FROM users WHERE username=?")
            .authoritiesByUsernameQuery("SELECT username, 'ROLE_USER' FROM users WHERE username=?")
            .passwordEncoder(passwordEncoder());

        auth.jdbcAuthentication()
            .dataSource(dataSource)
            .usersByUsernameQuery("SELECT username, password, enabled FROM admin WHERE username=?")
            .authoritiesByUsernameQuery("SELECT username, 'ROLE_ADMIN' FROM admin WHERE username=?")
            .passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/public/**").permitAll() // Allow public access to these endpoints
                .antMatchers("/admin/**").hasRole("ADMIN") // Require admin role for these endpoints
                .anyRequest().authenticated() // Require authentication for any other request
                .and()
            .formLogin() // Enable form-based login
                .permitAll() // Allow everyone to see the login page
                .and()
            .logout()
                .permitAll(); // Allow everyone to log out
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // Use BCrypt for password encoding
    }
}