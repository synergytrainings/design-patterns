package com.synisys.design_patterns.factory;

import com.synisys.design_patterns.product.AbstractContactDetails;
import com.synisys.design_patterns.product.UserContactDetails;

import java.util.List;
import java.util.Map;

/**
 * Created by haykanush.torchyan on 10/30/2014.
 */
public class UserContactFactory implements AbstractContactFactory {

    @Override
    public UserContactDetails createContact(Map<String, Object> params){
        UserContactDetails userContact =  new UserContactDetails((String)params.get("name"),
                                                                (String)params.get("email"),
                                                                (String)params.get("phoneNumber"),
                                                                (String)params.get("passportId"),
                                                                (String)params.get("address"));
        System.out.println("User contact created!!!");
        userContact.printContactDetails();
        return userContact;
    }
}
