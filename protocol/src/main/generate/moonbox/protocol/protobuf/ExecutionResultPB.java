// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app_base.proto

package moonbox.protocol.protobuf;

/**
 * Protobuf type {@code moonbox.ExecutionResultPB}
 */
public  final class ExecutionResultPB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:moonbox.ExecutionResultPB)
    ExecutionResultPBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExecutionResultPB.newBuilder() to construct.
  private ExecutionResultPB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExecutionResultPB() {
    hasMore_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExecutionResultPB(
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
            moonbox.protocol.protobuf.ResultDataPB.Builder subBuilder = null;
            if (data_ != null) {
              subBuilder = data_.toBuilder();
            }
            data_ = input.readMessage(moonbox.protocol.protobuf.ResultDataPB.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(data_);
              data_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            hasMore_ = input.readBool();
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
    return moonbox.protocol.protobuf.AppBase.internal_static_moonbox_ExecutionResultPB_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return moonbox.protocol.protobuf.AppBase.internal_static_moonbox_ExecutionResultPB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            moonbox.protocol.protobuf.ExecutionResultPB.class, moonbox.protocol.protobuf.ExecutionResultPB.Builder.class);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  private moonbox.protocol.protobuf.ResultDataPB data_;
  /**
   * <code>.moonbox.ResultDataPB data = 1;</code>
   */
  public boolean hasData() {
    return data_ != null;
  }
  /**
   * <code>.moonbox.ResultDataPB data = 1;</code>
   */
  public moonbox.protocol.protobuf.ResultDataPB getData() {
    return data_ == null ? moonbox.protocol.protobuf.ResultDataPB.getDefaultInstance() : data_;
  }
  /**
   * <code>.moonbox.ResultDataPB data = 1;</code>
   */
  public moonbox.protocol.protobuf.ResultDataPBOrBuilder getDataOrBuilder() {
    return getData();
  }

  public static final int HAS_MORE_FIELD_NUMBER = 2;
  private boolean hasMore_;
  /**
   * <code>bool has_more = 2;</code>
   */
  public boolean getHasMore() {
    return hasMore_;
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
    if (data_ != null) {
      output.writeMessage(1, getData());
    }
    if (hasMore_ != false) {
      output.writeBool(2, hasMore_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (data_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getData());
    }
    if (hasMore_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, hasMore_);
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
    if (!(obj instanceof moonbox.protocol.protobuf.ExecutionResultPB)) {
      return super.equals(obj);
    }
    moonbox.protocol.protobuf.ExecutionResultPB other = (moonbox.protocol.protobuf.ExecutionResultPB) obj;

    boolean result = true;
    result = result && (hasData() == other.hasData());
    if (hasData()) {
      result = result && getData()
          .equals(other.getData());
    }
    result = result && (getHasMore()
        == other.getHasMore());
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
    if (hasData()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
    }
    hash = (37 * hash) + HAS_MORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasMore());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static moonbox.protocol.protobuf.ExecutionResultPB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static moonbox.protocol.protobuf.ExecutionResultPB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static moonbox.protocol.protobuf.ExecutionResultPB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static moonbox.protocol.protobuf.ExecutionResultPB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static moonbox.protocol.protobuf.ExecutionResultPB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static moonbox.protocol.protobuf.ExecutionResultPB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static moonbox.protocol.protobuf.ExecutionResultPB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static moonbox.protocol.protobuf.ExecutionResultPB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static moonbox.protocol.protobuf.ExecutionResultPB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static moonbox.protocol.protobuf.ExecutionResultPB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static moonbox.protocol.protobuf.ExecutionResultPB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static moonbox.protocol.protobuf.ExecutionResultPB parseFrom(
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
  public static Builder newBuilder(moonbox.protocol.protobuf.ExecutionResultPB prototype) {
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
   * Protobuf type {@code moonbox.ExecutionResultPB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:moonbox.ExecutionResultPB)
      moonbox.protocol.protobuf.ExecutionResultPBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return moonbox.protocol.protobuf.AppBase.internal_static_moonbox_ExecutionResultPB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return moonbox.protocol.protobuf.AppBase.internal_static_moonbox_ExecutionResultPB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              moonbox.protocol.protobuf.ExecutionResultPB.class, moonbox.protocol.protobuf.ExecutionResultPB.Builder.class);
    }

    // Construct using moonbox.protocol.protobuf.ExecutionResultPB.newBuilder()
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
      if (dataBuilder_ == null) {
        data_ = null;
      } else {
        data_ = null;
        dataBuilder_ = null;
      }
      hasMore_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return moonbox.protocol.protobuf.AppBase.internal_static_moonbox_ExecutionResultPB_descriptor;
    }

    @java.lang.Override
    public moonbox.protocol.protobuf.ExecutionResultPB getDefaultInstanceForType() {
      return moonbox.protocol.protobuf.ExecutionResultPB.getDefaultInstance();
    }

    @java.lang.Override
    public moonbox.protocol.protobuf.ExecutionResultPB build() {
      moonbox.protocol.protobuf.ExecutionResultPB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public moonbox.protocol.protobuf.ExecutionResultPB buildPartial() {
      moonbox.protocol.protobuf.ExecutionResultPB result = new moonbox.protocol.protobuf.ExecutionResultPB(this);
      if (dataBuilder_ == null) {
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
      }
      result.hasMore_ = hasMore_;
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
      if (other instanceof moonbox.protocol.protobuf.ExecutionResultPB) {
        return mergeFrom((moonbox.protocol.protobuf.ExecutionResultPB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(moonbox.protocol.protobuf.ExecutionResultPB other) {
      if (other == moonbox.protocol.protobuf.ExecutionResultPB.getDefaultInstance()) return this;
      if (other.hasData()) {
        mergeData(other.getData());
      }
      if (other.getHasMore() != false) {
        setHasMore(other.getHasMore());
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
      moonbox.protocol.protobuf.ExecutionResultPB parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (moonbox.protocol.protobuf.ExecutionResultPB) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private moonbox.protocol.protobuf.ResultDataPB data_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        moonbox.protocol.protobuf.ResultDataPB, moonbox.protocol.protobuf.ResultDataPB.Builder, moonbox.protocol.protobuf.ResultDataPBOrBuilder> dataBuilder_;
    /**
     * <code>.moonbox.ResultDataPB data = 1;</code>
     */
    public boolean hasData() {
      return dataBuilder_ != null || data_ != null;
    }
    /**
     * <code>.moonbox.ResultDataPB data = 1;</code>
     */
    public moonbox.protocol.protobuf.ResultDataPB getData() {
      if (dataBuilder_ == null) {
        return data_ == null ? moonbox.protocol.protobuf.ResultDataPB.getDefaultInstance() : data_;
      } else {
        return dataBuilder_.getMessage();
      }
    }
    /**
     * <code>.moonbox.ResultDataPB data = 1;</code>
     */
    public Builder setData(moonbox.protocol.protobuf.ResultDataPB value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
        onChanged();
      } else {
        dataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.moonbox.ResultDataPB data = 1;</code>
     */
    public Builder setData(
        moonbox.protocol.protobuf.ResultDataPB.Builder builderForValue) {
      if (dataBuilder_ == null) {
        data_ = builderForValue.build();
        onChanged();
      } else {
        dataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.moonbox.ResultDataPB data = 1;</code>
     */
    public Builder mergeData(moonbox.protocol.protobuf.ResultDataPB value) {
      if (dataBuilder_ == null) {
        if (data_ != null) {
          data_ =
            moonbox.protocol.protobuf.ResultDataPB.newBuilder(data_).mergeFrom(value).buildPartial();
        } else {
          data_ = value;
        }
        onChanged();
      } else {
        dataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.moonbox.ResultDataPB data = 1;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = null;
        onChanged();
      } else {
        data_ = null;
        dataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.moonbox.ResultDataPB data = 1;</code>
     */
    public moonbox.protocol.protobuf.ResultDataPB.Builder getDataBuilder() {
      
      onChanged();
      return getDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.moonbox.ResultDataPB data = 1;</code>
     */
    public moonbox.protocol.protobuf.ResultDataPBOrBuilder getDataOrBuilder() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilder();
      } else {
        return data_ == null ?
            moonbox.protocol.protobuf.ResultDataPB.getDefaultInstance() : data_;
      }
    }
    /**
     * <code>.moonbox.ResultDataPB data = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        moonbox.protocol.protobuf.ResultDataPB, moonbox.protocol.protobuf.ResultDataPB.Builder, moonbox.protocol.protobuf.ResultDataPBOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            moonbox.protocol.protobuf.ResultDataPB, moonbox.protocol.protobuf.ResultDataPB.Builder, moonbox.protocol.protobuf.ResultDataPBOrBuilder>(
                getData(),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
    }

    private boolean hasMore_ ;
    /**
     * <code>bool has_more = 2;</code>
     */
    public boolean getHasMore() {
      return hasMore_;
    }
    /**
     * <code>bool has_more = 2;</code>
     */
    public Builder setHasMore(boolean value) {
      
      hasMore_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool has_more = 2;</code>
     */
    public Builder clearHasMore() {
      
      hasMore_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:moonbox.ExecutionResultPB)
  }

  // @@protoc_insertion_point(class_scope:moonbox.ExecutionResultPB)
  private static final moonbox.protocol.protobuf.ExecutionResultPB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new moonbox.protocol.protobuf.ExecutionResultPB();
  }

  public static moonbox.protocol.protobuf.ExecutionResultPB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExecutionResultPB>
      PARSER = new com.google.protobuf.AbstractParser<ExecutionResultPB>() {
    @java.lang.Override
    public ExecutionResultPB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExecutionResultPB(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExecutionResultPB> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExecutionResultPB> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public moonbox.protocol.protobuf.ExecutionResultPB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
