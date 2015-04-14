package com.synisys.training.patterns.behavioral.strategy;

import com.synisys.training.patterns.behavioral.state.DeStates;
import com.synisys.training.patterns.behavioral.strategy.context.Permissions;
import com.synisys.training.patterns.behavioral.strategy.context.PermissionManager;
import com.synisys.training.patterns.behavioral.strategy.strategy.PessimisticPermissionResolverStrategy;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Anania.Mikaelyan
 * @since 4/14/2015
 */
public class StrategyDemo {
    @Test
    public void testStrategy(){
        PermissionManager permissionManager = new PermissionManager();
        permissionManager.addPermission(new Permissions(true, true, true, true));
        permissionManager.addPermission(new Permissions(false, false, false, false));
        Permissions optimisticPermissions = permissionManager.getPermission();
        Assert.assertTrue(optimisticPermissions.isCanCreate());

        permissionManager.setPermissionResolverStrategy(new PessimisticPermissionResolverStrategy());
        Permissions pessimisticPermissions = permissionManager.getPermission();
        Assert.assertFalse(pessimisticPermissions.isCanCreate());


    }
}
