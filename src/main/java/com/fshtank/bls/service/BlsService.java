package com.fshtank.bls.service;


import com.fshtank.bls.model.BlsData;
import com.fshtank.bls.model.BlsWebRequest;

import java.util.List;

public interface BlsService {

    public List<BlsData> getCampaigns(BlsWebRequest blsWebRequest);
}
