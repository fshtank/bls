package com.fshtank.bls.configs;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author Rick Fisher (ess-zee-en-elef-zero)
 */
@Configuration
@ComponentScan(basePackages = "com.fshtank.bls")
public class JdbcConfig {
    @Value("${datasource.driver-class-name}")
    private String driverClassName;

    @Value("${datasource.url}")
    private String datasourceUrl;

    @Value("${datasource.username}")
    private String datasourceUsername;

    @Value("${datasource.password}")
    private String datasourcePassword;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getDatasourceUrl() {
        return datasourceUrl;
    }

    public void setDatasourceUrl(String datasourceUrl) {
        this.datasourceUrl = datasourceUrl;
    }

    public String getDatasourceUsername() {
        return datasourceUsername;
    }

    public void setDatasourceUsername(String datasourceUsername) {
        this.datasourceUsername = datasourceUsername;
    }

    public String getDatasourcePassword() {
        return datasourcePassword;
    }

    public void setDatasourcePassword(String datasourcePassword) {
        this.datasourcePassword = datasourcePassword;
    }

    @Bean
    public DataSource blsDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(this.getDriverClassName());
        dataSource.setUrl(this.getDatasourceUrl());
        dataSource.setUsername(this.getDatasourceUsername());
        dataSource.setPassword(this.getDatasourcePassword());

        return dataSource;
    }
}
