package com.fshtank.bls.dao;



import com.fshtank.bls.model.BlsWebRequest;
import com.fshtank.bls.model.VBlsDataOperationalAreaCity;

import java.util.List;

public interface BlsDataDao {

    List<VBlsDataOperationalAreaCity> getCampaigns(BlsWebRequest ofertasWebRequest);

}
