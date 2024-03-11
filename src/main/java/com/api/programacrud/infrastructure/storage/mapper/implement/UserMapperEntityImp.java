package com.api.programacrud.infrastructure.storage.mapper.implement;

import com.api.programacrud.domain.model.UserModel;
import com.api.programacrud.infrastructure.storage.entity.UserEntity;
import com.api.programacrud.infrastructure.storage.mapper.interfaces.UserMapperEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapperEntityImp implements UserMapperEntity {
    @Override
    public UserModel convertToModel(UserEntity userEntity) {
        return null;
    }

    @Override
    public UserEntity convertToEntity(UserModel userModel) {
        return null;
    }
}
