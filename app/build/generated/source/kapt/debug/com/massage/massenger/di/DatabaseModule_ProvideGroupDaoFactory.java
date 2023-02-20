package com.massage.massenger.di;

import com.massage.massenger.data.local.room.MessengerDatabase;
import com.massage.massenger.data.local.room.dao.GroupDao;
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
public final class DatabaseModule_ProvideGroupDaoFactory implements Factory<GroupDao> {
  private final Provider<MessengerDatabase> databaseProvider;

  public DatabaseModule_ProvideGroupDaoFactory(Provider<MessengerDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public GroupDao get() {
    return provideGroupDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvideGroupDaoFactory create(
      Provider<MessengerDatabase> databaseProvider) {
    return new DatabaseModule_ProvideGroupDaoFactory(databaseProvider);
  }

  public static GroupDao provideGroupDao(MessengerDatabase database) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideGroupDao(database));
  }
}
