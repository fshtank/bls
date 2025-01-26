package com.fshtank.bls.dao;



import com.fshtank.bls.model.BlsData;
import com.fshtank.bls.model.BlsWebRequest;
import com.fshtank.bls.model.VBlsDataOperationalAreaCity;

import java.util.List;

public interface BlsDataDao {

    public List<BlsData> getCampaigns(BlsWebRequest blsWebRequest);

    public List<BlsData> getCampanga(BlsWebRequest blsWebRequest);

    public List<VBlsDataOperationalAreaCity> getOperationsArea(BlsWebRequest BlsWebRequest);
}
