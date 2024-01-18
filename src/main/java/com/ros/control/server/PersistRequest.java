// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/ros/control/proto/persistor.proto

// Protobuf Java Version: 3.25.2
package com.ros.control.server;

/**
 * Protobuf type {@code com.ros.control.server.PersistRequest}
 */
public final class PersistRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ros.control.server.PersistRequest)
    PersistRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PersistRequest.newBuilder() to construct.
  private PersistRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PersistRequest() {
    hostname_ = "";
    username_ = "";
    password_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PersistRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ros.control.server.PersistorOuterClass.internal_static_com_ros_control_server_PersistRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ros.control.server.PersistorOuterClass.internal_static_com_ros_control_server_PersistRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ros.control.server.PersistRequest.class, com.ros.control.server.PersistRequest.Builder.class);
  }

  public static final int PORT_FIELD_NUMBER = 1;
  private int port_ = 0;
  /**
   * <code>int32 port = 1;</code>
   * @return The port.
   */
  @java.lang.Override
  public int getPort() {
    return port_;
  }

  public static final int HOSTNAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object hostname_ = "";
  /**
   * <code>string hostname = 2;</code>
   * @return The hostname.
   */
  @java.lang.Override
  public java.lang.String getHostname() {
    java.lang.Object ref = hostname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostname_ = s;
      return s;
    }
  }
  /**
   * <code>string hostname = 2;</code>
   * @return The bytes for hostname.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHostnameBytes() {
    java.lang.Object ref = hostname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hostname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERNAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object username_ = "";
  /**
   * <code>string username = 3;</code>
   * @return The username.
   */
  @java.lang.Override
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <code>string username = 3;</code>
   * @return The bytes for username.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PASSWORD_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object password_ = "";
  /**
   * <code>string password = 4;</code>
   * @return The password.
   */
  @java.lang.Override
  public java.lang.String getPassword() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      password_ = s;
      return s;
    }
  }
  /**
   * <code>string password = 4;</code>
   * @return The bytes for password.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPasswordBytes() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      password_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (port_ != 0) {
      output.writeInt32(1, port_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hostname_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, hostname_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, username_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(password_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, password_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, port_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hostname_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, hostname_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, username_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(password_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, password_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ros.control.server.PersistRequest)) {
      return super.equals(obj);
    }
    com.ros.control.server.PersistRequest other = (com.ros.control.server.PersistRequest) obj;

    if (getPort()
        != other.getPort()) return false;
    if (!getHostname()
        .equals(other.getHostname())) return false;
    if (!getUsername()
        .equals(other.getUsername())) return false;
    if (!getPassword()
        .equals(other.getPassword())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (37 * hash) + HOSTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getHostname().hashCode();
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getPassword().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ros.control.server.PersistRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ros.control.server.PersistRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ros.control.server.PersistRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ros.control.server.PersistRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ros.control.server.PersistRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ros.control.server.PersistRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ros.control.server.PersistRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ros.control.server.PersistRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ros.control.server.PersistRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ros.control.server.PersistRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ros.control.server.PersistRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ros.control.server.PersistRequest parseFrom(
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
  public static Builder newBuilder(com.ros.control.server.PersistRequest prototype) {
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
   * Protobuf type {@code com.ros.control.server.PersistRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ros.control.server.PersistRequest)
      com.ros.control.server.PersistRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ros.control.server.PersistorOuterClass.internal_static_com_ros_control_server_PersistRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ros.control.server.PersistorOuterClass.internal_static_com_ros_control_server_PersistRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ros.control.server.PersistRequest.class, com.ros.control.server.PersistRequest.Builder.class);
    }

    // Construct using com.ros.control.server.PersistRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      port_ = 0;
      hostname_ = "";
      username_ = "";
      password_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ros.control.server.PersistorOuterClass.internal_static_com_ros_control_server_PersistRequest_descriptor;
    }

    @java.lang.Override
    public com.ros.control.server.PersistRequest getDefaultInstanceForType() {
      return com.ros.control.server.PersistRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.ros.control.server.PersistRequest build() {
      com.ros.control.server.PersistRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ros.control.server.PersistRequest buildPartial() {
      com.ros.control.server.PersistRequest result = new com.ros.control.server.PersistRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ros.control.server.PersistRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.port_ = port_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.hostname_ = hostname_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.username_ = username_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.password_ = password_;
      }
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
      if (other instanceof com.ros.control.server.PersistRequest) {
        return mergeFrom((com.ros.control.server.PersistRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ros.control.server.PersistRequest other) {
      if (other == com.ros.control.server.PersistRequest.getDefaultInstance()) return this;
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      if (!other.getHostname().isEmpty()) {
        hostname_ = other.hostname_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getPassword().isEmpty()) {
        password_ = other.password_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              port_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              hostname_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              username_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              password_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int port_ ;
    /**
     * <code>int32 port = 1;</code>
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
    }
    /**
     * <code>int32 port = 1;</code>
     * @param value The port to set.
     * @return This builder for chaining.
     */
    public Builder setPort(int value) {

      port_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 port = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPort() {
      bitField0_ = (bitField0_ & ~0x00000001);
      port_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object hostname_ = "";
    /**
     * <code>string hostname = 2;</code>
     * @return The hostname.
     */
    public java.lang.String getHostname() {
      java.lang.Object ref = hostname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hostname = 2;</code>
     * @return The bytes for hostname.
     */
    public com.google.protobuf.ByteString
        getHostnameBytes() {
      java.lang.Object ref = hostname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hostname = 2;</code>
     * @param value The hostname to set.
     * @return This builder for chaining.
     */
    public Builder setHostname(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      hostname_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string hostname = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHostname() {
      hostname_ = getDefaultInstance().getHostname();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string hostname = 2;</code>
     * @param value The bytes for hostname to set.
     * @return This builder for chaining.
     */
    public Builder setHostnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      hostname_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object username_ = "";
    /**
     * <code>string username = 3;</code>
     * @return The username.
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string username = 3;</code>
     * @return The bytes for username.
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string username = 3;</code>
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      username_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string username = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      username_ = getDefaultInstance().getUsername();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string username = 3;</code>
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      username_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object password_ = "";
    /**
     * <code>string password = 4;</code>
     * @return The password.
     */
    public java.lang.String getPassword() {
      java.lang.Object ref = password_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        password_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string password = 4;</code>
     * @return The bytes for password.
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      java.lang.Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string password = 4;</code>
     * @param value The password to set.
     * @return This builder for chaining.
     */
    public Builder setPassword(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      password_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string password = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPassword() {
      password_ = getDefaultInstance().getPassword();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string password = 4;</code>
     * @param value The bytes for password to set.
     * @return This builder for chaining.
     */
    public Builder setPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      password_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:com.ros.control.server.PersistRequest)
  }

  // @@protoc_insertion_point(class_scope:com.ros.control.server.PersistRequest)
  private static final com.ros.control.server.PersistRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ros.control.server.PersistRequest();
  }

  public static com.ros.control.server.PersistRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersistRequest>
      PARSER = new com.google.protobuf.AbstractParser<PersistRequest>() {
    @java.lang.Override
    public PersistRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<PersistRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersistRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ros.control.server.PersistRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

