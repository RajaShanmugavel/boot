package com.abc.raja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;

import com.abc.raja.config.MyCorsFilter;

@SpringBootApplication
public class MyApplication {

	public static void main(String args[]) {
		SpringApplication.run(MyApplication.class, args);
	}

}

@Configuration
@Order(SecurityProperties.BASIC_AUTH_ORDER)
class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private MyCorsFilter myCorsFilter;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("password").roles("USER").and().withUser("admin")
				.password("password").roles("USER", "ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/").permitAll();
		/*.anyRequest().authenticated()
		.and()
		.formLogin()
		.and()
		.logout().permitAll();*/
		
		http.csrf().disable();
		http.addFilterBefore(myCorsFilter, ChannelProcessingFilter.class);
	}
}
