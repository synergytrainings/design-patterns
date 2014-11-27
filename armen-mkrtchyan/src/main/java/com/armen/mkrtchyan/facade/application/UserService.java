package com.armen.mkrtchyan.facade.application;

import java.util.Collection;

/**
 * Facade
 *
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 27, 2014</pre>
 */
public class UserService {

    private final UserRepository userRepository;
    private final MailService mailService;

    public UserService(UserRepository userRepository, MailService mailService) {
        this.userRepository = userRepository;
        this.mailService = mailService;
    }

    public void createUser(User user) {
        userRepository.insertUser(user);
        mailService.send("dear " + user.getFullName() + " your account has been created", user);
    }

    public void updateUser(User newUser, User oldUser) {
        userRepository.removeUser(oldUser);
        userRepository.insertUser(newUser);
        mailService.send("dear " + oldUser.getFullName() + " your account has been updated", newUser);
    }

    public void deleteUser(User user) {
        userRepository.removeUser(user);
        mailService.send("dear " + user.getFullName() + " your account has been deleted", user);
    }

    public User findUserByEmail(String email) {
        Collection<User> users = userRepository.loadAll();
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

}
