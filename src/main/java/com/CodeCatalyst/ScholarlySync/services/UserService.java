package com.CodeCatalyst.ScholarlySync.services;

import com.CodeCatalyst.ScholarlySync.models.User;
import com.CodeCatalyst.ScholarlySync.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> findAll(Long id, int pageSize){
        Pageable pageable = PageRequest.of(0, pageSize);
        return userRepository.findByIdGreaterThanOrderByIdDesc(id, pageable);
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User findByEmail( String email) {
        return userRepository.findByEmail(email);
    }
    public User save(User user){
        return userRepository.save(user);
    }

    public User updateUser(long id, User newUser){
        return userRepository.updateById(id, newUser);
    }

    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
}
