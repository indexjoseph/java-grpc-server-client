// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.example;

/**
 * Protobuf type {@code SimpleResponse}
 */
public final class SimpleResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SimpleResponse)
    SimpleResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SimpleResponse.newBuilder() to construct.
  private SimpleResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SimpleResponse() {
    responseMsg_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SimpleResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SimpleResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            java.lang.String s = input.readStringRequireUtf8();

            responseMsg_ = s;
            break;
          }
          case 16: {

            isAdmin_ = input.readBool();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.example.Service.internal_static_SimpleResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.Service.internal_static_SimpleResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.SimpleResponse.class, org.example.SimpleResponse.Builder.class);
  }

  public static final int RESPONSE_MSG_FIELD_NUMBER = 1;
  private volatile java.lang.Object responseMsg_;
  /**
   * <code>string response_msg = 1;</code>
   * @return The responseMsg.
   */
  @java.lang.Override
  public java.lang.String getResponseMsg() {
    java.lang.Object ref = responseMsg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      responseMsg_ = s;
      return s;
    }
  }
  /**
   * <code>string response_msg = 1;</code>
   * @return The bytes for responseMsg.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResponseMsgBytes() {
    java.lang.Object ref = responseMsg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      responseMsg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_ADMIN_FIELD_NUMBER = 2;
  private boolean isAdmin_;
  /**
   * <code>bool is_admin = 2;</code>
   * @return The isAdmin.
   */
  @java.lang.Override
  public boolean getIsAdmin() {
    return isAdmin_;
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
    if (!getResponseMsgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, responseMsg_);
    }
    if (isAdmin_ != false) {
      output.writeBool(2, isAdmin_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResponseMsgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, responseMsg_);
    }
    if (isAdmin_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isAdmin_);
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
    if (!(obj instanceof org.example.SimpleResponse)) {
      return super.equals(obj);
    }
    org.example.SimpleResponse other = (org.example.SimpleResponse) obj;

    if (!getResponseMsg()
        .equals(other.getResponseMsg())) return false;
    if (getIsAdmin()
        != other.getIsAdmin()) return false;
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
    hash = (37 * hash) + RESPONSE_MSG_FIELD_NUMBER;
    hash = (53 * hash) + getResponseMsg().hashCode();
    hash = (37 * hash) + IS_ADMIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsAdmin());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.SimpleResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.SimpleResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.SimpleResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.SimpleResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.SimpleResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.SimpleResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.SimpleResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.SimpleResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.SimpleResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.example.SimpleResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.SimpleResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.SimpleResponse parseFrom(
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
  public static Builder newBuilder(org.example.SimpleResponse prototype) {
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
   * Protobuf type {@code SimpleResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SimpleResponse)
      org.example.SimpleResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.Service.internal_static_SimpleResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.Service.internal_static_SimpleResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.SimpleResponse.class, org.example.SimpleResponse.Builder.class);
    }

    // Construct using org.example.SimpleResponse.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      responseMsg_ = "";

      isAdmin_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.Service.internal_static_SimpleResponse_descriptor;
    }

    @java.lang.Override
    public org.example.SimpleResponse getDefaultInstanceForType() {
      return org.example.SimpleResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.SimpleResponse build() {
      org.example.SimpleResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.SimpleResponse buildPartial() {
      org.example.SimpleResponse result = new org.example.SimpleResponse(this);
      result.responseMsg_ = responseMsg_;
      result.isAdmin_ = isAdmin_;
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
      if (other instanceof org.example.SimpleResponse) {
        return mergeFrom((org.example.SimpleResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.SimpleResponse other) {
      if (other == org.example.SimpleResponse.getDefaultInstance()) return this;
      if (!other.getResponseMsg().isEmpty()) {
        responseMsg_ = other.responseMsg_;
        onChanged();
      }
      if (other.getIsAdmin() != false) {
        setIsAdmin(other.getIsAdmin());
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
      org.example.SimpleResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.example.SimpleResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object responseMsg_ = "";
    /**
     * <code>string response_msg = 1;</code>
     * @return The responseMsg.
     */
    public java.lang.String getResponseMsg() {
      java.lang.Object ref = responseMsg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        responseMsg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string response_msg = 1;</code>
     * @return The bytes for responseMsg.
     */
    public com.google.protobuf.ByteString
        getResponseMsgBytes() {
      java.lang.Object ref = responseMsg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        responseMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string response_msg = 1;</code>
     * @param value The responseMsg to set.
     * @return This builder for chaining.
     */
    public Builder setResponseMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      responseMsg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string response_msg = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResponseMsg() {
      
      responseMsg_ = getDefaultInstance().getResponseMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string response_msg = 1;</code>
     * @param value The bytes for responseMsg to set.
     * @return This builder for chaining.
     */
    public Builder setResponseMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      responseMsg_ = value;
      onChanged();
      return this;
    }

    private boolean isAdmin_ ;
    /**
     * <code>bool is_admin = 2;</code>
     * @return The isAdmin.
     */
    @java.lang.Override
    public boolean getIsAdmin() {
      return isAdmin_;
    }
    /**
     * <code>bool is_admin = 2;</code>
     * @param value The isAdmin to set.
     * @return This builder for chaining.
     */
    public Builder setIsAdmin(boolean value) {
      
      isAdmin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_admin = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsAdmin() {
      
      isAdmin_ = false;
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


    // @@protoc_insertion_point(builder_scope:SimpleResponse)
  }

  // @@protoc_insertion_point(class_scope:SimpleResponse)
  private static final org.example.SimpleResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.SimpleResponse();
  }

  public static org.example.SimpleResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SimpleResponse>
      PARSER = new com.google.protobuf.AbstractParser<SimpleResponse>() {
    @java.lang.Override
    public SimpleResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SimpleResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SimpleResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SimpleResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.SimpleResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

