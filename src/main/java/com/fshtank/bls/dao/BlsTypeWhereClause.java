package com.fshtank.bls.dao;

import com.gm.gsmc.shoppingtools.ofertas.model.CampaignType;

public interface BlsTypeWhereClause {

    /**
     *
     * @param campaignType
     * @return
     */
    public String getCampaignWhereClause (CampaignType campaignType);
}
