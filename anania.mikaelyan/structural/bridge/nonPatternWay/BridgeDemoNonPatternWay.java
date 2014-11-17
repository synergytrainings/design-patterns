package com.synisys.training.patterns.structural.bridge.nonPatternWay;


import com.synisys.training.patterns.structural.bridge.patternWay.client.DeForm;
import com.synisys.training.patterns.structural.bridge.nonPatternWay.hierarchy.MainEntityAlwaysInsertService;
import com.synisys.training.patterns.structural.bridge.nonPatternWay.hierarchy.MainEntityService;
import com.synisys.training.patterns.structural.bridge.nonPatternWay.hierarchy.SubEntityAlwaysInsertService;
import com.synisys.training.patterns.structural.bridge.nonPatternWay.hierarchy.SubEntityService;
import org.junit.Test;

/**
 * @author Anania.Mikaelyan
 * @since 11/17/2014
 */
public class BridgeDemoNonPatternWay {
    @Test
    public void bridgeDemo() throws Exception {

        //init exactly implementations
        MainEntityService mainEntityService = new MainEntityAlwaysInsertService();
        SubEntityService subEntityService = new SubEntityAlwaysInsertService();

        DeForm form = new DeForm(mainEntityService, subEntityService);
        form.load(1l);
        form.save();
    }
}
