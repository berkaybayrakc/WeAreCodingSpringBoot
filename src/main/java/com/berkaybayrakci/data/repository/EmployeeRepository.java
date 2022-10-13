package com.berkaybayrakci.data.repository;

import com.berkaybayrakci.data.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// For JPA and Hibernate Root operation
// JpaRepository > CrudRepository
// Cr:create u:update d:delete Crud

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

}
