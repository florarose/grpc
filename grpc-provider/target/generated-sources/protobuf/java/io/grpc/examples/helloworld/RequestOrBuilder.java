// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package io.grpc.examples.helloworld;

public interface RequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:helloworld.Request)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * 类名
   * </pre>
   *
   * <code>string className = 2;</code>
   */
  java.lang.String getClassName();
  /**
   * <pre>
   * 类名
   * </pre>
   *
   * <code>string className = 2;</code>
   */
  com.google.protobuf.ByteString
      getClassNameBytes();

  /**
   * <pre>
   * 函数名称
   * </pre>
   *
   * <code>string methodName = 3;</code>
   */
  java.lang.String getMethodName();
  /**
   * <pre>
   * 函数名称
   * </pre>
   *
   * <code>string methodName = 3;</code>
   */
  com.google.protobuf.ByteString
      getMethodNameBytes();
}
