package com.massage.massenger.di;

import com.massage.massenger.data.local.room.MessengerDatabase;
import com.massage.massenger.data.local.room.dao.UserDao;
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
public final class DatabaseModule_ProvideConnectionDaoFactory implements Factory<UserDao> {
  private final Provider<MessengerDatabase> databaseProvider;

  public DatabaseModule_ProvideConnectionDaoFactory(Provider<MessengerDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public UserDao get() {
    return provideConnectionDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvideConnectionDaoFactory create(
      Provider<MessengerDatabase> databaseProvider) {
    return new DatabaseModule_ProvideConnectionDaoFactory(databaseProvider);
  }

  public static UserDao provideConnectionDao(MessengerDatabase database) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideConnectionDao(database));
  }
}
