package com.massage.massenger.data.local.room.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.massage.massenger.model.ChatMessage;
import com.massage.massenger.util.state.AttachedMedia;
import com.massage.massenger.util.state.MessageStatus;
import java.lang.Class;
import java.lang.Exception;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MessageDao_Impl implements MessageDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ChatMessage> __insertionAdapterOfChatMessage;

  private final SharedSQLiteStatement __preparedStmtOfUpdateImageUri;

  private final SharedSQLiteStatement __preparedStmtOfUpdateMessageStatus;

  public MessageDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfChatMessage = new EntityInsertionAdapter<ChatMessage>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `message_table` (`id`,`chatId`,`authorId`,`authorName`,`text`,`mediaUrl`,`cacheMediaUri`,`mediaType`,`timestamp`,`date`,`time`,`status`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ChatMessage value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getChatId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getChatId());
        }
        if (value.getAuthorId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAuthorId());
        }
        if (value.getAuthorName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAuthorName());
        }
        if (value.getText() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getText());
        }
        if (value.getMediaUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getMediaUrl());
        }
        if (value.getCacheMediaUri() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getCacheMediaUri());
        }
        if (value.getMediaType() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, __AttachedMedia_enumToString(value.getMediaType()));
        }
        stmt.bindLong(9, value.getTimestamp());
        if (value.getDate() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getDate());
        }
        if (value.getTime() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getTime());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, __MessageStatus_enumToString(value.getStatus()));
        }
      }
    };
    this.__preparedStmtOfUpdateImageUri = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE message_table SET cacheMediaUri = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateMessageStatus = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE message_table SET status = ? WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertMessage(final ChatMessage message,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfChatMessage.insert(message);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateImageUri(final String id, final String cacheMediaUri,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateImageUri.acquire();
        int _argIndex = 1;
        if (cacheMediaUri == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, cacheMediaUri);
        }
        _argIndex = 2;
        if (id == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, id);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateImageUri.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object updateMessageStatus(final String id, final MessageStatus newStatus,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateMessageStatus.acquire();
        int _argIndex = 1;
        if (newStatus == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, __MessageStatus_enumToString(newStatus));
        }
        _argIndex = 2;
        if (id == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, id);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateMessageStatus.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<ChatMessage>> allWithChat(final String chatId) {
    final String _sql = "SELECT * FROM message_table WHERE chatId IS ? ORDER BY timestamp DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (chatId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, chatId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"message_table"}, new Callable<List<ChatMessage>>() {
      @Override
      public List<ChatMessage> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfChatId = CursorUtil.getColumnIndexOrThrow(_cursor, "chatId");
          final int _cursorIndexOfAuthorId = CursorUtil.getColumnIndexOrThrow(_cursor, "authorId");
          final int _cursorIndexOfAuthorName = CursorUtil.getColumnIndexOrThrow(_cursor, "authorName");
          final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
          final int _cursorIndexOfMediaUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaUrl");
          final int _cursorIndexOfCacheMediaUri = CursorUtil.getColumnIndexOrThrow(_cursor, "cacheMediaUri");
          final int _cursorIndexOfMediaType = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaType");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final List<ChatMessage> _result = new ArrayList<ChatMessage>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ChatMessage _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpChatId;
            if (_cursor.isNull(_cursorIndexOfChatId)) {
              _tmpChatId = null;
            } else {
              _tmpChatId = _cursor.getString(_cursorIndexOfChatId);
            }
            final String _tmpAuthorId;
            if (_cursor.isNull(_cursorIndexOfAuthorId)) {
              _tmpAuthorId = null;
            } else {
              _tmpAuthorId = _cursor.getString(_cursorIndexOfAuthorId);
            }
            final String _tmpAuthorName;
            if (_cursor.isNull(_cursorIndexOfAuthorName)) {
              _tmpAuthorName = null;
            } else {
              _tmpAuthorName = _cursor.getString(_cursorIndexOfAuthorName);
            }
            final String _tmpText;
            if (_cursor.isNull(_cursorIndexOfText)) {
              _tmpText = null;
            } else {
              _tmpText = _cursor.getString(_cursorIndexOfText);
            }
            final String _tmpMediaUrl;
            if (_cursor.isNull(_cursorIndexOfMediaUrl)) {
              _tmpMediaUrl = null;
            } else {
              _tmpMediaUrl = _cursor.getString(_cursorIndexOfMediaUrl);
            }
            final String _tmpCacheMediaUri;
            if (_cursor.isNull(_cursorIndexOfCacheMediaUri)) {
              _tmpCacheMediaUri = null;
            } else {
              _tmpCacheMediaUri = _cursor.getString(_cursorIndexOfCacheMediaUri);
            }
            final AttachedMedia _tmpMediaType;
            _tmpMediaType = __AttachedMedia_stringToEnum(_cursor.getString(_cursorIndexOfMediaType));
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpTime;
            if (_cursor.isNull(_cursorIndexOfTime)) {
              _tmpTime = null;
            } else {
              _tmpTime = _cursor.getString(_cursorIndexOfTime);
            }
            final MessageStatus _tmpStatus;
            _tmpStatus = __MessageStatus_stringToEnum(_cursor.getString(_cursorIndexOfStatus));
            _item = new ChatMessage(_tmpId,_tmpChatId,_tmpAuthorId,_tmpAuthorName,_tmpText,_tmpMediaUrl,_tmpCacheMediaUri,_tmpMediaType,_tmpTimestamp,_tmpDate,_tmpTime,_tmpStatus);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private String __AttachedMedia_enumToString(final AttachedMedia _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case IMAGE: return "IMAGE";
      case VIDEO: return "VIDEO";
      case AUDIO: return "AUDIO";
      case FILE: return "FILE";
      default: throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + _value);
    }
  }

  private String __MessageStatus_enumToString(final MessageStatus _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case SENDING: return "SENDING";
      case SENT: return "SENT";
      case DELIVERED: return "DELIVERED";
      case SEEN: return "SEEN";
      case FAILED: return "FAILED";
      case RECEIVED: return "RECEIVED";
      case SEEN_RECEIVED: return "SEEN_RECEIVED";
      case EMPTY_CHAT: return "EMPTY_CHAT";
      default: throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + _value);
    }
  }

  private AttachedMedia __AttachedMedia_stringToEnum(final String _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case "IMAGE": return AttachedMedia.IMAGE;
      case "VIDEO": return AttachedMedia.VIDEO;
      case "AUDIO": return AttachedMedia.AUDIO;
      case "FILE": return AttachedMedia.FILE;
      default: throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }
  }

  private MessageStatus __MessageStatus_stringToEnum(final String _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case "SENDING": return MessageStatus.SENDING;
      case "SENT": return MessageStatus.SENT;
      case "DELIVERED": return MessageStatus.DELIVERED;
      case "SEEN": return MessageStatus.SEEN;
      case "FAILED": return MessageStatus.FAILED;
      case "RECEIVED": return MessageStatus.RECEIVED;
      case "SEEN_RECEIVED": return MessageStatus.SEEN_RECEIVED;
      case "EMPTY_CHAT": return MessageStatus.EMPTY_CHAT;
      default: throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }
  }
}
