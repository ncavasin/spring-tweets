package com.sirius.twitter.controllers;

import com.sirius.twitter.models.User;
import com.sirius.twitter.services.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="users/")
public class UsersController {


    @Autowired
    IUsersService iUsersService;

    @GetMapping("findAll")
    public List<User> findAll(){
        return iUsersService.findAll();
    }

    @GetMapping("findById/{id}")
    public Optional<User> findById(@PathVariable int id){
        return iUsersService.findById(id);
    }

    @PostMapping("create")
    public User create(@RequestBody User tweet){
        return iUsersService.create(tweet);
    }

    @PatchMapping("update/{id}")
    public Optional<User> update(@PathVariable int id, @RequestBody User reply){
        return iUsersService.update(id, reply);
    }

    @PatchMapping("deactivate/{id}")
    public Optional<User> deactivate(@PathVariable int id){
        return iUsersService.deactivate(id);
    }

    @DeleteMapping("delete/{id}")
    public Optional<User> delete(@PathVariable int id){
        return iUsersService.delete(id);
    }

}
