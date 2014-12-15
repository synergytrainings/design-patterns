package com.synisys.design_patterns.command.command;

import com.synisys.design_patterns.command.invoker.entity.Entity;
import com.synisys.design_patterns.command.invoker.entity.Profile;
import com.synisys.design_patterns.command.receiver.Dao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Service for Entities for which every save inserts a new row in db table
 * Created by haykanush.torchyan on 12/14/2014.
 */
public class CRService extends Service {

    public void save(Entity entity){
        String insertQuery = "INSERT INTO Profiles (OrganisationName, RegistrationNumber, RegistrationDate) VALUES(...)";
        try {
            dao.executeUpdate(insertQuery);
        } catch (SQLException ex){
            Logger.getLogger(this.getClass().toString()).log(Level.SEVERE, "Error saving in CRService", ex);
        }
    }
}
