package com.synisys.design_patterns;

import com.synisys.design_patterns.factory.OrganisationContactFactory;
import com.synisys.design_patterns.factory.UserContactFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by haykanush.torchyan on 10/30/2014.
 */
public class Process {

    public static void main(String[] args){
        Map<String, Object> userContactParams = new HashMap<String, Object>();
        userContactParams.put("name", "Adison Breadley");
        userContactParams.put("phoneNumber", "609 9834768");
        userContactParams.put("email", "adison.breadley@gmail.com");
        userContactParams.put("passportId", "AG3422211");
        userContactParams.put("address", "Adison Breadley home address");
        UserContactFactory userContactFactory = new UserContactFactory();
        userContactFactory.createContact(userContactParams);

        Map<String, Object> orgContactParams = new HashMap<String, Object>();
        orgContactParams.put("name", "USAID");
        orgContactParams.put("phoneNumber", "768 8764560");
        orgContactParams.put("email", "info@usaid.com");
        orgContactParams.put("registrationId", "01-AK-U76374909");
        orgContactParams.put("officeAddresses", new ArrayList<String>(Arrays.asList("Office 1 address", "Office 2 address", "Office 3 address")));
        OrganisationContactFactory orgContactFactory = new OrganisationContactFactory();
        orgContactFactory.createContact(orgContactParams);
    }
}
