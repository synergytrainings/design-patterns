package com.synisys.design_patterns.mediator;

/**
 * Created by haykanush.torchyan on 3/31/2015.
 */
public class DeItem {

    private Integer caseRegistryId;
    private Integer caseSubjectId;
    private String caseNumberPrefix;

    public Integer getCaseRegistryId() {
        return caseRegistryId;
    }

    public void setCaseRegistryId(Integer caseRegistryId) {
        this.caseRegistryId = caseRegistryId;
    }

    public Integer getCaseSubjectId() {
        return caseSubjectId;
    }

    public void setCaseSubjectId(Integer caseSubjectId) {
        this.caseSubjectId = caseSubjectId;
    }

    public String getCaseNumberPrefix() {
        return caseNumberPrefix;
    }

    public void setCaseNumberPrefix(String caseNumberPrefix) {
        this.caseNumberPrefix = caseNumberPrefix;
    }
}
