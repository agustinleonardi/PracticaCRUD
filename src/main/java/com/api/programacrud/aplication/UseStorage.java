package com.api.programacrud.aplication;

import com.api.programacrud.domain.model.UserModel;

public interface UseStorage {
    UserModel get(Long id);

    UserModel save(UserModel userModel);

    UserModel delete(Long id);

    UserModel update(UserModel userModel);
}
