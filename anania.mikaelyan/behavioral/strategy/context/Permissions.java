package com.synisys.training.patterns.behavioral.strategy.context;

/**
 * @author Anania.Mikaelyan
 * @since 4/14/2015
 */
public class Permissions {
    private  boolean canView;
    private  boolean canCreate;
    private  boolean canEdit;
    private  boolean canDelete;

    public Permissions(boolean canView, boolean canCreate, boolean canEdit, boolean canDelete) {
        this.canView = canView;
        this.canCreate = canCreate;
        this.canEdit = canEdit;
        this.canDelete = canDelete;
    }

    public boolean isCanView() {
        return canView;
    }

    public boolean isCanCreate() {
        return canCreate;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanView(boolean canView) {
        this.canView = canView;
    }

    public void setCanCreate(boolean canCreate) {
        this.canCreate = canCreate;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }
}
