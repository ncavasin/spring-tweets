// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: users.proto

package com.sirius.twitter;

public interface UsersListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.sirius.twitter.UsersList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.sirius.twitter.User user = 1;</code>
   */
  java.util.List<com.sirius.twitter.User> 
      getUserList();
  /**
   * <code>repeated .com.sirius.twitter.User user = 1;</code>
   */
  com.sirius.twitter.User getUser(int index);
  /**
   * <code>repeated .com.sirius.twitter.User user = 1;</code>
   */
  int getUserCount();
  /**
   * <code>repeated .com.sirius.twitter.User user = 1;</code>
   */
  java.util.List<? extends com.sirius.twitter.UserOrBuilder> 
      getUserOrBuilderList();
  /**
   * <code>repeated .com.sirius.twitter.User user = 1;</code>
   */
  com.sirius.twitter.UserOrBuilder getUserOrBuilder(
      int index);
}