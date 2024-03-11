package com.api.programacrud.aplication;

import com.api.programacrud.domain.model.UserModel;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserUseCase {
    UserModel get(Long id);

    UserModel save(UserModel userModel);

    UserModel delete(Long id);

    UserModel update(UserModel userModel);
}
