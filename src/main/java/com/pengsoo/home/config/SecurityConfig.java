package com.pengsoo.home.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration//설정파일임을 선언 
@EnableWebSecurity//보안관련 설정파일
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {

	
	}

	@Bean//암호를 암호화 시킨다
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
		
	}
	
}
