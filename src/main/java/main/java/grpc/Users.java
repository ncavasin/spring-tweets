// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: users.proto

package grpc;

public final class Users {
  private Users() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_users_UserById_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_users_UserById_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_users_UserByDni_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_users_UserByDni_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_users_UserByName_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_users_UserByName_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_users_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_users_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_users_UserDto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_users_UserDto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_users_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_users_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_users_UsersList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_users_UsersList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013users.proto\022\005users\"\026\n\010UserById\022\n\n\002id\030\001" +
      " \001(\005\"\030\n\tUserByDni\022\013\n\003dni\030\001 \001(\005\"\032\n\nUserBy" +
      "Name\022\014\n\004name\030\001 \001(\t\"\007\n\005Empty\"C\n\007UserDto\022\013" +
      "\n\003dni\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\r\n\005email\030\003 \001(\t" +
      "\022\016\n\006active\030\004 \001(\010\"L\n\004User\022\n\n\002id\030\001 \001(\005\022\013\n\003" +
      "dni\030\002 \001(\005\022\014\n\004name\030\003 \001(\t\022\r\n\005email\030\004 \001(\t\022\016" +
      "\n\006active\030\005 \001(\010\"&\n\tUsersList\022\031\n\004user\030\001 \003(" +
      "\0132\013.users.User2\374\002\n\014UsersService\022*\n\010findB" +
      "yId\022\017.users.UserById\032\013.users.User\"\000\022,\n\tf" +
      "indByDni\022\020.users.UserByDni\032\013.users.User\"" +
      "\000\022.\n\nfindByName\022\021.users.UserByName\032\013.use" +
      "rs.User\"\000\022+\n\007findAll\022\014.users.Empty\032\020.use" +
      "rs.UsersList\"\000\022+\n\ncreateUser\022\016.users.Use" +
      "rDto\032\013.users.User\"\000\022(\n\nupdateUser\022\013.user" +
      "s.User\032\013.users.User\"\000\0220\n\016deactivateUser\022" +
      "\017.users.UserById\032\013.users.User\"\000\022,\n\ndelet" +
      "eUser\022\017.users.UserById\032\013.users.User\"\000B\010\n" +
      "\004grpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_users_UserById_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_users_UserById_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_users_UserById_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_users_UserByDni_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_users_UserByDni_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_users_UserByDni_descriptor,
        new java.lang.String[] { "Dni", });
    internal_static_users_UserByName_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_users_UserByName_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_users_UserByName_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_users_Empty_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_users_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_users_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_users_UserDto_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_users_UserDto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_users_UserDto_descriptor,
        new java.lang.String[] { "Dni", "Name", "Email", "Active", });
    internal_static_users_User_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_users_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_users_User_descriptor,
        new java.lang.String[] { "Id", "Dni", "Name", "Email", "Active", });
    internal_static_users_UsersList_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_users_UsersList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_users_UsersList_descriptor,
        new java.lang.String[] { "User", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}