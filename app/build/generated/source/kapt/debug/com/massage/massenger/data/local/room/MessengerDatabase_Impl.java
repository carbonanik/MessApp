package com.massage.massenger.data.local.room;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.massage.massenger.data.local.room.dao.ChatDao;
import com.massage.massenger.data.local.room.dao.ChatDao_Impl;
import com.massage.massenger.data.local.room.dao.DatabaseLogDao;
import com.massage.massenger.data.local.room.dao.DatabaseLogDao_Impl;
import com.massage.massenger.data.local.room.dao.GroupDao;
import com.massage.massenger.data.local.room.dao.GroupDao_Impl;
import com.massage.massenger.data.local.room.dao.MessageDao;
import com.massage.massenger.data.local.room.dao.MessageDao_Impl;
import com.massage.massenger.data.local.room.dao.PostDao;
import com.massage.massenger.data.local.room.dao.PostDao_Impl;
import com.massage.massenger.data.local.room.dao.UserDao;
import com.massage.massenger.data.local.room.dao.UserDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MessengerDatabase_Impl extends MessengerDatabase {
  private volatile UserDao _userDao;

  private volatile MessageDao _messageDao;

  private volatile ChatDao _chatDao;

  private volatile GroupDao _groupDao;

  private volatile PostDao _postDao;

  private volatile DatabaseLogDao _databaseLogDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `message_table` (`id` TEXT NOT NULL, `chatId` TEXT NOT NULL, `authorId` TEXT NOT NULL, `authorName` TEXT NOT NULL, `text` TEXT, `mediaUrl` TEXT, `cacheMediaUri` TEXT, `mediaType` TEXT, `timestamp` INTEGER NOT NULL, `date` TEXT, `time` TEXT, `status` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `chat_table` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `type` TEXT NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `status` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `connection_table` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `phone` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `group_table` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `admin` TEXT NOT NULL, `members` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `post_table` (`id` TEXT NOT NULL, `authorId` TEXT NOT NULL, `title` TEXT NOT NULL, `body` TEXT NOT NULL, `time` INTEGER NOT NULL, `privacy` TEXT NOT NULL, `contentUrl` TEXT NOT NULL, `contentType` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `database_log_table` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` INTEGER NOT NULL, `table_name` TEXT NOT NULL, `operation` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b25f32db4e3d47f2b9b22909bbbc9ad6')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `message_table`");
        _db.execSQL("DROP TABLE IF EXISTS `chat_table`");
        _db.execSQL("DROP TABLE IF EXISTS `connection_table`");
        _db.execSQL("DROP TABLE IF EXISTS `group_table`");
        _db.execSQL("DROP TABLE IF EXISTS `post_table`");
        _db.execSQL("DROP TABLE IF EXISTS `database_log_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMessageTable = new HashMap<String, TableInfo.Column>(12);
        _columnsMessageTable.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMessageTable.put("chatId", new TableInfo.Column("chatId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMessageTable.put("authorId", new TableInfo.Column("authorId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMessageTable.put("authorName", new TableInfo.Column("authorName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMessageTable.put("text", new TableInfo.Column("text", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMessageTable.put("mediaUrl", new TableInfo.Column("mediaUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMessageTable.put("cacheMediaUri", new TableInfo.Column("cacheMediaUri", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMessageTable.put("mediaType", new TableInfo.Column("mediaType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMessageTable.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMessageTable.put("date", new TableInfo.Column("date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMessageTable.put("time", new TableInfo.Column("time", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMessageTable.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMessageTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMessageTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMessageTable = new TableInfo("message_table", _columnsMessageTable, _foreignKeysMessageTable, _indicesMessageTable);
        final TableInfo _existingMessageTable = TableInfo.read(_db, "message_table");
        if (! _infoMessageTable.equals(_existingMessageTable)) {
          return new RoomOpenHelper.ValidationResult(false, "message_table(com.massage.massenger.model.ChatMessage).\n"
                  + " Expected:\n" + _infoMessageTable + "\n"
                  + " Found:\n" + _existingMessageTable);
        }
        final HashMap<String, TableInfo.Column> _columnsChatTable = new HashMap<String, TableInfo.Column>(6);
        _columnsChatTable.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatTable.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatTable.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatTable.put("message", new TableInfo.Column("message", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatTable.put("time", new TableInfo.Column("time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatTable.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysChatTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesChatTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoChatTable = new TableInfo("chat_table", _columnsChatTable, _foreignKeysChatTable, _indicesChatTable);
        final TableInfo _existingChatTable = TableInfo.read(_db, "chat_table");
        if (! _infoChatTable.equals(_existingChatTable)) {
          return new RoomOpenHelper.ValidationResult(false, "chat_table(com.massage.massenger.model.Chat).\n"
                  + " Expected:\n" + _infoChatTable + "\n"
                  + " Found:\n" + _existingChatTable);
        }
        final HashMap<String, TableInfo.Column> _columnsConnectionTable = new HashMap<String, TableInfo.Column>(3);
        _columnsConnectionTable.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsConnectionTable.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsConnectionTable.put("phone", new TableInfo.Column("phone", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysConnectionTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesConnectionTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoConnectionTable = new TableInfo("connection_table", _columnsConnectionTable, _foreignKeysConnectionTable, _indicesConnectionTable);
        final TableInfo _existingConnectionTable = TableInfo.read(_db, "connection_table");
        if (! _infoConnectionTable.equals(_existingConnectionTable)) {
          return new RoomOpenHelper.ValidationResult(false, "connection_table(com.massage.massenger.model.User).\n"
                  + " Expected:\n" + _infoConnectionTable + "\n"
                  + " Found:\n" + _existingConnectionTable);
        }
        final HashMap<String, TableInfo.Column> _columnsGroupTable = new HashMap<String, TableInfo.Column>(4);
        _columnsGroupTable.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupTable.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupTable.put("admin", new TableInfo.Column("admin", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupTable.put("members", new TableInfo.Column("members", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGroupTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGroupTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGroupTable = new TableInfo("group_table", _columnsGroupTable, _foreignKeysGroupTable, _indicesGroupTable);
        final TableInfo _existingGroupTable = TableInfo.read(_db, "group_table");
        if (! _infoGroupTable.equals(_existingGroupTable)) {
          return new RoomOpenHelper.ValidationResult(false, "group_table(com.massage.massenger.model.Group).\n"
                  + " Expected:\n" + _infoGroupTable + "\n"
                  + " Found:\n" + _existingGroupTable);
        }
        final HashMap<String, TableInfo.Column> _columnsPostTable = new HashMap<String, TableInfo.Column>(8);
        _columnsPostTable.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPostTable.put("authorId", new TableInfo.Column("authorId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPostTable.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPostTable.put("body", new TableInfo.Column("body", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPostTable.put("time", new TableInfo.Column("time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPostTable.put("privacy", new TableInfo.Column("privacy", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPostTable.put("contentUrl", new TableInfo.Column("contentUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPostTable.put("contentType", new TableInfo.Column("contentType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPostTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPostTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPostTable = new TableInfo("post_table", _columnsPostTable, _foreignKeysPostTable, _indicesPostTable);
        final TableInfo _existingPostTable = TableInfo.read(_db, "post_table");
        if (! _infoPostTable.equals(_existingPostTable)) {
          return new RoomOpenHelper.ValidationResult(false, "post_table(com.massage.massenger.model.Post).\n"
                  + " Expected:\n" + _infoPostTable + "\n"
                  + " Found:\n" + _existingPostTable);
        }
        final HashMap<String, TableInfo.Column> _columnsDatabaseLogTable = new HashMap<String, TableInfo.Column>(4);
        _columnsDatabaseLogTable.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatabaseLogTable.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatabaseLogTable.put("table_name", new TableInfo.Column("table_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatabaseLogTable.put("operation", new TableInfo.Column("operation", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDatabaseLogTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDatabaseLogTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDatabaseLogTable = new TableInfo("database_log_table", _columnsDatabaseLogTable, _foreignKeysDatabaseLogTable, _indicesDatabaseLogTable);
        final TableInfo _existingDatabaseLogTable = TableInfo.read(_db, "database_log_table");
        if (! _infoDatabaseLogTable.equals(_existingDatabaseLogTable)) {
          return new RoomOpenHelper.ValidationResult(false, "database_log_table(com.massage.massenger.model.DatabaseLog).\n"
                  + " Expected:\n" + _infoDatabaseLogTable + "\n"
                  + " Found:\n" + _existingDatabaseLogTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "b25f32db4e3d47f2b9b22909bbbc9ad6", "40a6309b90b3d5eb432770a21c0236b2");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "message_table","chat_table","connection_table","group_table","post_table","database_log_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `message_table`");
      _db.execSQL("DELETE FROM `chat_table`");
      _db.execSQL("DELETE FROM `connection_table`");
      _db.execSQL("DELETE FROM `group_table`");
      _db.execSQL("DELETE FROM `post_table`");
      _db.execSQL("DELETE FROM `database_log_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(UserDao.class, UserDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(MessageDao.class, MessageDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ChatDao.class, ChatDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(GroupDao.class, GroupDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PostDao.class, PostDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(DatabaseLogDao.class, DatabaseLogDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public MessageDao messageDao() {
    if (_messageDao != null) {
      return _messageDao;
    } else {
      synchronized(this) {
        if(_messageDao == null) {
          _messageDao = new MessageDao_Impl(this);
        }
        return _messageDao;
      }
    }
  }

  @Override
  public ChatDao chatDao() {
    if (_chatDao != null) {
      return _chatDao;
    } else {
      synchronized(this) {
        if(_chatDao == null) {
          _chatDao = new ChatDao_Impl(this);
        }
        return _chatDao;
      }
    }
  }

  @Override
  public GroupDao groupDao() {
    if (_groupDao != null) {
      return _groupDao;
    } else {
      synchronized(this) {
        if(_groupDao == null) {
          _groupDao = new GroupDao_Impl(this);
        }
        return _groupDao;
      }
    }
  }

  @Override
  public PostDao postDao() {
    if (_postDao != null) {
      return _postDao;
    } else {
      synchronized(this) {
        if(_postDao == null) {
          _postDao = new PostDao_Impl(this);
        }
        return _postDao;
      }
    }
  }

  @Override
  public DatabaseLogDao databaseLogDao() {
    if (_databaseLogDao != null) {
      return _databaseLogDao;
    } else {
      synchronized(this) {
        if(_databaseLogDao == null) {
          _databaseLogDao = new DatabaseLogDao_Impl(this);
        }
        return _databaseLogDao;
      }
    }
  }
}
