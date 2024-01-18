// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/ros/control/proto/persistor.proto

// Protobuf Java Version: 3.25.2
package com.ros.control.server;

public interface PersistRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ros.control.server.PersistRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 port = 1;</code>
   * @return The port.
   */
  int getPort();

  /**
   * <code>string hostname = 2;</code>
   * @return The hostname.
   */
  java.lang.String getHostname();
  /**
   * <code>string hostname = 2;</code>
   * @return The bytes for hostname.
   */
  com.google.protobuf.ByteString
      getHostnameBytes();

  /**
   * <code>string username = 3;</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <code>string username = 3;</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>string password = 4;</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 4;</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();
}
