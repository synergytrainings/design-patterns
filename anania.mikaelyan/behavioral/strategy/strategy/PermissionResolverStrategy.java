package com.synisys.training.patterns.behavioral.strategy.strategy;

import com.synisys.training.patterns.behavioral.strategy.context.Permissions;

import java.util.List;

/**
 * @author Anania.Mikaelyan
 * @since 4/14/2015
 */
public interface PermissionResolverStrategy {
    Permissions resolvePermission(List<Permissions> permissionses);
}
