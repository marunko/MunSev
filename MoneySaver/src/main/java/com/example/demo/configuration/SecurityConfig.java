package com.example.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		
		http
			.authorizeRequests()
				.antMatchers("/**").permitAll();
		http.authorizeHttpRequests().antMatchers("/profile").hasRole("user");
		
		http.authorizeRequests().and().formLogin()//
        // Submit URL of login page.
        .loginProcessingUrl("/j_spring_security_check") // Submit URL
        .loginPage("/login")//
        .defaultSuccessUrl("/userInfo")//
        .failureUrl("/login?error=true")//
        .usernameParameter("username")//
        .passwordParameter("password");

		// Logout Config
		http.authorizeRequests().and().logout().logoutUrl("/logout").logoutSuccessUrl("/");

	}
	
	
}
