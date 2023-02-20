package com.massage.massenger.di;

import com.massage.massenger.data.local.room.MessengerDatabase;
import com.massage.massenger.data.local.room.dao.MessageDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideMessageDaoFactory implements Factory<MessageDao> {
  private final Provider<MessengerDatabase> databaseProvider;

  public DatabaseModule_ProvideMessageDaoFactory(Provider<MessengerDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public MessageDao get() {
    return provideMessageDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvideMessageDaoFactory create(
      Provider<MessengerDatabase> databaseProvider) {
    return new DatabaseModule_ProvideMessageDaoFactory(databaseProvider);
  }

  public static MessageDao provideMessageDao(MessengerDatabase database) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideMessageDao(database));
  }
}
