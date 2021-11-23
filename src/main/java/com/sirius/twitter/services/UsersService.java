package com.sirius.twitter.services;

import com.sirius.twitter.UsersServiceGrpc.UsersServiceImplBase;
import com.sirius.twitter.models.User;
import com.sirius.twitter.repositories.IUsersRepositoryGrpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService extends UsersServiceImplBase implements IUsersService{

    @Autowired
    IUsersRepositoryGrpc iUsersRepositoryGrpc;

    @Override
    public Optional<User> findById(int id) {
        return iUsersRepositoryGrpc.findById(id);
    }

    @Override
    public List<User> findAll() {
        return iUsersRepositoryGrpc.findAll();
    }

    @Override
    public User create(User user) {
        return iUsersRepositoryGrpc.create(user);
    }

    @Override
    public Optional<User> update(int id, User user) {
        return iUsersRepositoryGrpc.update(id, user);
    }

    @Override
    public Optional<User> deactivate(int id) {
        return iUsersRepositoryGrpc.deactivate(id);
    }

    @Override
    public Optional<User> delete(int id) {
        return iUsersRepositoryGrpc.delete(id);
    }
}
