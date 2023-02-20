package com.massage.massenger.data.repository_impl;

import com.massage.massenger.data.local.content.ContactDataSource;
import com.massage.massenger.data.local.pref.UserDataSource;
import com.massage.massenger.data.local.room.dao.UserDao;
import com.massage.massenger.data.remote.api_service.user.UserApiService;
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
public final class UserRepository_Factory implements Factory<UserRepository> {
  private final Provider<UserDataSource> userDataSourceProvider;

  private final Provider<UserDao> userDaoProvider;

  private final Provider<UserApiService> userApiServiceProvider;

  private final Provider<ContactDataSource> contactDataSourceProvider;

  public UserRepository_Factory(Provider<UserDataSource> userDataSourceProvider,
      Provider<UserDao> userDaoProvider, Provider<UserApiService> userApiServiceProvider,
      Provider<ContactDataSource> contactDataSourceProvider) {
    this.userDataSourceProvider = userDataSourceProvider;
    this.userDaoProvider = userDaoProvider;
    this.userApiServiceProvider = userApiServiceProvider;
    this.contactDataSourceProvider = contactDataSourceProvider;
  }

  @Override
  public UserRepository get() {
    return newInstance(userDataSourceProvider.get(), userDaoProvider.get(), userApiServiceProvider.get(), contactDataSourceProvider.get());
  }

  public static UserRepository_Factory create(Provider<UserDataSource> userDataSourceProvider,
      Provider<UserDao> userDaoProvider, Provider<UserApiService> userApiServiceProvider,
      Provider<ContactDataSource> contactDataSourceProvider) {
    return new UserRepository_Factory(userDataSourceProvider, userDaoProvider, userApiServiceProvider, contactDataSourceProvider);
  }

  public static UserRepository newInstance(UserDataSource userDataSource, UserDao userDao,
      UserApiService userApiService, ContactDataSource contactDataSource) {
    return new UserRepository(userDataSource, userDao, userApiService, contactDataSource);
  }
}
