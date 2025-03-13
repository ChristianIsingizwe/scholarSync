package com.CodeCatalyst.ScholarlySync.repositories;

import com.CodeCatalyst.ScholarlySync.models.Appeal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppealRepository extends JpaRepository<Appeal, Long> {
    Appeal findById(long id);
    List<Appeal> findByCourse_courseId(long courseId);
    List<Appeal> findAll();
    Appeal updateAppealById(long id, Appeal appeal);
    <S extends Appeal> S save(S appeal);
    void deleteAppealById(long id);
}
