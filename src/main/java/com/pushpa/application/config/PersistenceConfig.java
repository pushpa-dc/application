package com.pushpa.application.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfig {

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:mysql://localhost:3306/conference?useSSL=false&serverTimezone=UTC").username("root").password("");
        System.out.println("Custom datasource");
        return builder.build();
    }
}
