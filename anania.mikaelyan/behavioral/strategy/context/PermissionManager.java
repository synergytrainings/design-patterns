package com.synisys.training.patterns.behavioral.strategy.context;

import com.synisys.training.patterns.behavioral.strategy.strategy.OptimisticPermissionResolverStrategy;
import com.synisys.training.patterns.behavioral.strategy.strategy.PermissionResolverStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anania.Mikaelyan
 * @since 4/14/2015
 */
public class PermissionManager {
    private final List<Permissions> permissionses = new ArrayList<>();
    private PermissionResolverStrategy permissionResolverStrategy = new OptimisticPermissionResolverStrategy();
    

    public Permissions getPermission(){
        return permissionResolverStrategy.resolvePermission(permissionses);
    }

    public void addPermission(Permissions permissions){
        permissionses.add(permissions);
    }

    public void setPermissionResolverStrategy(PermissionResolverStrategy permissionResolverStrategy) {
        this.permissionResolverStrategy = permissionResolverStrategy;
    }
}
