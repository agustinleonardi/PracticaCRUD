package com.api.programacrud.infrastructure.storage.persistence;

import com.api.programacrud.aplication.UserStorage;
import com.api.programacrud.domain.model.UserModel;
import com.api.programacrud.infrastructure.storage.mapper.interfaces.UserMapperEntity;
import com.api.programacrud.infrastructure.storage.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserPersistence implements UserStorage {
    private final UserMapperEntity userMapperEntity;
    private final UserRepository userRepository;
    @Override
    public UserModel get(Long id) {
        return userMapperEntity.convertToModel(userRepository.getReferenceById(id));
    }

    @Override
    public UserModel save(UserModel userModel) {
        return userMapperEntity.convertToModel(userRepository.save(userMapperEntity.convertToEntity(userModel)));
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserModel update(UserModel userModel) {
        return userMapperEntity.convertToModel(userRepository.save(userMapperEntity.convertToEntity(userModel)));

    }
}
