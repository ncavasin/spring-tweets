package com.sirius.twitter.services;

import com.sirius.twitter.models.User;

import java.util.List;
import java.util.Optional;

public interface IUsersService {
    Optional<User> findById(int id);

    List<User> findAll();

    User create(User user);

    Optional<User> update(int id, User user);

    Optional<User> deactivate(int id);

    Optional<User> delete(int id);
}
