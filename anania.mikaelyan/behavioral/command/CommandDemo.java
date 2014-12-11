package com.synisys.training.patterns.behavioral.command;

import com.synisys.training.patterns.behavioral.command.command.Command;
import com.synisys.training.patterns.behavioral.command.command.DeployCommand;
import com.synisys.training.patterns.behavioral.command.command.RestartCommand;
import com.synisys.training.patterns.behavioral.command.invoker.David;
import com.synisys.training.patterns.behavioral.command.receiver.GizServer;
import com.synisys.training.patterns.behavioral.command.receiver.Server;
import com.synisys.training.patterns.behavioral.command.receiver.TjkServer;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Anania.Mikaelyan
 * @since 12/12/2014
 */
public class CommandDemo {
    private  Server gizServer;
    private  Server tjkServer;
    private  Command deployGiz;
    private  Command restartTjk;
    private  David davidKochkeryan;

    @Before
    public void prepare(){
        // Create the receivers
        gizServer = new GizServer();
        tjkServer = new TjkServer();

        //Create the commands
        deployGiz = new DeployCommand(gizServer);
        restartTjk = new RestartCommand(tjkServer);

        //Create invoker
        davidKochkeryan = new David();
    }

    @Test
    public void test(){
        davidKochkeryan.addCommand(deployGiz);
        davidKochkeryan.run();


        davidKochkeryan.addCommand(restartTjk);
        davidKochkeryan.run();

        davidKochkeryan.undo();
        davidKochkeryan.undo();

    }
}
