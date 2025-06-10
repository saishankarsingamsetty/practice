package Configurations;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
@Order(1)
public class SecurityConfigurationUsingJDBC extends WebSecurityConfigurerAdapter{

	@Autowired
	private DataSource datasource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
        .dataSource(datasource)
        .usersByUsernameQuery("select username, password, enabled from users where username=?")
        .authoritiesByUsernameQuery("select username, authority from authorities where username=?")
        .passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
	 
	 
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		 http.csrf().disable()
		 .authorizeRequests()
		 .antMatchers("/").permitAll()
		 .antMatchers("/user").hasAnyAuthority("user","admin")
		 .antMatchers("/admin").hasAuthority("admin")
//		 .anyRequest().authenticated()
		 .and().formLogin()
		 .and().logout()
		 .and().exceptionHandling().accessDeniedPage("/accessdenied")
		 ;
	}
}
