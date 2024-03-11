package com.api.programacrud.aplication;

import com.api.programacrud.domain.model.UserModel;

public interface UserStorage {
    UserModel get(Long id);

    UserModel save(UserModel userModel);

    void delete(Long id);

    UserModel update(UserModel userModel);
}
