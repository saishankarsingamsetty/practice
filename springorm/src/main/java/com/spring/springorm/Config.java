package com.spring.springorm;

import java.util.Properties;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.spring.springorm.entities.OrmPrac;

@Configuration
@ComponentScan(basePackages = "com.spring.springorm")
@EnableTransactionManagement
public class Config {

    @Bean
    public DataSource ds() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521/orclpdb");
        ds.setUsername("hr");
        ds.setPassword("hr");
        return ds;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
        lsfb.setDataSource(ds());
        lsfb.setAnnotatedClasses(OrmPrac.class);
//        lsfb.setPackagesToScan("com.spring.springorm.entities");
        Properties props = new Properties();
        props.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
        props.put("hibernate.show_sql", "true");
        props.put("hibernate.hbm2ddl.auto", "update");
        lsfb.setHibernateProperties(props);
        return lsfb;
    }

    @Bean
    public HibernateTemplate template(SessionFactory sessionFactory) {
        return new HibernateTemplate(sessionFactory);
    }

    @Bean
    public HibernateTransactionManager tx(SessionFactory sessionFactory) {
        return new HibernateTransactionManager(sessionFactory);
    }
}
