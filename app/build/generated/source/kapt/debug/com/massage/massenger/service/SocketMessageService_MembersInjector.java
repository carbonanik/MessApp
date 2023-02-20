package com.massage.massenger.service;

import com.massage.massenger.data.repository_impl.MessageRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
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
public final class SocketMessageService_MembersInjector implements MembersInjector<SocketMessageService> {
  private final Provider<MessageRepository> messageRepositoryProvider;

  private final Provider<IncomingMessageNotificationManager> messageNotificationManagerProvider;

  public SocketMessageService_MembersInjector(Provider<MessageRepository> messageRepositoryProvider,
      Provider<IncomingMessageNotificationManager> messageNotificationManagerProvider) {
    this.messageRepositoryProvider = messageRepositoryProvider;
    this.messageNotificationManagerProvider = messageNotificationManagerProvider;
  }

  public static MembersInjector<SocketMessageService> create(
      Provider<MessageRepository> messageRepositoryProvider,
      Provider<IncomingMessageNotificationManager> messageNotificationManagerProvider) {
    return new SocketMessageService_MembersInjector(messageRepositoryProvider, messageNotificationManagerProvider);
  }

  @Override
  public void injectMembers(SocketMessageService instance) {
    injectMessageRepository(instance, messageRepositoryProvider.get());
    injectMessageNotificationManager(instance, messageNotificationManagerProvider.get());
  }

  @InjectedFieldSignature("com.massage.massenger.service.SocketMessageService.messageRepository")
  public static void injectMessageRepository(SocketMessageService instance,
      MessageRepository messageRepository) {
    instance.messageRepository = messageRepository;
  }

  @InjectedFieldSignature("com.massage.massenger.service.SocketMessageService.messageNotificationManager")
  public static void injectMessageNotificationManager(SocketMessageService instance,
      IncomingMessageNotificationManager messageNotificationManager) {
    instance.messageNotificationManager = messageNotificationManager;
  }
}
