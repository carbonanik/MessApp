package com.massage.massenger.util.state;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/massage/massenger/util/state/MessageStatus;", "", "(Ljava/lang/String;I)V", "isReceived", "", "SENDING", "SENT", "DELIVERED", "SEEN", "FAILED", "RECEIVED", "SEEN_RECEIVED", "EMPTY_CHAT", "app_debug"})
public enum MessageStatus {
    /*public static final*/ SENDING /* = new SENDING() */,
    /*public static final*/ SENT /* = new SENT() */,
    /*public static final*/ DELIVERED /* = new DELIVERED() */,
    /*public static final*/ SEEN /* = new SEEN() */,
    /*public static final*/ FAILED /* = new FAILED() */,
    /*public static final*/ RECEIVED /* = new RECEIVED() */,
    /*public static final*/ SEEN_RECEIVED /* = new SEEN_RECEIVED() */,
    /*public static final*/ EMPTY_CHAT /* = new EMPTY_CHAT() */;
    
    MessageStatus() {
    }
    
    public final boolean isReceived() {
        return false;
    }
}