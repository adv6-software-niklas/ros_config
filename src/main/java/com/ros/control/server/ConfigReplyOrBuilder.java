// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/ros/control/proto/getter.proto

// Protobuf Java Version: 3.25.2
package com.ros.control.server;

public interface ConfigReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ros.control.server.ConfigReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.StringValue id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>.google.protobuf.StringValue id = 1;</code>
   * @return The id.
   */
  com.google.protobuf.StringValue getId();
  /**
   * <code>.google.protobuf.StringValue id = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getIdOrBuilder();

  /**
   * <code>int32 port = 2;</code>
   * @return The port.
   */
  int getPort();

  /**
   * <code>string hostname = 3;</code>
   * @return The hostname.
   */
  java.lang.String getHostname();
  /**
   * <code>string hostname = 3;</code>
   * @return The bytes for hostname.
   */
  com.google.protobuf.ByteString
      getHostnameBytes();

  /**
   * <code>string username = 4;</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <code>string username = 4;</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>string password = 5;</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 5;</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();
}