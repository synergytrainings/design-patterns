package com.synisys.design_patterns.command.command;

import com.synisys.design_patterns.command.invoker.entity.Entity;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Service for Entities for which every save updates appropriate row in db table
 * Created by haykanush.torchyan on 12/14/2014.
 */
public class CRUDService extends Service {

    public void save(Entity entity){
        String insertQuery = "UPDATE TABLE Profiles SET OrganisationName =  ..., RegistrationNumber = , RegistrationDate = ";
        try {
            dao.executeUpdate(insertQuery);
        } catch (SQLException ex){
            Logger.getLogger(this.getClass().toString()).log(Level.SEVERE, "Error saving in CRService", ex);
        }
    }
}
