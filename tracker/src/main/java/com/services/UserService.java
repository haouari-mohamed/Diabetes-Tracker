package com.services;

import com.model.User;
import com.repositry.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // Dans un vrai scénario, vous ne feriez pas cela. C'est juste pour simuler un utilisateur unique.
    public User getDefaultUser() {
        User user = findByUsername("defaultuser");
        if (user == null) {
            user = new User();
            user.setUsername("defaultuser");
            user.setFirstName("Default");
            user.setLastName("User");
            user = registerUser(user);
        }
        return user;
    }
}