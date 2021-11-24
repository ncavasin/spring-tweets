package com.sirius.twitter.services;

import com.sirius.twitter.models.User;

import java.util.List;
import java.util.Optional;

public interface IUsersService {

    User createUser(User user);

    Optional<com.sirius.twitter.models.User> findById(int id);

    Optional<com.sirius.twitter.models.User> findByDni(int dni);

    Optional<com.sirius.twitter.models.User> findByName(String name);

    List<com.sirius.twitter.models.User> findAll();

    Optional<com.sirius.twitter.models.User> updateUser(int id, com.sirius.twitter.models.User user);

    Optional<com.sirius.twitter.models.User> deactivateUser(int id);

    Optional<com.sirius.twitter.models.User> deleteUser(int id);
}
