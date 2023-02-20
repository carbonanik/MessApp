package com.massage.massenger.data.remote.socket.events;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001e2\u00020\u0001:\u0005\u001e\u001f !\"B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\fJ!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u00c7\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014\u0082\u0001\u0004#$%&\u00a8\u0006\'"}, d2 = {"Lcom/massage/massenger/data/remote/socket/events/SocketEvent;", "", "seen1", "", "sender", "Lcom/massage/massenger/model/User;", "receiver", "group", "Lcom/massage/massenger/model/Group;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/massage/massenger/model/User;Lcom/massage/massenger/model/User;Lcom/massage/massenger/model/Group;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getGroup", "()Lcom/massage/massenger/model/Group;", "setGroup", "(Lcom/massage/massenger/model/Group;)V", "getReceiver", "()Lcom/massage/massenger/model/User;", "setReceiver", "(Lcom/massage/massenger/model/User;)V", "getSender", "setSender", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "MessageStatusCarrier", "RTCMessage", "TextMessage", "WanderingStatus", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$TextMessage;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$MessageStatusCarrier;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$WanderingStatus;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage;", "app_debug"})
@kotlinx.serialization.Serializable()
public abstract class SocketEvent {
    @org.jetbrains.annotations.NotNull()
    public static final com.massage.massenger.data.remote.socket.events.SocketEvent.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private com.massage.massenger.model.User sender;
    @org.jetbrains.annotations.Nullable()
    private com.massage.massenger.model.User receiver;
    @org.jetbrains.annotations.Nullable()
    private com.massage.massenger.model.Group group;
    
    private SocketEvent() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.socket.events.SocketEvent self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.massage.massenger.model.User getSender() {
        return null;
    }
    
    public final void setSender(@org.jetbrains.annotations.Nullable()
    com.massage.massenger.model.User p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.massage.massenger.model.User getReceiver() {
        return null;
    }
    
    public final void setReceiver(@org.jetbrains.annotations.Nullable()
    com.massage.massenger.model.User p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.massage.massenger.model.Group getGroup() {
        return null;
    }
    
    public final void setGroup(@org.jetbrains.annotations.Nullable()
    com.massage.massenger.model.Group p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000278Bg\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u0013BG\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\t\u0010#\u001a\u00020\nH\u00c6\u0003J\t\u0010$\u001a\u00020\fH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\t\u0010(\u001a\u00020\u0015H\u00c6\u0003JK\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001J\t\u0010/\u001a\u00020\nH\u00d6\u0001J!\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u00c7\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u001c\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u00069"}, d2 = {"Lcom/massage/massenger/data/remote/socket/events/SocketEvent$TextMessage;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent;", "seen1", "", "sender", "Lcom/massage/massenger/model/User;", "receiver", "group", "Lcom/massage/massenger/model/Group;", "id", "", "timestamp", "", "text", "mediaUrl", "mediaType", "Lcom/massage/massenger/util/state/AttachedMedia;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/massage/massenger/model/User;Lcom/massage/massenger/model/User;Lcom/massage/massenger/model/Group;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/massage/massenger/util/state/AttachedMedia;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "status", "Lcom/massage/massenger/util/state/MessageStatus;", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/massage/massenger/util/state/AttachedMedia;Lcom/massage/massenger/util/state/MessageStatus;)V", "getId", "()Ljava/lang/String;", "getMediaType", "()Lcom/massage/massenger/util/state/AttachedMedia;", "getMediaUrl", "getStatus$annotations", "()V", "getStatus", "()Lcom/massage/massenger/util/state/MessageStatus;", "getText", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_debug"})
    @kotlinx.serialization.SerialName(value = "TextMessage")
    @kotlinx.serialization.Serializable()
    public static final class TextMessage extends com.massage.massenger.data.remote.socket.events.SocketEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        private final long timestamp = 0L;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String text = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String mediaUrl = null;
        @org.jetbrains.annotations.Nullable()
        private final com.massage.massenger.util.state.AttachedMedia mediaType = null;
        @org.jetbrains.annotations.NotNull()
        private final com.massage.massenger.util.state.MessageStatus status = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage copy(@org.jetbrains.annotations.NotNull()
        java.lang.String id, long timestamp, @org.jetbrains.annotations.Nullable()
        java.lang.String text, @org.jetbrains.annotations.Nullable()
        java.lang.String mediaUrl, @org.jetbrains.annotations.Nullable()
        com.massage.massenger.util.state.AttachedMedia mediaType, @org.jetbrains.annotations.NotNull()
        com.massage.massenger.util.state.MessageStatus status) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        public static final void write$Self(@org.jetbrains.annotations.NotNull()
        com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage self, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public TextMessage() {
            super(0, null, null, null, null);
        }
        
        public TextMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String id, long timestamp, @org.jetbrains.annotations.Nullable()
        java.lang.String text, @org.jetbrains.annotations.Nullable()
        java.lang.String mediaUrl, @org.jetbrains.annotations.Nullable()
        com.massage.massenger.util.state.AttachedMedia mediaType, @org.jetbrains.annotations.NotNull()
        com.massage.massenger.util.state.MessageStatus status) {
            super(0, null, null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getTimestamp() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getText() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMediaUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.massage.massenger.util.state.AttachedMedia component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.massage.massenger.util.state.AttachedMedia getMediaType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.massage.massenger.util.state.MessageStatus component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.massage.massenger.util.state.MessageStatus getStatus() {
            return null;
        }
        
        @kotlinx.serialization.Transient()
        @java.lang.Deprecated()
        public static void getStatus$annotations() {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/massage/massenger/data/remote/socket/events/SocketEvent$TextMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$TextMessage;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlinx.serialization.KSerializer<com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/massage/massenger/data/remote/socket/events/SocketEvent.TextMessage.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$TextMessage;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
        @java.lang.Deprecated()
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage> {
            @org.jetbrains.annotations.NotNull()
            public static final com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage.$serializer INSTANCE = null;
            
            private $serializer() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public kotlinx.serialization.KSerializer<?>[] childSerializers() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage deserialize(@org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.Decoder decoder) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return null;
            }
            
            @java.lang.Override()
            public void serialize(@org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
            com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage value) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+BS\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011B!\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u0012J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\fH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u000eH\u00c6\u0003J\'\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\"\u001a\u00020\nH\u00d6\u0001J!\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u00c7\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006,"}, d2 = {"Lcom/massage/massenger/data/remote/socket/events/SocketEvent$MessageStatusCarrier;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent;", "seen1", "", "sender", "Lcom/massage/massenger/model/User;", "receiver", "group", "Lcom/massage/massenger/model/Group;", "messageId", "", "time", "", "status", "Lcom/massage/massenger/util/state/MessageStatus;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/massage/massenger/model/User;Lcom/massage/massenger/model/User;Lcom/massage/massenger/model/Group;Ljava/lang/String;JLcom/massage/massenger/util/state/MessageStatus;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;JLcom/massage/massenger/util/state/MessageStatus;)V", "getMessageId", "()Ljava/lang/String;", "getStatus", "()Lcom/massage/massenger/util/state/MessageStatus;", "getTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_debug"})
    @kotlinx.serialization.SerialName(value = "MessageStatusCarrier")
    @kotlinx.serialization.Serializable()
    public static final class MessageStatusCarrier extends com.massage.massenger.data.remote.socket.events.SocketEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.massage.massenger.data.remote.socket.events.SocketEvent.MessageStatusCarrier.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String messageId = null;
        private final long time = 0L;
        @org.jetbrains.annotations.NotNull()
        private final com.massage.massenger.util.state.MessageStatus status = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.massage.massenger.data.remote.socket.events.SocketEvent.MessageStatusCarrier copy(@org.jetbrains.annotations.NotNull()
        java.lang.String messageId, long time, @org.jetbrains.annotations.NotNull()
        com.massage.massenger.util.state.MessageStatus status) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        public static final void write$Self(@org.jetbrains.annotations.NotNull()
        com.massage.massenger.data.remote.socket.events.SocketEvent.MessageStatusCarrier self, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public MessageStatusCarrier(@org.jetbrains.annotations.NotNull()
        java.lang.String messageId, long time, @org.jetbrains.annotations.NotNull()
        com.massage.massenger.util.state.MessageStatus status) {
            super(0, null, null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessageId() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getTime() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.massage.massenger.util.state.MessageStatus component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.massage.massenger.util.state.MessageStatus getStatus() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/massage/massenger/data/remote/socket/events/SocketEvent$MessageStatusCarrier$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$MessageStatusCarrier;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlinx.serialization.KSerializer<com.massage.massenger.data.remote.socket.events.SocketEvent.MessageStatusCarrier> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/massage/massenger/data/remote/socket/events/SocketEvent.MessageStatusCarrier.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$MessageStatusCarrier;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
        @java.lang.Deprecated()
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.massage.massenger.data.remote.socket.events.SocketEvent.MessageStatusCarrier> {
            @org.jetbrains.annotations.NotNull()
            public static final com.massage.massenger.data.remote.socket.events.SocketEvent.MessageStatusCarrier.$serializer INSTANCE = null;
            
            private $serializer() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public kotlinx.serialization.KSerializer<?>[] childSerializers() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.massage.massenger.data.remote.socket.events.SocketEvent.MessageStatusCarrier deserialize(@org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.Decoder decoder) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return null;
            }
            
            @java.lang.Override()
            public void serialize(@org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
            com.massage.massenger.data.remote.socket.events.SocketEvent.MessageStatusCarrier value) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rB\u000f\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u0011\u001a\u00020\nH\u00c6\u0003J\u0013\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u00c7\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006#"}, d2 = {"Lcom/massage/massenger/data/remote/socket/events/SocketEvent$WanderingStatus;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent;", "seen1", "", "sender", "Lcom/massage/massenger/model/User;", "receiver", "group", "Lcom/massage/massenger/model/Group;", "status", "Lcom/massage/massenger/util/state/WanderingState;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/massage/massenger/model/User;Lcom/massage/massenger/model/User;Lcom/massage/massenger/model/Group;Lcom/massage/massenger/util/state/WanderingState;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/massage/massenger/util/state/WanderingState;)V", "getStatus", "()Lcom/massage/massenger/util/state/WanderingState;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_debug"})
    @kotlinx.serialization.SerialName(value = "WanderingStatus")
    @kotlinx.serialization.Serializable()
    public static final class WanderingStatus extends com.massage.massenger.data.remote.socket.events.SocketEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.massage.massenger.data.remote.socket.events.SocketEvent.WanderingStatus.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        private final com.massage.massenger.util.state.WanderingState status = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.massage.massenger.data.remote.socket.events.SocketEvent.WanderingStatus copy(@org.jetbrains.annotations.NotNull()
        com.massage.massenger.util.state.WanderingState status) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        public static final void write$Self(@org.jetbrains.annotations.NotNull()
        com.massage.massenger.data.remote.socket.events.SocketEvent.WanderingStatus self, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public WanderingStatus() {
            super(0, null, null, null, null);
        }
        
        public WanderingStatus(@org.jetbrains.annotations.NotNull()
        com.massage.massenger.util.state.WanderingState status) {
            super(0, null, null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.massage.massenger.util.state.WanderingState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.massage.massenger.util.state.WanderingState getStatus() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/massage/massenger/data/remote/socket/events/SocketEvent$WanderingStatus$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$WanderingStatus;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlinx.serialization.KSerializer<com.massage.massenger.data.remote.socket.events.SocketEvent.WanderingStatus> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/massage/massenger/data/remote/socket/events/SocketEvent.WanderingStatus.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$WanderingStatus;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
        @java.lang.Deprecated()
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.massage.massenger.data.remote.socket.events.SocketEvent.WanderingStatus> {
            @org.jetbrains.annotations.NotNull()
            public static final com.massage.massenger.data.remote.socket.events.SocketEvent.WanderingStatus.$serializer INSTANCE = null;
            
            private $serializer() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public kotlinx.serialization.KSerializer<?>[] childSerializers() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.massage.massenger.data.remote.socket.events.SocketEvent.WanderingStatus deserialize(@org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.Decoder decoder) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return null;
            }
            
            @java.lang.Override()
            public void serialize(@org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
            com.massage.massenger.data.remote.socket.events.SocketEvent.WanderingStatus value) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0005\u0014\u0015\u0016\u0017\u0018B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u00c7\u0001\u0082\u0001\u0004\u0019\u001a\u001b\u001c\u00a8\u0006\u001d"}, d2 = {"Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent;", "seen1", "", "sender", "Lcom/massage/massenger/model/User;", "receiver", "group", "Lcom/massage/massenger/model/Group;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/massage/massenger/model/User;Lcom/massage/massenger/model/User;Lcom/massage/massenger/model/Group;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "ICEMessage", "PeerLeft", "RtcRequest", "SDPMessage", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$RtcRequest;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$SDPMessage;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$ICEMessage;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$PeerLeft;", "app_debug"})
    @kotlinx.serialization.Serializable()
    public static abstract class RTCMessage extends com.massage.massenger.data.remote.socket.events.SocketEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.Companion Companion = null;
        
        private RTCMessage() {
            super(0, null, null, null, null);
        }
        
        @kotlin.jvm.JvmStatic()
        public static final void write$Self(@org.jetbrains.annotations.NotNull()
        com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage self, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \'2\u00020\u0001:\u0002&\'BK\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fB\u0019\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u0015\u001a\u00020\nH\u00c6\u0003J\t\u0010\u0016\u001a\u00020\fH\u00c6\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J!\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u00c7\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006("}, d2 = {"Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$RtcRequest;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage;", "seen1", "", "sender", "Lcom/massage/massenger/model/User;", "receiver", "group", "Lcom/massage/massenger/model/Group;", "rtcConType", "Lcom/massage/massenger/model/enumstate/RTCConnectionType;", "rtcReqType", "Lcom/massage/massenger/model/enumstate/RTCRequestType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/massage/massenger/model/User;Lcom/massage/massenger/model/User;Lcom/massage/massenger/model/Group;Lcom/massage/massenger/model/enumstate/RTCConnectionType;Lcom/massage/massenger/model/enumstate/RTCRequestType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/massage/massenger/model/enumstate/RTCConnectionType;Lcom/massage/massenger/model/enumstate/RTCRequestType;)V", "getRtcConType", "()Lcom/massage/massenger/model/enumstate/RTCConnectionType;", "getRtcReqType", "()Lcom/massage/massenger/model/enumstate/RTCRequestType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_debug"})
        @kotlinx.serialization.SerialName(value = "RtcRequest")
        @kotlinx.serialization.Serializable()
        public static final class RtcRequest extends com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage {
            @org.jetbrains.annotations.NotNull()
            public static final com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.RtcRequest.Companion Companion = null;
            @org.jetbrains.annotations.NotNull()
            private final com.massage.massenger.model.enumstate.RTCConnectionType rtcConType = null;
            @org.jetbrains.annotations.NotNull()
            private final com.massage.massenger.model.enumstate.RTCRequestType rtcReqType = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.RtcRequest copy(@org.jetbrains.annotations.NotNull()
            com.massage.massenger.model.enumstate.RTCConnectionType rtcConType, @org.jetbrains.annotations.NotNull()
            com.massage.massenger.model.enumstate.RTCRequestType rtcReqType) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @kotlin.jvm.JvmStatic()
            public static final void write$Self(@org.jetbrains.annotations.NotNull()
            com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.RtcRequest self, @org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
            kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            }
            
            public RtcRequest() {
                super(0, null, null, null, null);
            }
            
            public RtcRequest(@org.jetbrains.annotations.NotNull()
            com.massage.massenger.model.enumstate.RTCConnectionType rtcConType, @org.jetbrains.annotations.NotNull()
            com.massage.massenger.model.enumstate.RTCRequestType rtcReqType) {
                super(0, null, null, null, null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.massage.massenger.model.enumstate.RTCConnectionType component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.massage.massenger.model.enumstate.RTCConnectionType getRtcConType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.massage.massenger.model.enumstate.RTCRequestType component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.massage.massenger.model.enumstate.RTCRequestType getRtcReqType() {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$RtcRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$RtcRequest;", "app_debug"})
            public static final class Companion {
                
                private Companion() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                public final kotlinx.serialization.KSerializer<com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.RtcRequest> serializer() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/massage/massenger/data/remote/socket/events/SocketEvent.RTCMessage.RtcRequest.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$RtcRequest;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
            @java.lang.Deprecated()
            public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.RtcRequest> {
                @org.jetbrains.annotations.NotNull()
                public static final com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.RtcRequest.$serializer INSTANCE = null;
                
                private $serializer() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public kotlinx.serialization.KSerializer<?>[] childSerializers() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.RtcRequest deserialize(@org.jetbrains.annotations.NotNull()
                kotlinx.serialization.encoding.Decoder decoder) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                    return null;
                }
                
                @java.lang.Override()
                public void serialize(@org.jetbrains.annotations.NotNull()
                kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
                com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.RtcRequest value) {
                }
                
                @org.jetbrains.annotations.NotNull()
                public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&BK\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fB\u0015\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u0015\u001a\u00020\nH\u00c6\u0003J\t\u0010\u0016\u001a\u00020\fH\u00c6\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\fH\u00d6\u0001J!\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u00c7\u0001R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\'"}, d2 = {"Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$SDPMessage;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage;", "seen1", "", "sender", "Lcom/massage/massenger/model/User;", "receiver", "group", "Lcom/massage/massenger/model/Group;", "sdpType", "Lorg/webrtc/SessionDescription$Type;", "sdp", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/massage/massenger/model/User;Lcom/massage/massenger/model/User;Lcom/massage/massenger/model/Group;Lorg/webrtc/SessionDescription$Type;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lorg/webrtc/SessionDescription$Type;Ljava/lang/String;)V", "getSdp", "()Ljava/lang/String;", "getSdpType", "()Lorg/webrtc/SessionDescription$Type;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_debug"})
        @kotlinx.serialization.SerialName(value = "SDPMessage")
        @kotlinx.serialization.Serializable()
        public static final class SDPMessage extends com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage {
            @org.jetbrains.annotations.NotNull()
            public static final com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.SDPMessage.Companion Companion = null;
            @org.jetbrains.annotations.NotNull()
            private final org.webrtc.SessionDescription.Type sdpType = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String sdp = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.SDPMessage copy(@org.jetbrains.annotations.NotNull()
            org.webrtc.SessionDescription.Type sdpType, @org.jetbrains.annotations.NotNull()
            java.lang.String sdp) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @kotlin.jvm.JvmStatic()
            public static final void write$Self(@org.jetbrains.annotations.NotNull()
            com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.SDPMessage self, @org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
            kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            }
            
            public SDPMessage(@org.jetbrains.annotations.NotNull()
            org.webrtc.SessionDescription.Type sdpType, @org.jetbrains.annotations.NotNull()
            java.lang.String sdp) {
                super(0, null, null, null, null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.webrtc.SessionDescription.Type component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.webrtc.SessionDescription.Type getSdpType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getSdp() {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$SDPMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$SDPMessage;", "app_debug"})
            public static final class Companion {
                
                private Companion() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                public final kotlinx.serialization.KSerializer<com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.SDPMessage> serializer() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/massage/massenger/data/remote/socket/events/SocketEvent.RTCMessage.SDPMessage.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$SDPMessage;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
            @java.lang.Deprecated()
            public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.SDPMessage> {
                @org.jetbrains.annotations.NotNull()
                public static final com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.SDPMessage.$serializer INSTANCE = null;
                
                private $serializer() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public kotlinx.serialization.KSerializer<?>[] childSerializers() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.SDPMessage deserialize(@org.jetbrains.annotations.NotNull()
                kotlinx.serialization.encoding.Decoder decoder) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                    return null;
                }
                
                @java.lang.Override()
                public void serialize(@org.jetbrains.annotations.NotNull()
                kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
                com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.SDPMessage value) {
                }
                
                @org.jetbrains.annotations.NotNull()
                public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002-.Bg\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011B-\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0002\u0010\u0012J\t\u0010\u001a\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\nH\u00c6\u0003J;\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nH\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\t\u0010%\u001a\u00020\nH\u00d6\u0001J!\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u00c7\u0001R\u0011\u0010\u000e\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014\u00a8\u0006/"}, d2 = {"Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$ICEMessage;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage;", "seen1", "", "sender", "Lcom/massage/massenger/model/User;", "receiver", "group", "Lcom/massage/massenger/model/Group;", "serverUrl", "", "sdpMid", "sdpMLineIndex", "sdpCandidate", "candidateType", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/massage/massenger/model/User;Lcom/massage/massenger/model/User;Lcom/massage/massenger/model/Group;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCandidateType", "()Ljava/lang/String;", "getSdpCandidate", "getSdpMLineIndex", "()I", "getSdpMid", "getServerUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_debug"})
        @kotlinx.serialization.SerialName(value = "ICEMessage")
        @kotlinx.serialization.Serializable()
        public static final class ICEMessage extends com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage {
            @org.jetbrains.annotations.NotNull()
            public static final com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.ICEMessage.Companion Companion = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String serverUrl = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String sdpMid = null;
            private final int sdpMLineIndex = 0;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String sdpCandidate = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String candidateType = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.ICEMessage copy(@org.jetbrains.annotations.NotNull()
            java.lang.String serverUrl, @org.jetbrains.annotations.NotNull()
            java.lang.String sdpMid, int sdpMLineIndex, @org.jetbrains.annotations.NotNull()
            java.lang.String sdpCandidate, @org.jetbrains.annotations.NotNull()
            java.lang.String candidateType) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @kotlin.jvm.JvmStatic()
            public static final void write$Self(@org.jetbrains.annotations.NotNull()
            com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.ICEMessage self, @org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
            kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            }
            
            public ICEMessage(@org.jetbrains.annotations.NotNull()
            java.lang.String serverUrl, @org.jetbrains.annotations.NotNull()
            java.lang.String sdpMid, int sdpMLineIndex, @org.jetbrains.annotations.NotNull()
            java.lang.String sdpCandidate, @org.jetbrains.annotations.NotNull()
            java.lang.String candidateType) {
                super(0, null, null, null, null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getServerUrl() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getSdpMid() {
                return null;
            }
            
            public final int component3() {
                return 0;
            }
            
            public final int getSdpMLineIndex() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getSdpCandidate() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component5() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCandidateType() {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$ICEMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$ICEMessage;", "app_debug"})
            public static final class Companion {
                
                private Companion() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                public final kotlinx.serialization.KSerializer<com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.ICEMessage> serializer() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/massage/massenger/data/remote/socket/events/SocketEvent.RTCMessage.ICEMessage.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$ICEMessage;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
            @java.lang.Deprecated()
            public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.ICEMessage> {
                @org.jetbrains.annotations.NotNull()
                public static final com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.ICEMessage.$serializer INSTANCE = null;
                
                private $serializer() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public kotlinx.serialization.KSerializer<?>[] childSerializers() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.ICEMessage deserialize(@org.jetbrains.annotations.NotNull()
                kotlinx.serialization.encoding.Decoder decoder) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                    return null;
                }
                
                @java.lang.Override()
                public void serialize(@org.jetbrains.annotations.NotNull()
                kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
                com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.ICEMessage value) {
                }
                
                @org.jetbrains.annotations.NotNull()
                public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rB\u000f\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u0011\u001a\u00020\nH\u00c6\u0003J\u0013\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u00c7\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006#"}, d2 = {"Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$PeerLeft;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage;", "seen1", "", "sender", "Lcom/massage/massenger/model/User;", "receiver", "group", "Lcom/massage/massenger/model/Group;", "reason", "Lcom/massage/massenger/model/enumstate/LeftReason;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/massage/massenger/model/User;Lcom/massage/massenger/model/User;Lcom/massage/massenger/model/Group;Lcom/massage/massenger/model/enumstate/LeftReason;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/massage/massenger/model/enumstate/LeftReason;)V", "getReason", "()Lcom/massage/massenger/model/enumstate/LeftReason;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_debug"})
        @kotlinx.serialization.SerialName(value = "PeerLeft")
        @kotlinx.serialization.Serializable()
        public static final class PeerLeft extends com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage {
            @org.jetbrains.annotations.NotNull()
            public static final com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.PeerLeft.Companion Companion = null;
            @org.jetbrains.annotations.NotNull()
            private final com.massage.massenger.model.enumstate.LeftReason reason = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.PeerLeft copy(@org.jetbrains.annotations.NotNull()
            com.massage.massenger.model.enumstate.LeftReason reason) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @kotlin.jvm.JvmStatic()
            public static final void write$Self(@org.jetbrains.annotations.NotNull()
            com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.PeerLeft self, @org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
            kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            }
            
            public PeerLeft() {
                super(0, null, null, null, null);
            }
            
            public PeerLeft(@org.jetbrains.annotations.NotNull()
            com.massage.massenger.model.enumstate.LeftReason reason) {
                super(0, null, null, null, null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.massage.massenger.model.enumstate.LeftReason component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.massage.massenger.model.enumstate.LeftReason getReason() {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$PeerLeft$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$PeerLeft;", "app_debug"})
            public static final class Companion {
                
                private Companion() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                public final kotlinx.serialization.KSerializer<com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.PeerLeft> serializer() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/massage/massenger/data/remote/socket/events/SocketEvent.RTCMessage.PeerLeft.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$PeerLeft;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
            @java.lang.Deprecated()
            public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.PeerLeft> {
                @org.jetbrains.annotations.NotNull()
                public static final com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.PeerLeft.$serializer INSTANCE = null;
                
                private $serializer() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public kotlinx.serialization.KSerializer<?>[] childSerializers() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.PeerLeft deserialize(@org.jetbrains.annotations.NotNull()
                kotlinx.serialization.encoding.Decoder decoder) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                    return null;
                }
                
                @java.lang.Override()
                public void serialize(@org.jetbrains.annotations.NotNull()
                kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
                com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage.PeerLeft value) {
                }
                
                @org.jetbrains.annotations.NotNull()
                public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlinx.serialization.KSerializer<com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage> serializer() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/massage/massenger/data/remote/socket/events/SocketEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<com.massage.massenger.data.remote.socket.events.SocketEvent> serializer() {
            return null;
        }
    }
}