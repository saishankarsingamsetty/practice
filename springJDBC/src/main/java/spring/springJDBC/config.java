package spring.springJDBC;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("spring.springJDBC")
public class config {

	@Bean
	public JdbcTemplate template(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
	
	@Bean
	public NamedParameterJdbcTemplate namedTemplate(DataSource dataSource) {
		return new NamedParameterJdbcTemplate(dataSource);
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
//		ds.setDriverClassName("oracle.jdbc.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521/orclpdb");
		ds.setUsername("hr");
		ds.setPassword("hr");
		return ds;
	}
	
	@Bean
	public SimpleJdbcInsert simpleInsert(DataSource d) {
		return new SimpleJdbcInsert(d);
	}
}
