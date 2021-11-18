package com.sirius.twitter.services;

import com.sirius.twitter.models.Tweet;

import java.util.List;
import java.util.Optional;

public interface ITweetsService {

    public Optional<Tweet> findById(int id);

    public List<Tweet> findAll();

    public Tweet tweet(Tweet tweet);

    public Tweet reply(int id, Tweet reply);

    public Tweet retweet(int id);

    public Tweet undo_retweet(int id);

    public Tweet like(int id);

    public Tweet dislike(int id);

    public String delete(int id);
}