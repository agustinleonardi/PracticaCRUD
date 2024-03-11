package com.api.programacrud.infrastructure.Storage;

import com.api.programacrud.aplication.UserStorage;
import com.api.programacrud.domain.model.UserModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserPersistence implements UserStorage {
    @Override
    public UserModel get(Long id) {
        return null;
    }

    @Override
    public UserModel save(UserModel userModel) {
        return null;
    }

    @Override
    public UserModel delete(Long id) {
        return null;
    }

    @Override
    public UserModel update(UserModel userModel) {
        return null;
    }
}
