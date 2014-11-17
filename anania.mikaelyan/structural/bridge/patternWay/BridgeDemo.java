package com.synisys.training.patterns.structural.bridge.patternWay;

import com.synisys.training.patterns.structural.bridge.patternWay.abstraction.MainEntityService;
import com.synisys.training.patterns.structural.bridge.patternWay.abstraction.SubEntityService;
import com.synisys.training.patterns.structural.bridge.patternWay.client.DeForm;
import com.synisys.training.patterns.structural.bridge.patternWay.implementation.AlwaysInsertService;
import com.synisys.training.patterns.structural.bridge.patternWay.implementation.ServiceImplementer;
import org.junit.Test;

/**
 * @author Anania.Mikaelyan
 * @since 11/17/2014
 */
public class BridgeDemo {
    @Test
    public void bridgeDemo() throws Exception {
        //here service implementer init from client and can be changed any time
        ServiceImplementer serviceImplementer = new AlwaysInsertService();
        //abstraction initializations based on implementer
        MainEntityService mainEntityService = new MainEntityService(serviceImplementer);
        SubEntityService subEntityService = new SubEntityService(serviceImplementer);

        DeForm form = new DeForm(mainEntityService, subEntityService);
        form.load(1l);
        form.save();
    }
}
