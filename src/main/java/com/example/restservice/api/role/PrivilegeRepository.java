package com.example.restservice.api.role;

import com.example.restservice.domain.privilege.Privilege;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {

}
