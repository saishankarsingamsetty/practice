package transaction_management;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("transaction_management")
@EnableTransactionManagement
public class Config {

	@Bean
	public DriverManagerDataSource source() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:oracle:thin:@localhost:1521/orclpdb");
		ds.setUsername("hr");
		ds.setPassword("hr");
		return ds;
	}
	
	@Bean
	public JdbcTemplate template(DataSource s) {
		return new JdbcTemplate(s);
	}
	
	@Bean
    public PlatformTransactionManager transactionManager(DataSource ds) {
        return new DataSourceTransactionManager(ds);
    }
}
