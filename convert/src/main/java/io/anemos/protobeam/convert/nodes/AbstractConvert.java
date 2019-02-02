package io.anemos.protobeam.convert.nodes;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;

public abstract class AbstractConvert<FIELD, IN, OUT> {
    protected Descriptors.FieldDescriptor fieldDescriptor;

    public AbstractConvert(Descriptors.FieldDescriptor fieldDescriptor) {
        this.fieldDescriptor = fieldDescriptor;
    }

    public abstract Object convert(Object in);

    public abstract void convert(Message message, IN row);

    public abstract void convertToProto(Message.Builder builder, OUT row);

    public FIELD convertFrom(Object in) {
        return (FIELD) in;
    }
}