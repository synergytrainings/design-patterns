package com.synisys.design_patterns.command.receiver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by haykanush.torchyan on 12/15/2014.
 */
public class Dao {

    public void executeUpdate(String query) throws SQLException{
        Connection con = DriverManager.getConnection("dbConnectionurl");
        Statement st = con.createStatement();
        st.executeUpdate(query);
    }
}
