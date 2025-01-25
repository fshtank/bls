package com.fshtank.bls.service.impl;

import com.fshtank.bls.dao.BlsDataDao;
import com.fshtank.bls.model.BlsData;
import com.fshtank.bls.model.BlsWebRequest;
import com.fshtank.bls.service.BlsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *
 */
public class BlsServiceImpl implements BlsService {
    private static final Logger LOGGER = LogManager.getLogger(BlsServiceImpl.class);

    @Autowired
    private BlsDataDao blsDataDao;

    @Override
    public List<BlsData> getCampaigns(BlsWebRequest blsWebRequest) {
        return blsDataDao.getCampaigns(blsWebRequest);
    }
}
