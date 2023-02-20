package com.massage.massenger.data.repository_impl;

import com.massage.massenger.data.local.room.dao.ChatDao;
import com.massage.massenger.data.local.room.dao.MessageDao;
import com.massage.massenger.data.local.room.dao.UserDao;
import com.massage.massenger.data.remote.socket.KtorSocket;
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
public final class MessageRepository_Factory implements Factory<MessageRepository> {
  private final Provider<MessageDao> messageDaoProvider;

  private final Provider<ChatDao> chatDaoProvider;

  private final Provider<UserDao> userDaoProvider;

  private final Provider<KtorSocket> socketProvider;

  public MessageRepository_Factory(Provider<MessageDao> messageDaoProvider,
      Provider<ChatDao> chatDaoProvider, Provider<UserDao> userDaoProvider,
      Provider<KtorSocket> socketProvider) {
    this.messageDaoProvider = messageDaoProvider;
    this.chatDaoProvider = chatDaoProvider;
    this.userDaoProvider = userDaoProvider;
    this.socketProvider = socketProvider;
  }

  @Override
  public MessageRepository get() {
    return newInstance(messageDaoProvider.get(), chatDaoProvider.get(), userDaoProvider.get(), socketProvider.get());
  }

  public static MessageRepository_Factory create(Provider<MessageDao> messageDaoProvider,
      Provider<ChatDao> chatDaoProvider, Provider<UserDao> userDaoProvider,
      Provider<KtorSocket> socketProvider) {
    return new MessageRepository_Factory(messageDaoProvider, chatDaoProvider, userDaoProvider, socketProvider);
  }

  public static MessageRepository newInstance(MessageDao messageDao, ChatDao chatDao,
      UserDao userDao, KtorSocket socket) {
    return new MessageRepository(messageDao, chatDao, userDao, socket);
  }
}
