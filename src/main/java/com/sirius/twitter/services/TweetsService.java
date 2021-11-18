package com.sirius.twitter.services;

import com.sirius.twitter.models.Tweet;
import org.springframework.stereotype.Service;
import com.sirius.twitter.repositories.ITweetsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class TweetsService implements ITweetsService{

    @Autowired
    ITweetsRepository iTweetsRepository;

    public List<Tweet> findAll(){
        return (List<Tweet>) iTweetsRepository.findAll();
    }

    public Optional<Tweet> findById(int id){
        return iTweetsRepository.findById(id);
    }

    public List<Tweet> listThread(int id){
        // TODO
        return null;
    }

    public Tweet tweet(Tweet tweet){
        return iTweetsRepository.save(tweet);
    }

    public Tweet reply(int id, Tweet reply){
        // Fetch parent tweet
        Optional<Tweet> ogTweet = iTweetsRepository.findById(id);
        if (ogTweet.isEmpty()){
            throw new IllegalArgumentException("Referenced ID not found in Database");
        }
        // Save reply
        iTweetsRepository.save(reply);
        // Add reply to the parent's list of replies
        ogTweet.get().getReplies().add(reply);
        iTweetsRepository.save(ogTweet.get());

        return reply;
    }

    public Tweet retweet(int id){
        Optional<Tweet> dbTweet = iTweetsRepository.findById(id);
        dbTweet.get().setRetweets(dbTweet.get().getRetweets()+1);
        return  iTweetsRepository.save(dbTweet.get());
    }

    public Tweet undo_retweet(int id){
        Optional<Tweet> dbTweet = this.findById(id);
        dbTweet.get().setRetweets(dbTweet.get().getRetweets()-1);
        return  iTweetsRepository.save(dbTweet.get());
    }

    public Tweet like(int id){
        Optional<Tweet> dbTweet = iTweetsRepository.findById(id);
        dbTweet.get().setLikes(dbTweet.get().getLikes()+1);
        return  iTweetsRepository.save(dbTweet.get());
    }

    public Tweet dislike(int id){
        Optional<Tweet> dbTweet = iTweetsRepository.findById(id);
        if(dbTweet.isEmpty()){
            throw new IllegalArgumentException("Referenced ID not found in Database");
        }
        dbTweet.get().setLikes(dbTweet.get().getLikes()-1);
        return  iTweetsRepository.save(dbTweet.get());
    }

    public String delete(int id){
        iTweetsRepository.deleteById(id);
        return "This action deleted tweet #"+id;
    }
}
