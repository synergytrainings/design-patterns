package com.armen.mkrtchyan.facade.application;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class UserServiceTest {

    private UserService userService;

    @Before
    public void setUp() throws Exception {
        userService = new UserService(
                new UserRepository(new HashMap<Integer, User>()),
                new MailService()
        );
        userService.createUser(new User("John", "Smith", "johnsmith@mail.blah"));
        userService.createUser(new User("Armen", "Mkrtchyan", "some@mail.blah"));
        userService.createUser(new User("Natalia", "Mutko", "some.old@mail.blah"));
        userService.createUser(new User("Vram", "Berberyan", "some.young@mail.blah"));
        userService.createUser(new User("Vardanush", "Israelyan", "some.female.young@mail.blah"));
    }

    @Test
    public void testCreateUser() throws Exception {
        userService.createUser(new User("Armen", "Mkrtchyan", "some.unique@mail.blah"));
        Assert.assertNotNull(userService.findUserByEmail("some.unique@mail.blah"));
    }

    @Test
    public void testUpdateUser() throws Exception {
        User oldArmen = userService.findUserByEmail("some@mail.blah");
        userService.updateUser(new User("Armen", "Varosyan", "some@mail.blah"), oldArmen);
        Assert.assertNotEquals(userService.findUserByEmail("some@mail.blah").getLastName(), oldArmen.getLastName());
    }

    @Test
    public void testDeleteUser() throws Exception {
        userService.deleteUser(userService.findUserByEmail("some.young@mail.blah"));
        Assert.assertNull(userService.findUserByEmail("some.young@mail.blah"));
    }

    @Test
    public void testFindUserByEmail() throws Exception {
        Assert.assertNotNull(userService.findUserByEmail("some.female.young@mail.blah"));
    }
}