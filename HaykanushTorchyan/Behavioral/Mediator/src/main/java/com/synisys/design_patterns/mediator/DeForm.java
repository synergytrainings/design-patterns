package com.synisys.design_patterns.mediator;

/**
 * This is the Mediator class in this example
 * It coordinates all the dependencies described in section1.xhtml
 *
 * Created by haykanush.torchyan on 3/31/2015.
 */
public class DeForm {

    private  DeItem deItem;
    private Integer newCasePartyRoleId;

    public void onCaseRegistryChange() {
        resetCaseSubjectId();
        resetNewCasePartyRoleId();
    }

    public void onCaseSubjectChange(){
        deItem.setCaseNumberPrefix(generateNewCaseNumberPrefix());
//        getWorkflowHelper().setProcessKey(null);
//        resetCaseSubjectType();
    }

    public void resetCaseSubjectId() {
        deItem.setCaseSubjectId(null);
    }

    public void resetNewCasePartyRoleId(){
        this.newCasePartyRoleId = null;
    }

    public String generateNewCaseNumberPrefix(){
        Integer subjectId = deItem.getCaseSubjectId();
        String caseNumberPrefix = "";
        //use subjectId for getting appropriate caseNumber prefix
        return caseNumberPrefix;
    }

}
