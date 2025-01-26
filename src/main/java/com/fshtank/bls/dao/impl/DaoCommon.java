package com.fshtank.bls.dao.impl;

import com.fshtank.bls.configs.SQLqueryConfigs;
import com.fshtank.bls.dao.BlsTypeWhereClause;
import com.fshtank.bls.model.BlsData;
import com.fshtank.bls.model.BlsWebRequest;
import com.fshtank.bls.model.OfertasWebRequest;
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
    public BlsWebRequest checkOfertasWebRequest (Optional<BlsWebRequest> owReqOptional) {
        BlsWebRequest owReq = null;
        if (owReqOptional.isPresent()) {
            owReq = owReqOptional.get();
        } else {
            owReq = new BlsWebRequest();
        }

        return owReq;
    }



}
