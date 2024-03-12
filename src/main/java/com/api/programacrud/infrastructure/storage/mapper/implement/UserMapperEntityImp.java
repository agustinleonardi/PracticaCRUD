package com.api.programacrud.infrastructure.storage.mapper.implement;

import com.api.programacrud.domain.model.UserModel;
import com.api.programacrud.infrastructure.storage.entity.UserEntity;
import com.api.programacrud.infrastructure.storage.mapper.interfaces.UserMapperEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapperEntityImp implements UserMapperEntity {
    @Override
    public UserModel convertToModel(UserEntity userEntity) {
        UserModel userModel = new UserModel();
        userModel.setId(userEntity.getId());
        userModel.setName(userEntity.getName());
        userModel.setLastname(userEntity.getLastname());
        return userModel;
    }

    @Override
    public UserEntity convertToEntity(UserModel userModel) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userModel.getName());
        userEntity.setId(userModel.getId());
        userEntity.setLastname(userModel.getLastname());
        return userEntity;
    }
}
