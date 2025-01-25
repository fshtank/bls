package com.fshtank.bls.service;


import com.fshtank.bls.model.BlsWebRequest;

import java.util.List;

public interface BlsService {

    public List<BlsWebRequest> getCampaigns(BlsWebRequest blsWebRequest);
}
