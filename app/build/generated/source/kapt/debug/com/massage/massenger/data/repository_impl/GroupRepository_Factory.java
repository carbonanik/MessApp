package com.massage.massenger.data.repository_impl;

import com.massage.massenger.data.local.pref.UserDataSource;
import com.massage.massenger.data.local.room.dao.ChatDao;
import com.massage.massenger.data.local.room.dao.GroupDao;
import com.massage.massenger.data.remote.api_service.group.GroupApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class GroupRepository_Factory implements Factory<GroupRepository> {
  private final Provider<UserDataSource> userDataSourceProvider;

  private final Provider<GroupApiService> groupApiServiceProvider;

  private final Provider<ChatDao> chatDaoProvider;

  private final Provider<GroupDao> groupDaoProvider;

  public GroupRepository_Factory(Provider<UserDataSource> userDataSourceProvider,
      Provider<GroupApiService> groupApiServiceProvider, Provider<ChatDao> chatDaoProvider,
      Provider<GroupDao> groupDaoProvider) {
    this.userDataSourceProvider = userDataSourceProvider;
    this.groupApiServiceProvider = groupApiServiceProvider;
    this.chatDaoProvider = chatDaoProvider;
    this.groupDaoProvider = groupDaoProvider;
  }

  @Override
  public GroupRepository get() {
    return newInstance(userDataSourceProvider.get(), groupApiServiceProvider.get(), chatDaoProvider.get(), groupDaoProvider.get());
  }

  public static GroupRepository_Factory create(Provider<UserDataSource> userDataSourceProvider,
      Provider<GroupApiService> groupApiServiceProvider, Provider<ChatDao> chatDaoProvider,
      Provider<GroupDao> groupDaoProvider) {
    return new GroupRepository_Factory(userDataSourceProvider, groupApiServiceProvider, chatDaoProvider, groupDaoProvider);
  }

  public static GroupRepository newInstance(UserDataSource userDataSource,
      GroupApiService groupApiService, ChatDao chatDao, GroupDao groupDao) {
    return new GroupRepository(userDataSource, groupApiService, chatDao, groupDao);
  }
}
