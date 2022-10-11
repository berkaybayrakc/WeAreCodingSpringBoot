package com.berkaybayrakci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// For JPA and Hibernate Root operation
// JpaRepository > CrudRepository
// C:create r:read u:update d:delete Crud

@Repository
public interface EmployeeRepository extends CrudRepository {

}
