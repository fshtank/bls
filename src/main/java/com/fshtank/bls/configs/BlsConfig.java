/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fshtank.bls.configs;

import com.fshtank.bls.dao.BlsTypeWhereClause;
import com.fshtank.bls.dao.BlsDataDao;
import com.fshtank.bls.dao.impl.BlsTypeWhereClauseImpl;
import com.fshtank.bls.dao.impl.CampaignsDaoImpl;
import com.fshtank.bls.dao.impl.OfertaServicoAcessorioDaoImpl;
import com.fshtank.bls.dao.impl.OfertasDaoImpl;
import com.fshtank.bls.model.BlsWebRequest;
import com.fshtank.bls.service.BlsService;
import com.fshtank.bls.service.impl.BlsServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Rick Fisher (ess-zee-en-elef-zero)
 */
@Configuration
@EnableWebMvc
@Import({BlsWebConfig.class, JdbcConfig.class})
@ComponentScan(basePackages = "com.fshtank.bls")

@PropertySources({
        @PropertySource("classpath:application.properties"),
        @PropertySource("classpath:sql-query.properties")
})

public class BlsConfig {

    @Value("${application.name}")
    private String applicationName;

    @Value("${BackupOfferTemplate}")
    private String backupOfferTemplate;

    @Value("${CgiBaseUrl}")
    private String cgiBaseUrl;

    @Value("${BackupImage}")
    private String backupImage;

    /*
     * GETTERS and SETTERS
     */
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        System.out.println("Starting Application Name: " + this.applicationName);
    }

    public String getBackupOfferTemplate() { return backupOfferTemplate; }

    public String getCgiBaseUrl() { return cgiBaseUrl; }

    public String getBackupImage() { return backupImage; }

    @Bean
    public BlsService getOfertasService () {
        return new BlsServiceImpl();
    }

    @Bean
    public BlsService getCampaignsService() {
        return new BlsServiceImpl();
    }

    @Bean
    public BlsService getBlsService() {
        return new BlsServiceImpl();
    }

    @Bean
    public BlsWebRequest getOfertasWebRequest() { return new BlsWebRequest(); }

    @Bean
    public BlsDataDao getCampaignsDao() {
        return new CampaignsDaoImpl();
    }

    @Bean
    public OfertaServicoAcessorioDao getOfertaServicoAcessorioDao() {
        return new OfertaServicoAcessorioDaoImpl();
    }

    @Bean
    public OfertasDao getOfertasDao () {
        return new OfertasDaoImpl();
    }

    @Bean
    public BlsTypeWhereClause getCampaignTypeWhereClause() {
        return new BlsTypeWhereClauseImpl();
    }
}

