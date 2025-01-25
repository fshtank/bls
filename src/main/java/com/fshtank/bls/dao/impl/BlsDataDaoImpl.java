package com.fshtank.bls.dao.impl;

import com.fshtank.bls.dao.BlsDataDao;
import com.fshtank.bls.model.BlsData;
import com.fshtank.bls.model.BlsWebRequest;
import com.fshtank.bls.model.VBlsDataOperationalAreaCity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BlsDataDaoImpl extends DaoCommon implements BlsDataDao {

    private static final Logger LOGGER = LogManager.getLogger(BlsDataDaoImpl.class);

    @Override
     public List<BlsData> getCampaigns(BlsWebRequest blsWebRequest) {
        ArrayList<BlsData> blsDataList = new ArrayList<>();
        BlsData blsData = new BlsData();
        blsDataList.add(blsData);
        return blsDataList.stream().toList();
    }

    @Override
    public List<BlsData> getCampanga(BlsWebRequest blsWebRequest) {
        return List.of();
    }


    /**
     *
     * @param BlsWebRequest
     * @return
     */
    @Override
    public List<VBlsDataOperationalAreaCity> getOperationsArea(BlsWebRequest BlsWebRequest) {
        sql=new StringBuilder(sqlqry.getSelect_vCampaignOperationalAreaCity());
        SqlParameterSource parameters = getParameters(BlsWebRequest);
        return jdbcTemplate.query (sql.toString(), parameters, new VBlsDataMapper());
    }


    /**
     * Map Parameters for the SQL WHERE clause
     * @param owReqOptional
     * @return
     */
    public SqlParameterSource getParameters(BlsWebRequest blsWebRequest) {

        MapSqlParameterSource parameters = new MapSqlParameterSource();
        // BlsData owReq=super.getCampaigns(blsWebRequest);
        BlsData owReq= new BlsData();

        // Campaigns

        if (!owReq.getCityName().isEmpty()) {
            sql.append(sqlqry.getWhereV_CityName());
            parameters.addValue("CityName", owReq.getCityName(), Types.VARCHAR);
        }

        if (owReq.getCityName() !=null) {
            sql.append(sqlqry.getWhereV_StateName());
            parameters.addValue("StateName", owReq.getEstadoName(), Types.VARCHAR);
        }

        return parameters;
    }

    @Override
    public BlsWebRequest checkOfertasWebRequest(Optional<BlsWebRequest> owReqOptional) {
        return super.checkOfertasWebRequest(owReqOptional);
    }
}

/**
 * Inner Class to Map Data Object --> Rows
 */
class VBlsDataMapper implements RowMapper {
    @Override
    public VBlsDataOperationalAreaCity mapRow(ResultSet rs, int rowNum) throws SQLException {
        VBlsDataOperationalAreaCity vc = new VBlsDataOperationalAreaCity();
        vc.setCampaignOperationalAreaId(rs.getLong("CampaignOperationalAreaId"));
        vc.setCampaignId(rs.getLong("CampaignId"));
        vc.setCampaignName(rs.getString("CampaignName"));
        vc.setOperationalAreaId(rs.getLong("OperationalAreaId"));
        vc.setOperationalAreaName(rs.getString("OperationalAreaName"));
        vc.setRegion(rs.getString("Region"));
        vc.setRegionId(rs.getLong("RegionId"));
        vc.setCampaignTypeId(rs.getLong("CampaignTypeId"));
        vc.setCampaignTypeDescription(rs.getString("CampaignTypeDescription"));
        vc.setOperationalAreaCityId(rs.getLong("OperationalAreaCityId"));
        vc.setCityId(rs.getLong("CityId"));
        vc.setCityName(rs.getString("CityName"));
        vc.setEstadoId(rs.getLong("EstadoId"));
        vc.setEstadoName(rs.getString("EstadoName"));
        vc.setCampanhaStatusId(rs.getLong("CampanhaStatusId"));
        vc.setDataInicial(rs.getTimestamp("DataInicial")); // Start Date
        vc.setDataFinal(rs.getTimestamp("DataFinal")); // End Date

        return vc;
    }
}