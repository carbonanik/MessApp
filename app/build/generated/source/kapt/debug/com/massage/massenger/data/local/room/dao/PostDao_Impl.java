package com.massage.massenger.data.local.room.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.massage.massenger.model.Post;
import java.lang.Class;
import java.lang.Exception;
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
public final class PostDao_Impl implements PostDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Post> __insertionAdapterOfPost;

  public PostDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPost = new EntityInsertionAdapter<Post>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `post_table` (`id`,`authorId`,`title`,`body`,`time`,`privacy`,`contentUrl`,`contentType`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Post value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getAuthorId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAuthorId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getBody() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBody());
        }
        stmt.bindLong(5, value.getTime());
        if (value.getPrivacy() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPrivacy());
        }
        if (value.getContentUrl() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getContentUrl());
        }
        if (value.getContentType() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getContentType());
        }
      }
    };
  }

  @Override
  public Object insertPost(final Post[] group, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPost.insert(group);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getPost(final String id, final Continuation<? super Post> continuation) {
    final String _sql = "SELECT * FROM post_table WHERE id IS ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Post>() {
      @Override
      public Post call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAuthorId = CursorUtil.getColumnIndexOrThrow(_cursor, "authorId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfPrivacy = CursorUtil.getColumnIndexOrThrow(_cursor, "privacy");
          final int _cursorIndexOfContentUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "contentUrl");
          final int _cursorIndexOfContentType = CursorUtil.getColumnIndexOrThrow(_cursor, "contentType");
          final Post _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpAuthorId;
            if (_cursor.isNull(_cursorIndexOfAuthorId)) {
              _tmpAuthorId = null;
            } else {
              _tmpAuthorId = _cursor.getString(_cursorIndexOfAuthorId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpBody;
            if (_cursor.isNull(_cursorIndexOfBody)) {
              _tmpBody = null;
            } else {
              _tmpBody = _cursor.getString(_cursorIndexOfBody);
            }
            final long _tmpTime;
            _tmpTime = _cursor.getLong(_cursorIndexOfTime);
            final String _tmpPrivacy;
            if (_cursor.isNull(_cursorIndexOfPrivacy)) {
              _tmpPrivacy = null;
            } else {
              _tmpPrivacy = _cursor.getString(_cursorIndexOfPrivacy);
            }
            final String _tmpContentUrl;
            if (_cursor.isNull(_cursorIndexOfContentUrl)) {
              _tmpContentUrl = null;
            } else {
              _tmpContentUrl = _cursor.getString(_cursorIndexOfContentUrl);
            }
            final String _tmpContentType;
            if (_cursor.isNull(_cursorIndexOfContentType)) {
              _tmpContentType = null;
            } else {
              _tmpContentType = _cursor.getString(_cursorIndexOfContentType);
            }
            _result = new Post(_tmpId,_tmpAuthorId,_tmpTitle,_tmpBody,_tmpTime,_tmpPrivacy,_tmpContentUrl,_tmpContentType);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<Post>> getAllPost() {
    final String _sql = "SELECT * FROM post_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"post_table"}, new Callable<List<Post>>() {
      @Override
      public List<Post> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAuthorId = CursorUtil.getColumnIndexOrThrow(_cursor, "authorId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfPrivacy = CursorUtil.getColumnIndexOrThrow(_cursor, "privacy");
          final int _cursorIndexOfContentUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "contentUrl");
          final int _cursorIndexOfContentType = CursorUtil.getColumnIndexOrThrow(_cursor, "contentType");
          final List<Post> _result = new ArrayList<Post>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Post _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpAuthorId;
            if (_cursor.isNull(_cursorIndexOfAuthorId)) {
              _tmpAuthorId = null;
            } else {
              _tmpAuthorId = _cursor.getString(_cursorIndexOfAuthorId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpBody;
            if (_cursor.isNull(_cursorIndexOfBody)) {
              _tmpBody = null;
            } else {
              _tmpBody = _cursor.getString(_cursorIndexOfBody);
            }
            final long _tmpTime;
            _tmpTime = _cursor.getLong(_cursorIndexOfTime);
            final String _tmpPrivacy;
            if (_cursor.isNull(_cursorIndexOfPrivacy)) {
              _tmpPrivacy = null;
            } else {
              _tmpPrivacy = _cursor.getString(_cursorIndexOfPrivacy);
            }
            final String _tmpContentUrl;
            if (_cursor.isNull(_cursorIndexOfContentUrl)) {
              _tmpContentUrl = null;
            } else {
              _tmpContentUrl = _cursor.getString(_cursorIndexOfContentUrl);
            }
            final String _tmpContentType;
            if (_cursor.isNull(_cursorIndexOfContentType)) {
              _tmpContentType = null;
            } else {
              _tmpContentType = _cursor.getString(_cursorIndexOfContentType);
            }
            _item = new Post(_tmpId,_tmpAuthorId,_tmpTitle,_tmpBody,_tmpTime,_tmpPrivacy,_tmpContentUrl,_tmpContentType);
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

  @Override
  public Object getAllPostOf(final String userId,
      final Continuation<? super List<Post>> continuation) {
    final String _sql = "SELECT * FROM post_table WHERE authorId IS ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Post>>() {
      @Override
      public List<Post> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAuthorId = CursorUtil.getColumnIndexOrThrow(_cursor, "authorId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfPrivacy = CursorUtil.getColumnIndexOrThrow(_cursor, "privacy");
          final int _cursorIndexOfContentUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "contentUrl");
          final int _cursorIndexOfContentType = CursorUtil.getColumnIndexOrThrow(_cursor, "contentType");
          final List<Post> _result = new ArrayList<Post>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Post _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpAuthorId;
            if (_cursor.isNull(_cursorIndexOfAuthorId)) {
              _tmpAuthorId = null;
            } else {
              _tmpAuthorId = _cursor.getString(_cursorIndexOfAuthorId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpBody;
            if (_cursor.isNull(_cursorIndexOfBody)) {
              _tmpBody = null;
            } else {
              _tmpBody = _cursor.getString(_cursorIndexOfBody);
            }
            final long _tmpTime;
            _tmpTime = _cursor.getLong(_cursorIndexOfTime);
            final String _tmpPrivacy;
            if (_cursor.isNull(_cursorIndexOfPrivacy)) {
              _tmpPrivacy = null;
            } else {
              _tmpPrivacy = _cursor.getString(_cursorIndexOfPrivacy);
            }
            final String _tmpContentUrl;
            if (_cursor.isNull(_cursorIndexOfContentUrl)) {
              _tmpContentUrl = null;
            } else {
              _tmpContentUrl = _cursor.getString(_cursorIndexOfContentUrl);
            }
            final String _tmpContentType;
            if (_cursor.isNull(_cursorIndexOfContentType)) {
              _tmpContentType = null;
            } else {
              _tmpContentType = _cursor.getString(_cursorIndexOfContentType);
            }
            _item = new Post(_tmpId,_tmpAuthorId,_tmpTitle,_tmpBody,_tmpTime,_tmpPrivacy,_tmpContentUrl,_tmpContentType);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
