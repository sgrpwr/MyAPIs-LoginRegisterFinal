package com.sagar.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@WebAppConfiguration
@ComponentScan(basePackages = "com.sagar")
public class SpringApplicationConfig implements WebMvcConfigurer {

/*@Bean
    public InternalResourceViewResolver viewResolverw(){
        InternalResourceViewResolver vw = new InternalResourceViewResolver();
        vw.setPrefix("/WEB-INF/jsp/");
        vw.setSuffix(".jsp");
        return vw;
    }*/

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/jsp/",".jsp");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        WebMvcConfigurer.super.addResourceHandlers(registry);
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("classpath:/statics/");
    }

    @Bean
    DriverManagerDataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=dbin00r1bp.in.nonprod)(PORT=1521))(CONNECT_DATA=(UR=A)(SERVICE_NAME=in00r1bp.in.nonprod)(SERVER=DEDICATED)))");
        ds.setUsername("QUEST");
        ds.setPassword("QUEST");
        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate((javax.sql.DataSource) getDataSource());
    }

    /*

CREATE TABLE tbl_user (
    user_id int,
    user_name varchar(255) not null,
    user_email varchar(255) not null,
    user_password varchar(255) not null,
    country varchar(10),
    gender varchar(5),
    PRIMARY KEY (user_id)
);

--DROP TABLE tbl_user;
commit;

SELECT * FROM TBL_USER;
    */

}
