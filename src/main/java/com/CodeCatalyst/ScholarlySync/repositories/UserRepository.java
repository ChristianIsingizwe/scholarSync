package com.CodeCatalyst.ScholarlySync.repositories;

import com.CodeCatalyst.ScholarlySync.enums.Role;
import com.CodeCatalyst.ScholarlySync.models.Class;
import com.CodeCatalyst.ScholarlySync.models.User;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserById(Long id);
    User findUserByEmail(String email);
    User save(User user);
    List<User> findUserByRole(@NotNull Role role);
    List<User> findUserBySchoolClass(Class schoolClass);
}
