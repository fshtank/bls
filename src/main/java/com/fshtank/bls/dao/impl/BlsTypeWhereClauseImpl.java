package com.fshtank.bls.dao.impl;

import com.fshtank.bls.configs.SQLqueryConfigs;
import com.fshtank.bls.dao.BlsTypeWhereClause;
import com.fshtank.bls.dao.CampaignTypeWhereClause;
import com.fshtank.bls.model.BlsType;
import com.fshtank.bls.model.CampaignType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class BlsTypeWhereClauseImpl implements BlsTypeWhereClause {
    private static final Logger LOGGER = LogManager.getLogger(BlsTypeWhereClauseImpl.class);

    @Autowired
    SQLqueryConfigs sqlqry;

    @Override
    public String getCampaignWhereClause(BlsType campaignType) {
        String sqlWhereClause = null;
        switch (campaignType) {
            case VEHICLE:
                sqlWhereClause = sqlqry.getWhere_CampaignTypePbc() + sqlqry.getWhere_CampaignTypeVehicles();
                break;
            case ACCESSORIES:
                sqlWhereClause = sqlqry.getWhere_CampaignTypeSvcAcc() + sqlqry.getWhere_CampaignTypeAccessories();
                break;
            case SERVICES:
                sqlWhereClause = sqlqry.getWhere_CampaignTypeSvcAcc() + sqlqry.getWhere_CampaignTypeServices();
                break;
            case CONCESSIONARIA:
                sqlWhereClause = sqlqry.getWhere_CampaignTypePbc() + sqlqry.getWhere_CampaignTypeConcessionaria();
                break;
            case NATIONAL:
                sqlWhereClause = sqlqry.getWhere_CampaignTypePbc() + sqlqry.getWhere_CampaignTypeNational();
                break;
            case DIRECT_SALES:
                sqlWhereClause = sqlqry.getWhere_CampaignTypePbc() + sqlqry.getWhere_CampaignTypeDirectSales();
                break;
        }

        return sqlWhereClause;
    }


}
