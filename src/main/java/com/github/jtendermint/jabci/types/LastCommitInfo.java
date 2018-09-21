// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.types;

/**
 * Protobuf type {@code com.github.jtendermint.jabci.types.LastCommitInfo}
 */
public  final class LastCommitInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.jtendermint.jabci.types.LastCommitInfo)
    LastCommitInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LastCommitInfo.newBuilder() to construct.
  private LastCommitInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LastCommitInfo() {
    round_ = 0;
    votes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LastCommitInfo(
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
          case 8: {

            round_ = input.readInt32();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              votes_ = new java.util.ArrayList<com.github.jtendermint.jabci.types.VoteInfo>();
              mutable_bitField0_ |= 0x00000002;
            }
            votes_.add(
                input.readMessage(com.github.jtendermint.jabci.types.VoteInfo.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        votes_ = java.util.Collections.unmodifiableList(votes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_LastCommitInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_LastCommitInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.jtendermint.jabci.types.LastCommitInfo.class, com.github.jtendermint.jabci.types.LastCommitInfo.Builder.class);
  }

  private int bitField0_;
  public static final int ROUND_FIELD_NUMBER = 1;
  private int round_;
  /**
   * <code>int32 round = 1;</code>
   */
  public int getRound() {
    return round_;
  }

  public static final int VOTES_FIELD_NUMBER = 2;
  private java.util.List<com.github.jtendermint.jabci.types.VoteInfo> votes_;
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
   */
  public java.util.List<com.github.jtendermint.jabci.types.VoteInfo> getVotesList() {
    return votes_;
  }
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
   */
  public java.util.List<? extends com.github.jtendermint.jabci.types.VoteInfoOrBuilder> 
      getVotesOrBuilderList() {
    return votes_;
  }
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
   */
  public int getVotesCount() {
    return votes_.size();
  }
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
   */
  public com.github.jtendermint.jabci.types.VoteInfo getVotes(int index) {
    return votes_.get(index);
  }
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
   */
  public com.github.jtendermint.jabci.types.VoteInfoOrBuilder getVotesOrBuilder(
      int index) {
    return votes_.get(index);
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
    if (round_ != 0) {
      output.writeInt32(1, round_);
    }
    for (int i = 0; i < votes_.size(); i++) {
      output.writeMessage(2, votes_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (round_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, round_);
    }
    for (int i = 0; i < votes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, votes_.get(i));
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
    if (!(obj instanceof com.github.jtendermint.jabci.types.LastCommitInfo)) {
      return super.equals(obj);
    }
    com.github.jtendermint.jabci.types.LastCommitInfo other = (com.github.jtendermint.jabci.types.LastCommitInfo) obj;

    boolean result = true;
    result = result && (getRound()
        == other.getRound());
    result = result && getVotesList()
        .equals(other.getVotesList());
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
    hash = (37 * hash) + ROUND_FIELD_NUMBER;
    hash = (53 * hash) + getRound();
    if (getVotesCount() > 0) {
      hash = (37 * hash) + VOTES_FIELD_NUMBER;
      hash = (53 * hash) + getVotesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.jtendermint.jabci.types.LastCommitInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.LastCommitInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.LastCommitInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.LastCommitInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.LastCommitInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.LastCommitInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.LastCommitInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.LastCommitInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.LastCommitInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.LastCommitInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.LastCommitInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.LastCommitInfo parseFrom(
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
  public static Builder newBuilder(com.github.jtendermint.jabci.types.LastCommitInfo prototype) {
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
   * Protobuf type {@code com.github.jtendermint.jabci.types.LastCommitInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.jtendermint.jabci.types.LastCommitInfo)
      com.github.jtendermint.jabci.types.LastCommitInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_LastCommitInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_LastCommitInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.jtendermint.jabci.types.LastCommitInfo.class, com.github.jtendermint.jabci.types.LastCommitInfo.Builder.class);
    }

    // Construct using com.github.jtendermint.jabci.types.LastCommitInfo.newBuilder()
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
        getVotesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      round_ = 0;

      if (votesBuilder_ == null) {
        votes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        votesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_LastCommitInfo_descriptor;
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.LastCommitInfo getDefaultInstanceForType() {
      return com.github.jtendermint.jabci.types.LastCommitInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.LastCommitInfo build() {
      com.github.jtendermint.jabci.types.LastCommitInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.LastCommitInfo buildPartial() {
      com.github.jtendermint.jabci.types.LastCommitInfo result = new com.github.jtendermint.jabci.types.LastCommitInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.round_ = round_;
      if (votesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          votes_ = java.util.Collections.unmodifiableList(votes_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.votes_ = votes_;
      } else {
        result.votes_ = votesBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.github.jtendermint.jabci.types.LastCommitInfo) {
        return mergeFrom((com.github.jtendermint.jabci.types.LastCommitInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.jtendermint.jabci.types.LastCommitInfo other) {
      if (other == com.github.jtendermint.jabci.types.LastCommitInfo.getDefaultInstance()) return this;
      if (other.getRound() != 0) {
        setRound(other.getRound());
      }
      if (votesBuilder_ == null) {
        if (!other.votes_.isEmpty()) {
          if (votes_.isEmpty()) {
            votes_ = other.votes_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureVotesIsMutable();
            votes_.addAll(other.votes_);
          }
          onChanged();
        }
      } else {
        if (!other.votes_.isEmpty()) {
          if (votesBuilder_.isEmpty()) {
            votesBuilder_.dispose();
            votesBuilder_ = null;
            votes_ = other.votes_;
            bitField0_ = (bitField0_ & ~0x00000002);
            votesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVotesFieldBuilder() : null;
          } else {
            votesBuilder_.addAllMessages(other.votes_);
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
      com.github.jtendermint.jabci.types.LastCommitInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.jtendermint.jabci.types.LastCommitInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int round_ ;
    /**
     * <code>int32 round = 1;</code>
     */
    public int getRound() {
      return round_;
    }
    /**
     * <code>int32 round = 1;</code>
     */
    public Builder setRound(int value) {
      
      round_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 round = 1;</code>
     */
    public Builder clearRound() {
      
      round_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.github.jtendermint.jabci.types.VoteInfo> votes_ =
      java.util.Collections.emptyList();
    private void ensureVotesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        votes_ = new java.util.ArrayList<com.github.jtendermint.jabci.types.VoteInfo>(votes_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.jtendermint.jabci.types.VoteInfo, com.github.jtendermint.jabci.types.VoteInfo.Builder, com.github.jtendermint.jabci.types.VoteInfoOrBuilder> votesBuilder_;

    /**
     * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
     */
    public java.util.List<com.github.jtendermint.jabci.types.VoteInfo> getVotesList() {
      if (votesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(votes_);
      } else {
        return votesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
     */
    public int getVotesCount() {
      if (votesBuilder_ == null) {
        return votes_.size();
      } else {
        return votesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
     */
    public com.github.jtendermint.jabci.types.VoteInfo getVotes(int index) {
      if (votesBuilder_ == null) {
        return votes_.get(index);
      } else {
        return votesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
     */
    public Builder setVotes(
        int index, com.github.jtendermint.jabci.types.VoteInfo value) {
      if (votesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVotesIsMutable();
        votes_.set(index, value);
        onChanged();
      } else {
        votesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
     */
    public Builder setVotes(
        int index, com.github.jtendermint.jabci.types.VoteInfo.Builder builderForValue) {
      if (votesBuilder_ == null) {
        ensureVotesIsMutable();
        votes_.set(index, builderForValue.build());
        onChanged();
      } else {
        votesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
     */
    public Builder addVotes(com.github.jtendermint.jabci.types.VoteInfo value) {
      if (votesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVotesIsMutable();
        votes_.add(value);
        onChanged();
      } else {
        votesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
     */
    public Builder addVotes(
        int index, com.github.jtendermint.jabci.types.VoteInfo value) {
      if (votesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVotesIsMutable();
        votes_.add(index, value);
        onChanged();
      } else {
        votesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
     */
    public Builder addVotes(
        com.github.jtendermint.jabci.types.VoteInfo.Builder builderForValue) {
      if (votesBuilder_ == null) {
        ensureVotesIsMutable();
        votes_.add(builderForValue.build());
        onChanged();
      } else {
        votesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
     */
    public Builder addVotes(
        int index, com.github.jtendermint.jabci.types.VoteInfo.Builder builderForValue) {
      if (votesBuilder_ == null) {
        ensureVotesIsMutable();
        votes_.add(index, builderForValue.build());
        onChanged();
      } else {
        votesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
     */
    public Builder addAllVotes(
        java.lang.Iterable<? extends com.github.jtendermint.jabci.types.VoteInfo> values) {
      if (votesBuilder_ == null) {
        ensureVotesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, votes_);
        onChanged();
      } else {
        votesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
     */
    public Builder clearVotes() {
      if (votesBuilder_ == null) {
        votes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        votesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
     */
    public Builder removeVotes(int index) {
      if (votesBuilder_ == null) {
        ensureVotesIsMutable();
        votes_.remove(index);
        onChanged();
      } else {
        votesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
     */
    public com.github.jtendermint.jabci.types.VoteInfo.Builder getVotesBuilder(
        int index) {
      return getVotesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
     */
    public com.github.jtendermint.jabci.types.VoteInfoOrBuilder getVotesOrBuilder(
        int index) {
      if (votesBuilder_ == null) {
        return votes_.get(index);  } else {
        return votesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
     */
    public java.util.List<? extends com.github.jtendermint.jabci.types.VoteInfoOrBuilder> 
         getVotesOrBuilderList() {
      if (votesBuilder_ != null) {
        return votesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(votes_);
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
     */
    public com.github.jtendermint.jabci.types.VoteInfo.Builder addVotesBuilder() {
      return getVotesFieldBuilder().addBuilder(
          com.github.jtendermint.jabci.types.VoteInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
     */
    public com.github.jtendermint.jabci.types.VoteInfo.Builder addVotesBuilder(
        int index) {
      return getVotesFieldBuilder().addBuilder(
          index, com.github.jtendermint.jabci.types.VoteInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.VoteInfo votes = 2;</code>
     */
    public java.util.List<com.github.jtendermint.jabci.types.VoteInfo.Builder> 
         getVotesBuilderList() {
      return getVotesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.jtendermint.jabci.types.VoteInfo, com.github.jtendermint.jabci.types.VoteInfo.Builder, com.github.jtendermint.jabci.types.VoteInfoOrBuilder> 
        getVotesFieldBuilder() {
      if (votesBuilder_ == null) {
        votesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.github.jtendermint.jabci.types.VoteInfo, com.github.jtendermint.jabci.types.VoteInfo.Builder, com.github.jtendermint.jabci.types.VoteInfoOrBuilder>(
                votes_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        votes_ = null;
      }
      return votesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.github.jtendermint.jabci.types.LastCommitInfo)
  }

  // @@protoc_insertion_point(class_scope:com.github.jtendermint.jabci.types.LastCommitInfo)
  private static final com.github.jtendermint.jabci.types.LastCommitInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.jtendermint.jabci.types.LastCommitInfo();
  }

  public static com.github.jtendermint.jabci.types.LastCommitInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LastCommitInfo>
      PARSER = new com.google.protobuf.AbstractParser<LastCommitInfo>() {
    @java.lang.Override
    public LastCommitInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LastCommitInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LastCommitInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LastCommitInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.jtendermint.jabci.types.LastCommitInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

