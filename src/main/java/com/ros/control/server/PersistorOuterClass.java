// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/ros/control/proto/persistor.proto

// Protobuf Java Version: 3.25.2
package com.ros.control.server;

public final class PersistorOuterClass {
  private PersistorOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ros_control_server_PersistRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ros_control_server_PersistRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ros_control_server_PersistReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ros_control_server_PersistReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3src/main/java/com/ros/control/proto/pe" +
      "rsistor.proto\022\026com.ros.control.server\"T\n" +
      "\016PersistRequest\022\014\n\004port\030\001 \001(\005\022\020\n\010hostnam" +
      "e\030\002 \001(\t\022\020\n\010username\030\003 \001(\t\022\020\n\010password\030\004 " +
      "\001(\t\"\037\n\014PersistReply\022\017\n\007message\030\001 \001(\t2g\n\t" +
      "Persistor\022Z\n\nsaveConfig\022&.com.ros.contro" +
      "l.server.PersistRequest\032$.com.ros.contro" +
      "l.server.PersistReplyB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_ros_control_server_PersistRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_ros_control_server_PersistRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ros_control_server_PersistRequest_descriptor,
        new java.lang.String[] { "Port", "Hostname", "Username", "Password", });
    internal_static_com_ros_control_server_PersistReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_ros_control_server_PersistReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ros_control_server_PersistReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
