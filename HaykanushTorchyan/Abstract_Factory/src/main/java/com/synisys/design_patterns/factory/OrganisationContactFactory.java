package com.synisys.design_patterns.factory;

import com.synisys.design_patterns.product.AbstractContactDetails;
import com.synisys.design_patterns.product.OrganisationContactDetails;

import java.util.List;
import java.util.Map;

/**
 * Created by haykanush.torchyan on 10/30/2014.
 */
public class OrganisationContactFactory implements AbstractContactFactory {

    @Override
    public OrganisationContactDetails createContact(Map<String, Object> params){
        OrganisationContactDetails orgContact =  new OrganisationContactDetails((String)params.get("name"),
                                                                                    (String)params.get("phoneNumber"),
                                                                                    (String)params.get("email"),
                                                                                    (String)params.get("registrationId"),
                                                                                    (List<String>)params.get("officeAddresses"));
        System.out.println("Organisation contact created!!!");
        orgContact.printContactDetails();
        return orgContact;
    }
}
