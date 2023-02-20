package com.massage.massenger.data.repository_impl;

import com.massage.massenger.data.local.pref.UserDataSource;
import com.massage.massenger.data.local.room.dao.PostDao;
import com.massage.massenger.data.remote.api_service.post.PostApiService;
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
public final class PostRepository_Factory implements Factory<PostRepository> {
  private final Provider<PostApiService> postApiServiceProvider;

  private final Provider<UserDataSource> userDataSourceProvider;

  private final Provider<PostDao> postDaoProvider;

  public PostRepository_Factory(Provider<PostApiService> postApiServiceProvider,
      Provider<UserDataSource> userDataSourceProvider, Provider<PostDao> postDaoProvider) {
    this.postApiServiceProvider = postApiServiceProvider;
    this.userDataSourceProvider = userDataSourceProvider;
    this.postDaoProvider = postDaoProvider;
  }

  @Override
  public PostRepository get() {
    return newInstance(postApiServiceProvider.get(), userDataSourceProvider.get(), postDaoProvider.get());
  }

  public static PostRepository_Factory create(Provider<PostApiService> postApiServiceProvider,
      Provider<UserDataSource> userDataSourceProvider, Provider<PostDao> postDaoProvider) {
    return new PostRepository_Factory(postApiServiceProvider, userDataSourceProvider, postDaoProvider);
  }

  public static PostRepository newInstance(PostApiService postApiService,
      UserDataSource userDataSource, PostDao postDao) {
    return new PostRepository(postApiService, userDataSource, postDao);
  }
}
