package com.senatastan.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.senatastan.web.entities.AdminLoginEntities;



@Repository
public interface AdminLoginRepository extends JpaRepository<AdminLoginEntities, Long> {
    AdminLoginEntities findByUsername(String username);  // Kullanıcı adıyla admin arama
}

