package com.fshtank.bls.controllers;

import com.fshtank.bls.exceptions.ServiceNotAvailableException;
import com.fshtank.bls.model.*;
import com.fshtank.bls.service.BlsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Example REST resource controller.
 *
 * @author Rick Fisher (ess-zee-en-elef-zero)
 */
@RestController
@RequestMapping("/bls")
@ResponseBody
public class BlsController extends BaseController {

    private static final Logger LOGGER = LogManager.getLogger(BlsController.class);

    @Autowired
    private BlsService blsService;

    @Autowired
    private BlsWebRequest blsWebRequest;


    // https://cws.gm.com/ofertas/BR/pt?campaign=199&region=45
    // Compare Start End Dates to current date
    // Do we have a LAT/LONG method in the DB.
    // Current app grabs lat/long to convert to a city.
    // Need Current OFfers to Confirm user location and popup ability
    // to change location if user wishes.

    /**
     * @return Collection of Collection<PbcOfertaVeiculo>
     */
    @RequestMapping(value = "/{locale}/{language}/{cityName}/{stateName}",
                    method = RequestMethod.GET,
                    produces =
                            {"application/vnd.status.v1+json;version=1.0",
                             "application/vnd.status.v1+xml;version=1.0"  }
    )
    public List<BlsData> getOfertasCampaign(@PathVariable ("locale") String locale,
                                            @PathVariable ("language") String language,
                                            @PathVariable (value="cityName") String cityName,
                                            @PathVariable (value="stateName") String stateName ) {

        blsWebRequest.setLocale(locale);
        blsWebRequest.setLanguage(language);
        blsWebRequest.setCityName(cityName);
        blsWebRequest.setStateName(stateName);

        List<BlsData> vc = blsService.getCampaigns(blsWebRequest);

        return vc;
    }


    /**
     * @return Collection of Collection<PbcOfertaVeiculo>
     */
    @RequestMapping(value = "/{locale}/{language}/campaign/{campaignId}",
            method = RequestMethod.GET,
            produces = {"application/vnd.status.v1+json;version=1.0",
                    "application/vnd.status.v1+xml;version=1.0"}
    )
    public List<BlsData> getOffers(@PathVariable ("locale") String locale,
                                                       @PathVariable ("language") String language,
                                                       @PathVariable (value="campaignId") Long campaignId) {

        blsWebRequest.setLocale(locale);
        blsWebRequest.setLanguage(language);
        blsWebRequest.setvCampanhaId(campaignId);

        List<BlsData> vc = blsService.getCampaigns(blsWebRequest);

        return vc;
    }

    /**
     * An example method to demonstrate various error conditions and handling.
     * Not intended to be included in a real controller.
     *
     * @param error
     * @return
     */
    @RequestMapping(value = "/errors/{error}", method = RequestMethod.GET)

    public Object demonstrateErrors(@PathVariable String error) throws Exception {
        switch (error) {
            case "ThrowGenericException":
                throw new RuntimeException("Some Unhandled exception, could come from anywhere. Default handler should catch and provide basic solution");
            case "ThrowCommonException":
                throw new ServiceNotAvailableException("Generic Error in Ofertas");
            default: {
                ArrayList al = new ArrayList();
                PbcOfertaVeiculo pbcErrorDefault = new PbcOfertaVeiculo();
                al.add(pbcErrorDefault);
                return al;
            }
        }

    }
}
