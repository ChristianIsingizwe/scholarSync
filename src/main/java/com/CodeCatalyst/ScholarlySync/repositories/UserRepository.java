package com.CodeCatalyst.ScholarlySync.repositories;

import com.CodeCatalyst.ScholarlySync.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);
    User findByEmail(String email);
    List<User> findAll();

    <S extends User> S save(S user);
    User updateById(long id, User user);
    void deleteById(long id);

}
