package com.synisys.design_patterns.factory;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by haykanush.torchyan on 11/6/2014.
 */
public class Initializer {

    public static void init(){
        MultilingualValuePrototype mlPrototype = MultilingualValuePrototype.getInstance();
        try {
            for (ResultSet row : DAO.executeSelect("SELECT * FROM kb_am_message", new Object() {{
            }})) {
                Integer languageId = row.getInt("iLanguageID");
                Integer messageId = row.getInt("iMessageID");
                String messageText = row.getString("sText");

                //if there is no map for current message
                if (!mlPrototype.containsKey(messageId)) {
                    MultilingualValue ml = new MultilingualValue();
                    mlPrototype.putMessage(messageId, ml);
                }
                mlPrototype.getMessage(messageId).put(languageId, messageText);
            }
        } catch (SQLException ex){
            Log4j.getLogger(this.getClass()).error("Error loading kb_am_messages", ex);
        }

    }

}
