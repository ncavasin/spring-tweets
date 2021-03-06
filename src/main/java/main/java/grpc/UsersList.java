// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: users.proto

package grpc;

/**
 * <pre>
 * List of users
 * </pre>
 *
 * Protobuf type {@code users.UsersList}
 */
public final class UsersList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:users.UsersList)
    UsersListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UsersList.newBuilder() to construct.
  private UsersList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UsersList() {
    user_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UsersList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UsersList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              user_ = new java.util.ArrayList<grpc.User>();
              mutable_bitField0_ |= 0x00000001;
            }
            user_.add(
                input.readMessage(grpc.User.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        user_ = java.util.Collections.unmodifiableList(user_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.Users.internal_static_users_UsersList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.Users.internal_static_users_UsersList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.UsersList.class, grpc.UsersList.Builder.class);
  }

  public static final int USER_FIELD_NUMBER = 1;
  private java.util.List<grpc.User> user_;
  /**
   * <code>repeated .users.User user = 1;</code>
   */
  @java.lang.Override
  public java.util.List<grpc.User> getUserList() {
    return user_;
  }
  /**
   * <code>repeated .users.User user = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends grpc.UserOrBuilder> 
      getUserOrBuilderList() {
    return user_;
  }
  /**
   * <code>repeated .users.User user = 1;</code>
   */
  @java.lang.Override
  public int getUserCount() {
    return user_.size();
  }
  /**
   * <code>repeated .users.User user = 1;</code>
   */
  @java.lang.Override
  public grpc.User getUser(int index) {
    return user_.get(index);
  }
  /**
   * <code>repeated .users.User user = 1;</code>
   */
  @java.lang.Override
  public grpc.UserOrBuilder getUserOrBuilder(
      int index) {
    return user_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < user_.size(); i++) {
      output.writeMessage(1, user_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < user_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, user_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.UsersList)) {
      return super.equals(obj);
    }
    grpc.UsersList other = (grpc.UsersList) obj;

    if (!getUserList()
        .equals(other.getUserList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getUserCount() > 0) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUserList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.UsersList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.UsersList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.UsersList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.UsersList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.UsersList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.UsersList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.UsersList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.UsersList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.UsersList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.UsersList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.UsersList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.UsersList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(grpc.UsersList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * List of users
   * </pre>
   *
   * Protobuf type {@code users.UsersList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:users.UsersList)
      grpc.UsersListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.Users.internal_static_users_UsersList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.Users.internal_static_users_UsersList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.UsersList.class, grpc.UsersList.Builder.class);
    }

    // Construct using grpc.UsersList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getUserFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userBuilder_ == null) {
        user_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        userBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.Users.internal_static_users_UsersList_descriptor;
    }

    @java.lang.Override
    public grpc.UsersList getDefaultInstanceForType() {
      return grpc.UsersList.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.UsersList build() {
      grpc.UsersList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.UsersList buildPartial() {
      grpc.UsersList result = new grpc.UsersList(this);
      int from_bitField0_ = bitField0_;
      if (userBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          user_ = java.util.Collections.unmodifiableList(user_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.user_ = user_;
      } else {
        result.user_ = userBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.UsersList) {
        return mergeFrom((grpc.UsersList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.UsersList other) {
      if (other == grpc.UsersList.getDefaultInstance()) return this;
      if (userBuilder_ == null) {
        if (!other.user_.isEmpty()) {
          if (user_.isEmpty()) {
            user_ = other.user_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserIsMutable();
            user_.addAll(other.user_);
          }
          onChanged();
        }
      } else {
        if (!other.user_.isEmpty()) {
          if (userBuilder_.isEmpty()) {
            userBuilder_.dispose();
            userBuilder_ = null;
            user_ = other.user_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUserFieldBuilder() : null;
          } else {
            userBuilder_.addAllMessages(other.user_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      grpc.UsersList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.UsersList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<grpc.User> user_ =
      java.util.Collections.emptyList();
    private void ensureUserIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        user_ = new java.util.ArrayList<grpc.User>(user_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        grpc.User, grpc.User.Builder, grpc.UserOrBuilder> userBuilder_;

    /**
     * <code>repeated .users.User user = 1;</code>
     */
    public java.util.List<grpc.User> getUserList() {
      if (userBuilder_ == null) {
        return java.util.Collections.unmodifiableList(user_);
      } else {
        return userBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .users.User user = 1;</code>
     */
    public int getUserCount() {
      if (userBuilder_ == null) {
        return user_.size();
      } else {
        return userBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .users.User user = 1;</code>
     */
    public grpc.User getUser(int index) {
      if (userBuilder_ == null) {
        return user_.get(index);
      } else {
        return userBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .users.User user = 1;</code>
     */
    public Builder setUser(
        int index, grpc.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserIsMutable();
        user_.set(index, value);
        onChanged();
      } else {
        userBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .users.User user = 1;</code>
     */
    public Builder setUser(
        int index, grpc.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.set(index, builderForValue.build());
        onChanged();
      } else {
        userBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .users.User user = 1;</code>
     */
    public Builder addUser(grpc.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserIsMutable();
        user_.add(value);
        onChanged();
      } else {
        userBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .users.User user = 1;</code>
     */
    public Builder addUser(
        int index, grpc.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserIsMutable();
        user_.add(index, value);
        onChanged();
      } else {
        userBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .users.User user = 1;</code>
     */
    public Builder addUser(
        grpc.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.add(builderForValue.build());
        onChanged();
      } else {
        userBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .users.User user = 1;</code>
     */
    public Builder addUser(
        int index, grpc.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.add(index, builderForValue.build());
        onChanged();
      } else {
        userBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .users.User user = 1;</code>
     */
    public Builder addAllUser(
        java.lang.Iterable<? extends grpc.User> values) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, user_);
        onChanged();
      } else {
        userBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .users.User user = 1;</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        user_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .users.User user = 1;</code>
     */
    public Builder removeUser(int index) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.remove(index);
        onChanged();
      } else {
        userBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .users.User user = 1;</code>
     */
    public grpc.User.Builder getUserBuilder(
        int index) {
      return getUserFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .users.User user = 1;</code>
     */
    public grpc.UserOrBuilder getUserOrBuilder(
        int index) {
      if (userBuilder_ == null) {
        return user_.get(index);  } else {
        return userBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .users.User user = 1;</code>
     */
    public java.util.List<? extends grpc.UserOrBuilder> 
         getUserOrBuilderList() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(user_);
      }
    }
    /**
     * <code>repeated .users.User user = 1;</code>
     */
    public grpc.User.Builder addUserBuilder() {
      return getUserFieldBuilder().addBuilder(
          grpc.User.getDefaultInstance());
    }
    /**
     * <code>repeated .users.User user = 1;</code>
     */
    public grpc.User.Builder addUserBuilder(
        int index) {
      return getUserFieldBuilder().addBuilder(
          index, grpc.User.getDefaultInstance());
    }
    /**
     * <code>repeated .users.User user = 1;</code>
     */
    public java.util.List<grpc.User.Builder> 
         getUserBuilderList() {
      return getUserFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        grpc.User, grpc.User.Builder, grpc.UserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            grpc.User, grpc.User.Builder, grpc.UserOrBuilder>(
                user_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:users.UsersList)
  }

  // @@protoc_insertion_point(class_scope:users.UsersList)
  private static final grpc.UsersList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.UsersList();
  }

  public static grpc.UsersList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UsersList>
      PARSER = new com.google.protobuf.AbstractParser<UsersList>() {
    @java.lang.Override
    public UsersList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UsersList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UsersList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UsersList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.UsersList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

