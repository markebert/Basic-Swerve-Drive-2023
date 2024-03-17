// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frc/team3171/protos/slew_drive.proto

// Protobuf Java Version: 3.25.3
package frc.team3171.protos;

public final class SlewDrive {
  private SlewDrive() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SlewCalibrationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:frc.team3171.protos.SlewCalibration)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>double leftFrontSlewOffset = 1;</code>
     * @return The leftFrontSlewOffset.
     */
    double getLeftFrontSlewOffset();

    /**
     * <code>double leftRearSlewOffset = 2;</code>
     * @return The leftRearSlewOffset.
     */
    double getLeftRearSlewOffset();

    /**
     * <code>double rightFrontSlewOffset = 3;</code>
     * @return The rightFrontSlewOffset.
     */
    double getRightFrontSlewOffset();

    /**
     * <code>double rightRearSlewOffset = 4;</code>
     * @return The rightRearSlewOffset.
     */
    double getRightRearSlewOffset();
  }
  /**
   * Protobuf type {@code frc.team3171.protos.SlewCalibration}
   */
  public static final class SlewCalibration extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:frc.team3171.protos.SlewCalibration)
      SlewCalibrationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SlewCalibration.newBuilder() to construct.
    private SlewCalibration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SlewCalibration() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SlewCalibration();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return frc.team3171.protos.SlewDrive.internal_static_frc_team3171_protos_SlewCalibration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return frc.team3171.protos.SlewDrive.internal_static_frc_team3171_protos_SlewCalibration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              frc.team3171.protos.SlewDrive.SlewCalibration.class, frc.team3171.protos.SlewDrive.SlewCalibration.Builder.class);
    }

    public static final int LEFTFRONTSLEWOFFSET_FIELD_NUMBER = 1;
    private double leftFrontSlewOffset_ = 0D;
    /**
     * <code>double leftFrontSlewOffset = 1;</code>
     * @return The leftFrontSlewOffset.
     */
    @java.lang.Override
    public double getLeftFrontSlewOffset() {
      return leftFrontSlewOffset_;
    }

    public static final int LEFTREARSLEWOFFSET_FIELD_NUMBER = 2;
    private double leftRearSlewOffset_ = 0D;
    /**
     * <code>double leftRearSlewOffset = 2;</code>
     * @return The leftRearSlewOffset.
     */
    @java.lang.Override
    public double getLeftRearSlewOffset() {
      return leftRearSlewOffset_;
    }

    public static final int RIGHTFRONTSLEWOFFSET_FIELD_NUMBER = 3;
    private double rightFrontSlewOffset_ = 0D;
    /**
     * <code>double rightFrontSlewOffset = 3;</code>
     * @return The rightFrontSlewOffset.
     */
    @java.lang.Override
    public double getRightFrontSlewOffset() {
      return rightFrontSlewOffset_;
    }

    public static final int RIGHTREARSLEWOFFSET_FIELD_NUMBER = 4;
    private double rightRearSlewOffset_ = 0D;
    /**
     * <code>double rightRearSlewOffset = 4;</code>
     * @return The rightRearSlewOffset.
     */
    @java.lang.Override
    public double getRightRearSlewOffset() {
      return rightRearSlewOffset_;
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
      if (java.lang.Double.doubleToRawLongBits(leftFrontSlewOffset_) != 0) {
        output.writeDouble(1, leftFrontSlewOffset_);
      }
      if (java.lang.Double.doubleToRawLongBits(leftRearSlewOffset_) != 0) {
        output.writeDouble(2, leftRearSlewOffset_);
      }
      if (java.lang.Double.doubleToRawLongBits(rightFrontSlewOffset_) != 0) {
        output.writeDouble(3, rightFrontSlewOffset_);
      }
      if (java.lang.Double.doubleToRawLongBits(rightRearSlewOffset_) != 0) {
        output.writeDouble(4, rightRearSlewOffset_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Double.doubleToRawLongBits(leftFrontSlewOffset_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, leftFrontSlewOffset_);
      }
      if (java.lang.Double.doubleToRawLongBits(leftRearSlewOffset_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, leftRearSlewOffset_);
      }
      if (java.lang.Double.doubleToRawLongBits(rightFrontSlewOffset_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, rightFrontSlewOffset_);
      }
      if (java.lang.Double.doubleToRawLongBits(rightRearSlewOffset_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, rightRearSlewOffset_);
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
      if (!(obj instanceof frc.team3171.protos.SlewDrive.SlewCalibration)) {
        return super.equals(obj);
      }
      frc.team3171.protos.SlewDrive.SlewCalibration other = (frc.team3171.protos.SlewDrive.SlewCalibration) obj;

      if (java.lang.Double.doubleToLongBits(getLeftFrontSlewOffset())
          != java.lang.Double.doubleToLongBits(
              other.getLeftFrontSlewOffset())) return false;
      if (java.lang.Double.doubleToLongBits(getLeftRearSlewOffset())
          != java.lang.Double.doubleToLongBits(
              other.getLeftRearSlewOffset())) return false;
      if (java.lang.Double.doubleToLongBits(getRightFrontSlewOffset())
          != java.lang.Double.doubleToLongBits(
              other.getRightFrontSlewOffset())) return false;
      if (java.lang.Double.doubleToLongBits(getRightRearSlewOffset())
          != java.lang.Double.doubleToLongBits(
              other.getRightRearSlewOffset())) return false;
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
      hash = (37 * hash) + LEFTFRONTSLEWOFFSET_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getLeftFrontSlewOffset()));
      hash = (37 * hash) + LEFTREARSLEWOFFSET_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getLeftRearSlewOffset()));
      hash = (37 * hash) + RIGHTFRONTSLEWOFFSET_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getRightFrontSlewOffset()));
      hash = (37 * hash) + RIGHTREARSLEWOFFSET_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getRightRearSlewOffset()));
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static frc.team3171.protos.SlewDrive.SlewCalibration parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static frc.team3171.protos.SlewDrive.SlewCalibration parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static frc.team3171.protos.SlewDrive.SlewCalibration parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static frc.team3171.protos.SlewDrive.SlewCalibration parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static frc.team3171.protos.SlewDrive.SlewCalibration parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static frc.team3171.protos.SlewDrive.SlewCalibration parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static frc.team3171.protos.SlewDrive.SlewCalibration parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static frc.team3171.protos.SlewDrive.SlewCalibration parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static frc.team3171.protos.SlewDrive.SlewCalibration parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static frc.team3171.protos.SlewDrive.SlewCalibration parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static frc.team3171.protos.SlewDrive.SlewCalibration parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static frc.team3171.protos.SlewDrive.SlewCalibration parseFrom(
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
    public static Builder newBuilder(frc.team3171.protos.SlewDrive.SlewCalibration prototype) {
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
     * Protobuf type {@code frc.team3171.protos.SlewCalibration}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:frc.team3171.protos.SlewCalibration)
        frc.team3171.protos.SlewDrive.SlewCalibrationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return frc.team3171.protos.SlewDrive.internal_static_frc_team3171_protos_SlewCalibration_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return frc.team3171.protos.SlewDrive.internal_static_frc_team3171_protos_SlewCalibration_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                frc.team3171.protos.SlewDrive.SlewCalibration.class, frc.team3171.protos.SlewDrive.SlewCalibration.Builder.class);
      }

      // Construct using frc.team3171.protos.SlewDrive.SlewCalibration.newBuilder()
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
        leftFrontSlewOffset_ = 0D;
        leftRearSlewOffset_ = 0D;
        rightFrontSlewOffset_ = 0D;
        rightRearSlewOffset_ = 0D;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return frc.team3171.protos.SlewDrive.internal_static_frc_team3171_protos_SlewCalibration_descriptor;
      }

      @java.lang.Override
      public frc.team3171.protos.SlewDrive.SlewCalibration getDefaultInstanceForType() {
        return frc.team3171.protos.SlewDrive.SlewCalibration.getDefaultInstance();
      }

      @java.lang.Override
      public frc.team3171.protos.SlewDrive.SlewCalibration build() {
        frc.team3171.protos.SlewDrive.SlewCalibration result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public frc.team3171.protos.SlewDrive.SlewCalibration buildPartial() {
        frc.team3171.protos.SlewDrive.SlewCalibration result = new frc.team3171.protos.SlewDrive.SlewCalibration(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(frc.team3171.protos.SlewDrive.SlewCalibration result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.leftFrontSlewOffset_ = leftFrontSlewOffset_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.leftRearSlewOffset_ = leftRearSlewOffset_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.rightFrontSlewOffset_ = rightFrontSlewOffset_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.rightRearSlewOffset_ = rightRearSlewOffset_;
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
        if (other instanceof frc.team3171.protos.SlewDrive.SlewCalibration) {
          return mergeFrom((frc.team3171.protos.SlewDrive.SlewCalibration)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(frc.team3171.protos.SlewDrive.SlewCalibration other) {
        if (other == frc.team3171.protos.SlewDrive.SlewCalibration.getDefaultInstance()) return this;
        if (other.getLeftFrontSlewOffset() != 0D) {
          setLeftFrontSlewOffset(other.getLeftFrontSlewOffset());
        }
        if (other.getLeftRearSlewOffset() != 0D) {
          setLeftRearSlewOffset(other.getLeftRearSlewOffset());
        }
        if (other.getRightFrontSlewOffset() != 0D) {
          setRightFrontSlewOffset(other.getRightFrontSlewOffset());
        }
        if (other.getRightRearSlewOffset() != 0D) {
          setRightRearSlewOffset(other.getRightRearSlewOffset());
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
              case 9: {
                leftFrontSlewOffset_ = input.readDouble();
                bitField0_ |= 0x00000001;
                break;
              } // case 9
              case 17: {
                leftRearSlewOffset_ = input.readDouble();
                bitField0_ |= 0x00000002;
                break;
              } // case 17
              case 25: {
                rightFrontSlewOffset_ = input.readDouble();
                bitField0_ |= 0x00000004;
                break;
              } // case 25
              case 33: {
                rightRearSlewOffset_ = input.readDouble();
                bitField0_ |= 0x00000008;
                break;
              } // case 33
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

      private double leftFrontSlewOffset_ ;
      /**
       * <code>double leftFrontSlewOffset = 1;</code>
       * @return The leftFrontSlewOffset.
       */
      @java.lang.Override
      public double getLeftFrontSlewOffset() {
        return leftFrontSlewOffset_;
      }
      /**
       * <code>double leftFrontSlewOffset = 1;</code>
       * @param value The leftFrontSlewOffset to set.
       * @return This builder for chaining.
       */
      public Builder setLeftFrontSlewOffset(double value) {

        leftFrontSlewOffset_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>double leftFrontSlewOffset = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLeftFrontSlewOffset() {
        bitField0_ = (bitField0_ & ~0x00000001);
        leftFrontSlewOffset_ = 0D;
        onChanged();
        return this;
      }

      private double leftRearSlewOffset_ ;
      /**
       * <code>double leftRearSlewOffset = 2;</code>
       * @return The leftRearSlewOffset.
       */
      @java.lang.Override
      public double getLeftRearSlewOffset() {
        return leftRearSlewOffset_;
      }
      /**
       * <code>double leftRearSlewOffset = 2;</code>
       * @param value The leftRearSlewOffset to set.
       * @return This builder for chaining.
       */
      public Builder setLeftRearSlewOffset(double value) {

        leftRearSlewOffset_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>double leftRearSlewOffset = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLeftRearSlewOffset() {
        bitField0_ = (bitField0_ & ~0x00000002);
        leftRearSlewOffset_ = 0D;
        onChanged();
        return this;
      }

      private double rightFrontSlewOffset_ ;
      /**
       * <code>double rightFrontSlewOffset = 3;</code>
       * @return The rightFrontSlewOffset.
       */
      @java.lang.Override
      public double getRightFrontSlewOffset() {
        return rightFrontSlewOffset_;
      }
      /**
       * <code>double rightFrontSlewOffset = 3;</code>
       * @param value The rightFrontSlewOffset to set.
       * @return This builder for chaining.
       */
      public Builder setRightFrontSlewOffset(double value) {

        rightFrontSlewOffset_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>double rightFrontSlewOffset = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRightFrontSlewOffset() {
        bitField0_ = (bitField0_ & ~0x00000004);
        rightFrontSlewOffset_ = 0D;
        onChanged();
        return this;
      }

      private double rightRearSlewOffset_ ;
      /**
       * <code>double rightRearSlewOffset = 4;</code>
       * @return The rightRearSlewOffset.
       */
      @java.lang.Override
      public double getRightRearSlewOffset() {
        return rightRearSlewOffset_;
      }
      /**
       * <code>double rightRearSlewOffset = 4;</code>
       * @param value The rightRearSlewOffset to set.
       * @return This builder for chaining.
       */
      public Builder setRightRearSlewOffset(double value) {

        rightRearSlewOffset_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>double rightRearSlewOffset = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRightRearSlewOffset() {
        bitField0_ = (bitField0_ & ~0x00000008);
        rightRearSlewOffset_ = 0D;
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


      // @@protoc_insertion_point(builder_scope:frc.team3171.protos.SlewCalibration)
    }

    // @@protoc_insertion_point(class_scope:frc.team3171.protos.SlewCalibration)
    private static final frc.team3171.protos.SlewDrive.SlewCalibration DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new frc.team3171.protos.SlewDrive.SlewCalibration();
    }

    public static frc.team3171.protos.SlewDrive.SlewCalibration getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SlewCalibration>
        PARSER = new com.google.protobuf.AbstractParser<SlewCalibration>() {
      @java.lang.Override
      public SlewCalibration parsePartialFrom(
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

    public static com.google.protobuf.Parser<SlewCalibration> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SlewCalibration> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public frc.team3171.protos.SlewDrive.SlewCalibration getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_frc_team3171_protos_SlewCalibration_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_frc_team3171_protos_SlewCalibration_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$frc/team3171/protos/slew_drive.proto\022\023" +
      "frc.team3171.protos\"\205\001\n\017SlewCalibration\022" +
      "\033\n\023leftFrontSlewOffset\030\001 \001(\001\022\032\n\022leftRear" +
      "SlewOffset\030\002 \001(\001\022\034\n\024rightFrontSlewOffset" +
      "\030\003 \001(\001\022\033\n\023rightRearSlewOffset\030\004 \001(\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_frc_team3171_protos_SlewCalibration_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_frc_team3171_protos_SlewCalibration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_frc_team3171_protos_SlewCalibration_descriptor,
        new java.lang.String[] { "LeftFrontSlewOffset", "LeftRearSlewOffset", "RightFrontSlewOffset", "RightRearSlewOffset", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
