package com.sirius.twitter.controllers;

import com.sirius.twitter.models.Tweet;
import com.sirius.twitter.services.ITweetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tweets/")
public class TweetsController {

    @Autowired
    ITweetsService iTweetsService;

    @GetMapping("findAll")
    public List<Tweet> findAll(){
        return iTweetsService.findAll();
    }

    @GetMapping("findById/{id}")
    public Optional<Tweet> findById(@PathVariable int id){
        return iTweetsService.findById(id);
    }

    @PostMapping("tweet")
    public Tweet tweet(@RequestBody Tweet tweet){
        return iTweetsService.tweet(tweet);
    }

    @PostMapping("reply/{id}")
    public Tweet reply(@PathVariable int id, @RequestBody Tweet reply){
        return iTweetsService.reply(id, reply);
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable int id){
        return iTweetsService.delete(id);
    }

    @PatchMapping("like/{id}")
    public Tweet like(@PathVariable int id){
        return iTweetsService.like(id);
    }

    @PatchMapping("dislike/{id}")
    public Tweet dislike(@PathVariable int id){
        return iTweetsService.dislike(id);
    }

    @PatchMapping("retweet/{id}")
    public Tweet retweet(@PathVariable int id){
        return iTweetsService.retweet(id);
    }

    @PatchMapping("undo_retweet/{id}")
    public Tweet undo_retweet(@PathVariable int id){
        return iTweetsService.undo_retweet(id);
    }




}
