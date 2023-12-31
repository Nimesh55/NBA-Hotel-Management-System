package com.nba.hotel_management_system.repository;

import com.nba.hotel_management_system.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String aLong);
    boolean existsByName(String role);

}
