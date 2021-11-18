package com.sirius.twitter.repositories;

import com.sirius.twitter.models.Tweet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITweetsRepository extends CrudRepository<Tweet, Integer> {
}
