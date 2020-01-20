package com.utopia.demo.repository;

import com.utopia.demo.model.RolePermissionRelation;
import com.utopia.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolePermissionRelationRepository extends JpaRepository<RolePermissionRelation, Long> {

}
