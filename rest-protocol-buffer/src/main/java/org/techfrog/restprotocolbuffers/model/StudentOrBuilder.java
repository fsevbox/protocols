// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/api.proto

package org.techfrog.restprotocolbuffers.model;

public interface StudentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:restprotocolbuffers.Student)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string first_name = 2;</code>
   */
  java.lang.String getFirstName();
  /**
   * <code>string first_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string last_name = 3;</code>
   */
  java.lang.String getLastName();
  /**
   * <code>string last_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>string email = 4;</code>
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 4;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>repeated .restprotocolbuffers.Student.PhoneNumber phone = 5;</code>
   */
  java.util.List<org.techfrog.restprotocolbuffers.model.Student.PhoneNumber> 
      getPhoneList();
  /**
   * <code>repeated .restprotocolbuffers.Student.PhoneNumber phone = 5;</code>
   */
  org.techfrog.restprotocolbuffers.model.Student.PhoneNumber getPhone(int index);
  /**
   * <code>repeated .restprotocolbuffers.Student.PhoneNumber phone = 5;</code>
   */
  int getPhoneCount();
  /**
   * <code>repeated .restprotocolbuffers.Student.PhoneNumber phone = 5;</code>
   */
  java.util.List<? extends org.techfrog.restprotocolbuffers.model.Student.PhoneNumberOrBuilder> 
      getPhoneOrBuilderList();
  /**
   * <code>repeated .restprotocolbuffers.Student.PhoneNumber phone = 5;</code>
   */
  org.techfrog.restprotocolbuffers.model.Student.PhoneNumberOrBuilder getPhoneOrBuilder(
      int index);
}