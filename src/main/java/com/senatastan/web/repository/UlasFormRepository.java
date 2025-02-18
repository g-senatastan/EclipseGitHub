package com.senatastan.web.repository;

import com.senatastan.web.entities.UlasFormEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UlasFormRepository extends JpaRepository<UlasFormEntities, Long> {
}
