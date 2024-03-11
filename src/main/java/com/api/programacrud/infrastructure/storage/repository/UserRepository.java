package com.api.programacrud.infrastructure.storage.repository;

import com.api.programacrud.infrastructure.storage.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <UserEntity, Long> {
}
