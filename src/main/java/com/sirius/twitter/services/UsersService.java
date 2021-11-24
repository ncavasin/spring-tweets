package com.sirius.twitter.services;

import com.sirius.twitter.*;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UsersService implements IUsersService {

    private UsersServiceGrpc.UsersServiceBlockingStub stub;
    private ManagedChannel managedChannel;

    private void open_channel(){
        this.managedChannel = ManagedChannelBuilder.forAddress("localhost", 50000)
                .usePlaintext()
                .build();

        this.stub = UsersServiceGrpc.newBlockingStub(managedChannel);
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

    @Override
    public com.sirius.twitter.models.User createUser(com.sirius.twitter.models.User user) {
        this.open_channel();

        // Create request class using received param
        UserDto userDto = this.populateUserDto(user);

        // Create response class & make the call
        User response = this.stub.createUser(userDto);

        // Log output
        System.out.println(response.toString());
        System.out.println(response.getId() + " " + response.getName() + " " +  response.getActive());

        this.close_channel();

        // Return dummy
        return new com.sirius.twitter.models.User();
    }

    @Override
    public Optional<com.sirius.twitter.models.User> findById(int id) {
        this.open_channel();
        UserById userById = UserById.newBuilder().setId(id).build();
        User response = this.stub.findById(userById);
        System.out.println(response.toString());
        this.close_channel();
        return Optional.empty();
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
        this.open_channel();
        UsersList response = this.stub.findAll(Empty.newBuilder().build());
        System.out.println("Users list: " + response.getUserList());
        System.out.println("User count: #" + response.getUserCount());
        System.out.println("User #0 name:" + response.getUser(0).getName());
        this.close_channel();
        return null;
    }

    @Override
    public Optional<com.sirius.twitter.models.User> updateUser(int id, com.sirius.twitter.models.User user) {
        return Optional.empty();
    }

    @Override
    public Optional<com.sirius.twitter.models.User> deactivateUser(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<com.sirius.twitter.models.User> deleteUser(int id) {
        return Optional.empty();
    }
}
