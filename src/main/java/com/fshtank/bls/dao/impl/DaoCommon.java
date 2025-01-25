package com.fshtank.bls.dao.impl;

import com.fshtank.bls.dao.BlsTypeWhereClause;
import com.gm.gsmc.shoppingtools.ofertas.configs.SQLqueryConfigs;
import com.gm.gsmc.shoppingtools.ofertas.dao.CampaignTypeWhereClause;
import com.gm.gsmc.shoppingtools.ofertas.model.OfertasWebRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.Optional;

/**
 * Common DAO Ancestor to put common utility methods
 */
public class DaoCommon {


    // Spring Boot will create and configure DataSource and JdbcTemplate
    // To use it, just @Autowired
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    SQLqueryConfigs sqlqry;

    @Autowired
    BlsTypeWhereClause blsTypeWhereClause;

    StringBuilder sql = null;

    /**
     * Unwrap the OPTIONAL OfertasWebRequest object to check if NULL
     * @param owReqOptional
     * @return
     */
    public OfertasWebRequest checkOfertasWebRequest (Optional<OfertasWebRequest> owReqOptional) {
        OfertasWebRequest owReq = null;
        if (owReqOptional.isPresent()) {
            owReq = owReqOptional.get();
        } else {
            owReq = new OfertasWebRequest();
        }

        return owReq;
    }

}
