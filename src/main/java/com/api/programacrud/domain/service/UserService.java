package com.api.programacrud.domain.service;

import com.api.programacrud.aplication.UseStorage;
import com.api.programacrud.aplication.UserUseCase;
import com.api.programacrud.domain.model.UserModel;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class userService implements UserUseCase {
    private UseStorage useStorage;
    @Override
    public UserModel get(Long id) {
        return useStorage.get(id);
    }

    @Override
    public UserModel save(UserModel userModel) {
        return useStorage.save(userModel);
    }

    @Override
    public UserModel delete(Long id) {
        return useStorage.delete(id);
    }

    @Override
    public UserModel update(UserModel userModel) {
        return useStorage.update(userModel);
    }
}