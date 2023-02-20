package com.massage.massenger.data.repository_impl;

import com.massage.massenger.data.local.room.dao.ChatDao;
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
public final class ChatRepositoryImpl_Factory implements Factory<ChatRepositoryImpl> {
  private final Provider<ChatDao> chatDaoProvider;

  public ChatRepositoryImpl_Factory(Provider<ChatDao> chatDaoProvider) {
    this.chatDaoProvider = chatDaoProvider;
  }

  @Override
  public ChatRepositoryImpl get() {
    return newInstance(chatDaoProvider.get());
  }

  public static ChatRepositoryImpl_Factory create(Provider<ChatDao> chatDaoProvider) {
    return new ChatRepositoryImpl_Factory(chatDaoProvider);
  }

  public static ChatRepositoryImpl newInstance(ChatDao chatDao) {
    return new ChatRepositoryImpl(chatDao);
  }
}
