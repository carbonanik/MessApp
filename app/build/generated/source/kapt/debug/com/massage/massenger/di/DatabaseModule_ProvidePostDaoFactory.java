package com.massage.massenger.di;

import com.massage.massenger.data.local.room.MessengerDatabase;
import com.massage.massenger.data.local.room.dao.PostDao;
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
public final class DatabaseModule_ProvidePostDaoFactory implements Factory<PostDao> {
  private final Provider<MessengerDatabase> databaseProvider;

  public DatabaseModule_ProvidePostDaoFactory(Provider<MessengerDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public PostDao get() {
    return providePostDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvidePostDaoFactory create(
      Provider<MessengerDatabase> databaseProvider) {
    return new DatabaseModule_ProvidePostDaoFactory(databaseProvider);
  }

  public static PostDao providePostDao(MessengerDatabase database) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.providePostDao(database));
  }
}
