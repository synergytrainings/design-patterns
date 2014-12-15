package com.synisys.design_patterns.command;

import com.synisys.design_patterns.command.command.CRService;
import com.synisys.design_patterns.command.command.CRUDService;
import com.synisys.design_patterns.command.invoker.ProfileForm;
import com.synisys.design_patterns.command.invoker.entity.Profile;

import java.util.Date;

/**
 * Created by haykanush.torchyan on 12/14/2014.
 */
public class CommandTest {

    public static void main(){
        Profile profile = new Profile("organisationName", "registrationNumber", new Date(System.currentTimeMillis()), 1);
        ProfileForm profileForm = new ProfileForm(profile, new CRService());

        //consider the user edits the Organisation profile and presses the Save button
        profileForm.save();



        Profile profile2 = new Profile("organisationName", "registrationNumber", new Date(System.currentTimeMillis()), 1);
        ProfileForm profileForm2 = new ProfileForm(profile2, new CRUDService());

        //consider the user edits the Organisation profile and presses the Save button
        profileForm.save();


    }
}
