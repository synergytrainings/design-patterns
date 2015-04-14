package com.synisys.training.patterns.behavioral.strategy.strategy;

import com.synisys.training.patterns.behavioral.strategy.context.Permissions;

import java.util.List;

/**
 * Union of permissions
 *
 * @author Anania.Mikaelyan
 * @since 4/14/2015
 */
public class OptimisticPermissionResolverStrategy implements PermissionResolverStrategy {
    @Override
    public Permissions resolvePermission(List<Permissions> permissionses) {
        Permissions resolvedPermissions = new Permissions(false, false, false, false);
        for (Permissions permission : permissionses) {
            resolvedPermissions.setCanCreate(permission.isCanCreate() || resolvedPermissions.isCanCreate());
            resolvedPermissions.setCanView(permission.isCanView() || resolvedPermissions.isCanView());
            resolvedPermissions.setCanEdit(permission.isCanEdit() || resolvedPermissions.isCanEdit());
            resolvedPermissions.setCanDelete(permission.isCanDelete() || resolvedPermissions.isCanDelete());
        }
        return resolvedPermissions;
    }
}
