package com.fshtank.bls.dao;


import com.fshtank.bls.model.BlsType;
import com.fshtank.bls.model.CampaignType;

public interface BlsTypeWhereClause {

    /**
     *
     * @param campaignType
     * @return
     */
    public String getCampaignWhereClause (BlsType campaignType);

}
