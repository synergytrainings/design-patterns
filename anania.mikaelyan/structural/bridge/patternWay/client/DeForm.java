package com.synisys.training.patterns.structural.bridge.patternWay.client;


import com.synisys.training.patterns.structural.bridge.domain.MainEntity;
import com.synisys.training.patterns.structural.bridge.domain.SubEntity;
import com.synisys.training.patterns.structural.bridge.nonPatternWay.hierarchy.MainEntityService;
import com.synisys.training.patterns.structural.bridge.nonPatternWay.hierarchy.SubEntityService;

import java.util.List;

/**
 * @author Anania.Mikaelyan
 * @since 11/17/2014
 */
public class DeForm {
    private final MainEntityService projectService;
    private final SubEntityService projectLocationService;

    private MainEntity project;
    private List<SubEntity> projectLocations;

    public DeForm(MainEntityService projectService, SubEntityService projectLocationService) {
        this.projectService = projectService;
        this.projectLocationService = projectLocationService;
    }

    public void load(Long id){
        project = projectService.loadById(id);
        projectLocations = projectLocationService.loadAllByParent(project);
    }

    public void save(){
        projectService.save(project);
        for (SubEntity projectLocation : projectLocations) {
            projectLocationService.save(projectLocation);
        }
    }
}
