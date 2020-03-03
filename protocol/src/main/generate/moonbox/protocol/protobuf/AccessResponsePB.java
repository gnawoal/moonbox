// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: master_base.proto

package moonbox.protocol.protobuf;

/**
 * Protobuf type {@code moonbox.AccessResponsePB}
 */
public  final class AccessResponsePB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:moonbox.AccessResponsePB)
    AccessResponsePBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AccessResponsePB.newBuilder() to construct.
  private AccessResponsePB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AccessResponsePB() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AccessResponsePB(
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
            moonbox.protocol.protobuf.HostPortPB.Builder subBuilder = null;
            if (hostPort_ != null) {
              subBuilder = hostPort_.toBuilder();
            }
            hostPort_ = input.readMessage(moonbox.protocol.protobuf.HostPortPB.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hostPort_);
              hostPort_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            moonbox.protocol.protobuf.SessionPB.Builder subBuilder = null;
            if (session_ != null) {
              subBuilder = session_.toBuilder();
            }
            session_ = input.readMessage(moonbox.protocol.protobuf.SessionPB.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(session_);
              session_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return moonbox.protocol.protobuf.MasterBase.internal_static_moonbox_AccessResponsePB_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return moonbox.protocol.protobuf.MasterBase.internal_static_moonbox_AccessResponsePB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            moonbox.protocol.protobuf.AccessResponsePB.class, moonbox.protocol.protobuf.AccessResponsePB.Builder.class);
  }

  public static final int HOST_PORT_FIELD_NUMBER = 1;
  private moonbox.protocol.protobuf.HostPortPB hostPort_;
  /**
   * <code>.moonbox.HostPortPB host_port = 1;</code>
   */
  public boolean hasHostPort() {
    return hostPort_ != null;
  }
  /**
   * <code>.moonbox.HostPortPB host_port = 1;</code>
   */
  public moonbox.protocol.protobuf.HostPortPB getHostPort() {
    return hostPort_ == null ? moonbox.protocol.protobuf.HostPortPB.getDefaultInstance() : hostPort_;
  }
  /**
   * <code>.moonbox.HostPortPB host_port = 1;</code>
   */
  public moonbox.protocol.protobuf.HostPortPBOrBuilder getHostPortOrBuilder() {
    return getHostPort();
  }

  public static final int SESSION_FIELD_NUMBER = 2;
  private moonbox.protocol.protobuf.SessionPB session_;
  /**
   * <code>.moonbox.SessionPB session = 2;</code>
   */
  public boolean hasSession() {
    return session_ != null;
  }
  /**
   * <code>.moonbox.SessionPB session = 2;</code>
   */
  public moonbox.protocol.protobuf.SessionPB getSession() {
    return session_ == null ? moonbox.protocol.protobuf.SessionPB.getDefaultInstance() : session_;
  }
  /**
   * <code>.moonbox.SessionPB session = 2;</code>
   */
  public moonbox.protocol.protobuf.SessionPBOrBuilder getSessionOrBuilder() {
    return getSession();
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
    if (hostPort_ != null) {
      output.writeMessage(1, getHostPort());
    }
    if (session_ != null) {
      output.writeMessage(2, getSession());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hostPort_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHostPort());
    }
    if (session_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSession());
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
    if (!(obj instanceof moonbox.protocol.protobuf.AccessResponsePB)) {
      return super.equals(obj);
    }
    moonbox.protocol.protobuf.AccessResponsePB other = (moonbox.protocol.protobuf.AccessResponsePB) obj;

    boolean result = true;
    result = result && (hasHostPort() == other.hasHostPort());
    if (hasHostPort()) {
      result = result && getHostPort()
          .equals(other.getHostPort());
    }
    result = result && (hasSession() == other.hasSession());
    if (hasSession()) {
      result = result && getSession()
          .equals(other.getSession());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHostPort()) {
      hash = (37 * hash) + HOST_PORT_FIELD_NUMBER;
      hash = (53 * hash) + getHostPort().hashCode();
    }
    if (hasSession()) {
      hash = (37 * hash) + SESSION_FIELD_NUMBER;
      hash = (53 * hash) + getSession().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static moonbox.protocol.protobuf.AccessResponsePB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static moonbox.protocol.protobuf.AccessResponsePB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static moonbox.protocol.protobuf.AccessResponsePB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static moonbox.protocol.protobuf.AccessResponsePB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static moonbox.protocol.protobuf.AccessResponsePB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static moonbox.protocol.protobuf.AccessResponsePB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static moonbox.protocol.protobuf.AccessResponsePB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static moonbox.protocol.protobuf.AccessResponsePB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static moonbox.protocol.protobuf.AccessResponsePB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static moonbox.protocol.protobuf.AccessResponsePB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static moonbox.protocol.protobuf.AccessResponsePB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static moonbox.protocol.protobuf.AccessResponsePB parseFrom(
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
  public static Builder newBuilder(moonbox.protocol.protobuf.AccessResponsePB prototype) {
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
   * Protobuf type {@code moonbox.AccessResponsePB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:moonbox.AccessResponsePB)
      moonbox.protocol.protobuf.AccessResponsePBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return moonbox.protocol.protobuf.MasterBase.internal_static_moonbox_AccessResponsePB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return moonbox.protocol.protobuf.MasterBase.internal_static_moonbox_AccessResponsePB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              moonbox.protocol.protobuf.AccessResponsePB.class, moonbox.protocol.protobuf.AccessResponsePB.Builder.class);
    }

    // Construct using moonbox.protocol.protobuf.AccessResponsePB.newBuilder()
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
      if (hostPortBuilder_ == null) {
        hostPort_ = null;
      } else {
        hostPort_ = null;
        hostPortBuilder_ = null;
      }
      if (sessionBuilder_ == null) {
        session_ = null;
      } else {
        session_ = null;
        sessionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return moonbox.protocol.protobuf.MasterBase.internal_static_moonbox_AccessResponsePB_descriptor;
    }

    @java.lang.Override
    public moonbox.protocol.protobuf.AccessResponsePB getDefaultInstanceForType() {
      return moonbox.protocol.protobuf.AccessResponsePB.getDefaultInstance();
    }

    @java.lang.Override
    public moonbox.protocol.protobuf.AccessResponsePB build() {
      moonbox.protocol.protobuf.AccessResponsePB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public moonbox.protocol.protobuf.AccessResponsePB buildPartial() {
      moonbox.protocol.protobuf.AccessResponsePB result = new moonbox.protocol.protobuf.AccessResponsePB(this);
      if (hostPortBuilder_ == null) {
        result.hostPort_ = hostPort_;
      } else {
        result.hostPort_ = hostPortBuilder_.build();
      }
      if (sessionBuilder_ == null) {
        result.session_ = session_;
      } else {
        result.session_ = sessionBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof moonbox.protocol.protobuf.AccessResponsePB) {
        return mergeFrom((moonbox.protocol.protobuf.AccessResponsePB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(moonbox.protocol.protobuf.AccessResponsePB other) {
      if (other == moonbox.protocol.protobuf.AccessResponsePB.getDefaultInstance()) return this;
      if (other.hasHostPort()) {
        mergeHostPort(other.getHostPort());
      }
      if (other.hasSession()) {
        mergeSession(other.getSession());
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
      moonbox.protocol.protobuf.AccessResponsePB parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (moonbox.protocol.protobuf.AccessResponsePB) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private moonbox.protocol.protobuf.HostPortPB hostPort_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        moonbox.protocol.protobuf.HostPortPB, moonbox.protocol.protobuf.HostPortPB.Builder, moonbox.protocol.protobuf.HostPortPBOrBuilder> hostPortBuilder_;
    /**
     * <code>.moonbox.HostPortPB host_port = 1;</code>
     */
    public boolean hasHostPort() {
      return hostPortBuilder_ != null || hostPort_ != null;
    }
    /**
     * <code>.moonbox.HostPortPB host_port = 1;</code>
     */
    public moonbox.protocol.protobuf.HostPortPB getHostPort() {
      if (hostPortBuilder_ == null) {
        return hostPort_ == null ? moonbox.protocol.protobuf.HostPortPB.getDefaultInstance() : hostPort_;
      } else {
        return hostPortBuilder_.getMessage();
      }
    }
    /**
     * <code>.moonbox.HostPortPB host_port = 1;</code>
     */
    public Builder setHostPort(moonbox.protocol.protobuf.HostPortPB value) {
      if (hostPortBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hostPort_ = value;
        onChanged();
      } else {
        hostPortBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.moonbox.HostPortPB host_port = 1;</code>
     */
    public Builder setHostPort(
        moonbox.protocol.protobuf.HostPortPB.Builder builderForValue) {
      if (hostPortBuilder_ == null) {
        hostPort_ = builderForValue.build();
        onChanged();
      } else {
        hostPortBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.moonbox.HostPortPB host_port = 1;</code>
     */
    public Builder mergeHostPort(moonbox.protocol.protobuf.HostPortPB value) {
      if (hostPortBuilder_ == null) {
        if (hostPort_ != null) {
          hostPort_ =
            moonbox.protocol.protobuf.HostPortPB.newBuilder(hostPort_).mergeFrom(value).buildPartial();
        } else {
          hostPort_ = value;
        }
        onChanged();
      } else {
        hostPortBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.moonbox.HostPortPB host_port = 1;</code>
     */
    public Builder clearHostPort() {
      if (hostPortBuilder_ == null) {
        hostPort_ = null;
        onChanged();
      } else {
        hostPort_ = null;
        hostPortBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.moonbox.HostPortPB host_port = 1;</code>
     */
    public moonbox.protocol.protobuf.HostPortPB.Builder getHostPortBuilder() {
      
      onChanged();
      return getHostPortFieldBuilder().getBuilder();
    }
    /**
     * <code>.moonbox.HostPortPB host_port = 1;</code>
     */
    public moonbox.protocol.protobuf.HostPortPBOrBuilder getHostPortOrBuilder() {
      if (hostPortBuilder_ != null) {
        return hostPortBuilder_.getMessageOrBuilder();
      } else {
        return hostPort_ == null ?
            moonbox.protocol.protobuf.HostPortPB.getDefaultInstance() : hostPort_;
      }
    }
    /**
     * <code>.moonbox.HostPortPB host_port = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        moonbox.protocol.protobuf.HostPortPB, moonbox.protocol.protobuf.HostPortPB.Builder, moonbox.protocol.protobuf.HostPortPBOrBuilder> 
        getHostPortFieldBuilder() {
      if (hostPortBuilder_ == null) {
        hostPortBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            moonbox.protocol.protobuf.HostPortPB, moonbox.protocol.protobuf.HostPortPB.Builder, moonbox.protocol.protobuf.HostPortPBOrBuilder>(
                getHostPort(),
                getParentForChildren(),
                isClean());
        hostPort_ = null;
      }
      return hostPortBuilder_;
    }

    private moonbox.protocol.protobuf.SessionPB session_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        moonbox.protocol.protobuf.SessionPB, moonbox.protocol.protobuf.SessionPB.Builder, moonbox.protocol.protobuf.SessionPBOrBuilder> sessionBuilder_;
    /**
     * <code>.moonbox.SessionPB session = 2;</code>
     */
    public boolean hasSession() {
      return sessionBuilder_ != null || session_ != null;
    }
    /**
     * <code>.moonbox.SessionPB session = 2;</code>
     */
    public moonbox.protocol.protobuf.SessionPB getSession() {
      if (sessionBuilder_ == null) {
        return session_ == null ? moonbox.protocol.protobuf.SessionPB.getDefaultInstance() : session_;
      } else {
        return sessionBuilder_.getMessage();
      }
    }
    /**
     * <code>.moonbox.SessionPB session = 2;</code>
     */
    public Builder setSession(moonbox.protocol.protobuf.SessionPB value) {
      if (sessionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        session_ = value;
        onChanged();
      } else {
        sessionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.moonbox.SessionPB session = 2;</code>
     */
    public Builder setSession(
        moonbox.protocol.protobuf.SessionPB.Builder builderForValue) {
      if (sessionBuilder_ == null) {
        session_ = builderForValue.build();
        onChanged();
      } else {
        sessionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.moonbox.SessionPB session = 2;</code>
     */
    public Builder mergeSession(moonbox.protocol.protobuf.SessionPB value) {
      if (sessionBuilder_ == null) {
        if (session_ != null) {
          session_ =
            moonbox.protocol.protobuf.SessionPB.newBuilder(session_).mergeFrom(value).buildPartial();
        } else {
          session_ = value;
        }
        onChanged();
      } else {
        sessionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.moonbox.SessionPB session = 2;</code>
     */
    public Builder clearSession() {
      if (sessionBuilder_ == null) {
        session_ = null;
        onChanged();
      } else {
        session_ = null;
        sessionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.moonbox.SessionPB session = 2;</code>
     */
    public moonbox.protocol.protobuf.SessionPB.Builder getSessionBuilder() {
      
      onChanged();
      return getSessionFieldBuilder().getBuilder();
    }
    /**
     * <code>.moonbox.SessionPB session = 2;</code>
     */
    public moonbox.protocol.protobuf.SessionPBOrBuilder getSessionOrBuilder() {
      if (sessionBuilder_ != null) {
        return sessionBuilder_.getMessageOrBuilder();
      } else {
        return session_ == null ?
            moonbox.protocol.protobuf.SessionPB.getDefaultInstance() : session_;
      }
    }
    /**
     * <code>.moonbox.SessionPB session = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        moonbox.protocol.protobuf.SessionPB, moonbox.protocol.protobuf.SessionPB.Builder, moonbox.protocol.protobuf.SessionPBOrBuilder> 
        getSessionFieldBuilder() {
      if (sessionBuilder_ == null) {
        sessionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            moonbox.protocol.protobuf.SessionPB, moonbox.protocol.protobuf.SessionPB.Builder, moonbox.protocol.protobuf.SessionPBOrBuilder>(
                getSession(),
                getParentForChildren(),
                isClean());
        session_ = null;
      }
      return sessionBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:moonbox.AccessResponsePB)
  }

  // @@protoc_insertion_point(class_scope:moonbox.AccessResponsePB)
  private static final moonbox.protocol.protobuf.AccessResponsePB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new moonbox.protocol.protobuf.AccessResponsePB();
  }

  public static moonbox.protocol.protobuf.AccessResponsePB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccessResponsePB>
      PARSER = new com.google.protobuf.AbstractParser<AccessResponsePB>() {
    @java.lang.Override
    public AccessResponsePB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AccessResponsePB(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AccessResponsePB> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccessResponsePB> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public moonbox.protocol.protobuf.AccessResponsePB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
