package com.sirius.twitter.services;


import grpc.*;
import grpc.Empty;
import grpc.User;
import grpc.UserById;
import grpc.UserDto;
import grpc.UsersList;
import grpc.UsersServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class UsersService implements IUsersService {

    private UsersServiceGrpc.UsersServiceBlockingStub stub;
    private ManagedChannel managedChannel;

    private void open_channel(){
        try{
            managedChannel = ManagedChannelBuilder.forAddress("localhost", 50051)
                    .usePlaintext()
                    .build();
            stub = UsersServiceGrpc.newBlockingStub(managedChannel);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void close_channel(){
        this.managedChannel.shutdown();
        this.stub = null;
    }

    private UserDto populateUserDto(com.sirius.twitter.models.User user){
        return UserDto.newBuilder()
                .setDni(user.getDni())
                .setName(user.getName())
                .setEmail(user.getEmail())
                .setActive(true)
                .build();
    }

    protected com.sirius.twitter.models.User populateUser(User gUser){
        com.sirius.twitter.models.User user = new com.sirius.twitter.models.User();
        user.setId(gUser.getId());
        user.setDni(gUser.getDni());
        user.setName(gUser.getName());
        user.setEmail(gUser.getEmail());
        user.setActive(gUser.getActive());
        return user;
    }

    private User populateUserGrpc(int id, com.sirius.twitter.models.User user){
        return User.newBuilder()
                .setId(id)
                .setDni(user.getDni())
                .setName(user.getName())
                .setEmail(user.getEmail())
                .setActive(true)
                .build();
    }

    private List<com.sirius.twitter.models.User> populateUserList(UsersList gUsersList) {
        List<com.sirius.twitter.models.User> usersList = new ArrayList<com.sirius.twitter.models.User>();
        try{
            for (User gUser : gUsersList.getUserList()) {
                usersList.add(populateUser(gUser));
                System.out.println(gUser.getId());
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return usersList;
    }

    @Override
    public com.sirius.twitter.models.User createUser(com.sirius.twitter.models.User user) {
        open_channel();
        UserDto userDto = populateUserDto(user);
        User gUser = User.newBuilder().build();
        try{
            gUser = stub.createUser(userDto);
            System.out.println("This action created user #" + gUser.getId());
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        close_channel();
        return populateUser(gUser);
    }

    @Override
    public Optional<com.sirius.twitter.models.User> findById(int id) {
        open_channel();
        User gUser = User.newBuilder().build();
        try {
            UserById userById = UserById.newBuilder().setId(id).build();
            gUser = stub.findById(userById);
            System.out.println("This action found user #" + gUser.getId());
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        close_channel();
        return Optional.of(populateUser(gUser));
    }

    @Override
    public Optional<com.sirius.twitter.models.User> findByDni(int dni) {
        this.open_channel();

        this.close_channel();
        return Optional.empty();
    }

    @Override
    public Optional<com.sirius.twitter.models.User> findByName(String name) {
        this.open_channel();

        this.close_channel();
        return Optional.empty();
    }

    @Override
    public List<com.sirius.twitter.models.User> findAll() {
        open_channel();
        UsersList gUsersList = UsersList.newBuilder().build();
        try{
            gUsersList = this.stub.findAll(Empty.newBuilder().build());
            System.out.println(gUsersList.getUserList());
            System.out.println("Users list: " + gUsersList.getUserList());
            System.out.println("User count: #" + gUsersList.getUserCount());
            System.out.println("User #0 name:" + gUsersList.getUser(0).getName());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        close_channel();
        return populateUserList(gUsersList);
    }

    @Override
    public Optional<com.sirius.twitter.models.User> updateUser(int id, com.sirius.twitter.models.User user) {
        open_channel();
        User receivedUser = populateUserGrpc(id, user);
        User gUser = User.newBuilder().build();
        try{
            UserById userById = UserById.newBuilder().setId(id).build();
            // Find user by id
            gUser = stub.findById(userById);
            // Update user - DO NOT MODIFY ID
            gUser = stub.updateUser(receivedUser);
            // Refresh user
            gUser = stub.findById(userById);
            System.out.println("This action updated user #" + gUser.getId());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        close_channel();
        return Optional.of(populateUser(gUser));
    }

    @Override
    public Optional<com.sirius.twitter.models.User> deactivateUser(int id) {
        open_channel();
        User gUser = User.newBuilder().build();
        try{
            UserById userById = UserById.newBuilder().setId(id).build();
            gUser = stub.deactivateUser(userById);
            System.out.println("This action deactivated user #" + gUser.getId());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        close_channel();
        return Optional.of(populateUser(gUser));
    }

    @Override
    public Optional<com.sirius.twitter.models.User> deleteUser(int id) {
        open_channel();
        User gUser = User.newBuilder().build();
        try{
            gUser = stub.deleteUser(UserById.newBuilder().setId(id).build());
            System.out.println("This action deleted user #" + gUser.getId());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        close_channel();
        return Optional.of(populateUser(gUser));
    }
}
