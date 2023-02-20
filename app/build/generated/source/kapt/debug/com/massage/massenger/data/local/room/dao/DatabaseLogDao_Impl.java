package com.massage.massenger.data.local.room.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.massage.massenger.model.DatabaseLog;
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
public final class DatabaseLogDao_Impl implements DatabaseLogDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DatabaseLog> __insertionAdapterOfDatabaseLog;

  private final SharedSQLiteStatement __preparedStmtOfDeleteOlder;

  public DatabaseLogDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDatabaseLog = new EntityInsertionAdapter<DatabaseLog>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `database_log_table` (`_id`,`timestamp`,`table_name`,`operation`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DatabaseLog value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getTimestamp());
        if (value.getTableName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTableName());
        }
        if (value.getOperation() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getOperation());
        }
      }
    };
    this.__preparedStmtOfDeleteOlder = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM database_log_table WHERE timestamp < ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertLog(final DatabaseLog log, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDatabaseLog.insert(log);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteOlder(final long timestamp, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteOlder.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, timestamp);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteOlder.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getLastTimeForTable(final String tableName, final String operation,
      final Continuation<? super List<DatabaseLog>> continuation) {
    final String _sql = "SELECT * FROM database_log_table WHERE table_name IS ? AND operation IS ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (tableName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, tableName);
    }
    _argIndex = 2;
    if (operation == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, operation);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<DatabaseLog>>() {
      @Override
      public List<DatabaseLog> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfTableName = CursorUtil.getColumnIndexOrThrow(_cursor, "table_name");
          final int _cursorIndexOfOperation = CursorUtil.getColumnIndexOrThrow(_cursor, "operation");
          final List<DatabaseLog> _result = new ArrayList<DatabaseLog>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DatabaseLog _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final String _tmpTableName;
            if (_cursor.isNull(_cursorIndexOfTableName)) {
              _tmpTableName = null;
            } else {
              _tmpTableName = _cursor.getString(_cursorIndexOfTableName);
            }
            final String _tmpOperation;
            if (_cursor.isNull(_cursorIndexOfOperation)) {
              _tmpOperation = null;
            } else {
              _tmpOperation = _cursor.getString(_cursorIndexOfOperation);
            }
            _item = new DatabaseLog(_tmpId,_tmpTimestamp,_tmpTableName,_tmpOperation);
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

  @Override
  public Object getLastItem(final Continuation<? super DatabaseLog> continuation) {
    final String _sql = "SELECT * FROM database_log_table WHERE timestamp=(SELECT max(timestamp) FROM database_log_table)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<DatabaseLog>() {
      @Override
      public DatabaseLog call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfTableName = CursorUtil.getColumnIndexOrThrow(_cursor, "table_name");
          final int _cursorIndexOfOperation = CursorUtil.getColumnIndexOrThrow(_cursor, "operation");
          final DatabaseLog _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final String _tmpTableName;
            if (_cursor.isNull(_cursorIndexOfTableName)) {
              _tmpTableName = null;
            } else {
              _tmpTableName = _cursor.getString(_cursorIndexOfTableName);
            }
            final String _tmpOperation;
            if (_cursor.isNull(_cursorIndexOfOperation)) {
              _tmpOperation = null;
            } else {
              _tmpOperation = _cursor.getString(_cursorIndexOfOperation);
            }
            _result = new DatabaseLog(_tmpId,_tmpTimestamp,_tmpTableName,_tmpOperation);
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
  public Flow<List<DatabaseLog>> getAllLog() {
    final String _sql = "SELECT * FROM database_log_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"database_log_table"}, new Callable<List<DatabaseLog>>() {
      @Override
      public List<DatabaseLog> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfTableName = CursorUtil.getColumnIndexOrThrow(_cursor, "table_name");
          final int _cursorIndexOfOperation = CursorUtil.getColumnIndexOrThrow(_cursor, "operation");
          final List<DatabaseLog> _result = new ArrayList<DatabaseLog>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DatabaseLog _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final String _tmpTableName;
            if (_cursor.isNull(_cursorIndexOfTableName)) {
              _tmpTableName = null;
            } else {
              _tmpTableName = _cursor.getString(_cursorIndexOfTableName);
            }
            final String _tmpOperation;
            if (_cursor.isNull(_cursorIndexOfOperation)) {
              _tmpOperation = null;
            } else {
              _tmpOperation = _cursor.getString(_cursorIndexOfOperation);
            }
            _item = new DatabaseLog(_tmpId,_tmpTimestamp,_tmpTableName,_tmpOperation);
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
}
