package com.armen.mkrtchyan.facade;

import com.armen.mkrtchyan.facade.application.MailService;
import com.armen.mkrtchyan.facade.application.User;
import com.armen.mkrtchyan.facade.application.UserRepository;
import com.armen.mkrtchyan.facade.application.UserService;

import java.util.HashMap;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 27, 2014</pre>
 */
public class FacadeClient {

    public static void main(String[] args) {
        UserService userService = init();
        userService.deleteUser(userService.findUserByEmail("some.old@mail.blah"));
        userService.updateUser(
                new User("Armen", "Mkrtchyan", "some.new@mail.blah"),
                userService.findUserByEmail("some@mail.blah")
        );
    }


    private static UserService init(){
        UserService userService = new UserService(
                new UserRepository(new HashMap<Integer, User>()),
                new MailService()
        );
        userService.createUser(new User("John", "Smith", "johnsmith@mail.blah"));
        userService.createUser(new User("Armen", "Mkrtchyan", "some@mail.blah"));
        userService.createUser(new User("Natalia", "Mutko", "some.old@mail.blah"));
        userService.createUser(new User("Vram", "Berberyan", "some.young@mail.blah"));
        userService.createUser(new User("Vardanush", "Israelyan", "some.female.young@mail.blah"));
        return userService;
    }

}
