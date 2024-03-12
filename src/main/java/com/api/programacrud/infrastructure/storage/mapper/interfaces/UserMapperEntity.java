package com.api.programacrud.infrastructure.storage.mapper.interfaces;

import com.api.programacrud.domain.model.UserModel;
import com.api.programacrud.infrastructure.storage.entity.UserEntity;

public interface UserMapperEntity {
    UserModel convertToModel(UserEntity userEntity);

    UserEntity convertToEntity(UserModel userModel);
}
