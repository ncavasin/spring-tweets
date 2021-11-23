package com.sirius.twitter.repositories;

import com.sirius.twitter.models.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUsersRepositoryGrpc {

    Optional<User> findById(int id);

    List<User> findAll();

    User create(User user);

    Optional<User> update(int id, User user);

    Optional<User> deactivate(int id);

    Optional<User> delete(int id);

}
