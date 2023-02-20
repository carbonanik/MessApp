package com.massage.massenger.presentation.messaging.single_chat;

import com.massage.massenger.data.local.content.ExternalStorageImageProvider;
import com.massage.massenger.data.repository.AuthRepository;
import com.massage.massenger.data.repository_impl.ChatRepositoryImpl;
import com.massage.massenger.data.repository_impl.GroupRepository;
import com.massage.massenger.data.repository_impl.MessageRepository;
import com.massage.massenger.data.repository_impl.UserRepository;
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
public final class SingleChatViewModel_Factory implements Factory<SingleChatViewModel> {
  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<MessageRepository> messageRepositoryProvider;

  private final Provider<ChatRepositoryImpl> chatRepositoryProvider;

  private final Provider<GroupRepository> groupRepositoryProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  private final Provider<ExternalStorageImageProvider> externalStorageImageProvider;

  public SingleChatViewModel_Factory(Provider<AuthRepository> authRepositoryProvider,
      Provider<MessageRepository> messageRepositoryProvider,
      Provider<ChatRepositoryImpl> chatRepositoryProvider,
      Provider<GroupRepository> groupRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider,
      Provider<ExternalStorageImageProvider> externalStorageImageProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
    this.messageRepositoryProvider = messageRepositoryProvider;
    this.chatRepositoryProvider = chatRepositoryProvider;
    this.groupRepositoryProvider = groupRepositoryProvider;
    this.userRepositoryProvider = userRepositoryProvider;
    this.externalStorageImageProvider = externalStorageImageProvider;
  }

  @Override
  public SingleChatViewModel get() {
    return newInstance(authRepositoryProvider.get(), messageRepositoryProvider.get(), chatRepositoryProvider.get(), groupRepositoryProvider.get(), userRepositoryProvider.get(), externalStorageImageProvider.get());
  }

  public static SingleChatViewModel_Factory create(Provider<AuthRepository> authRepositoryProvider,
      Provider<MessageRepository> messageRepositoryProvider,
      Provider<ChatRepositoryImpl> chatRepositoryProvider,
      Provider<GroupRepository> groupRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider,
      Provider<ExternalStorageImageProvider> externalStorageImageProvider) {
    return new SingleChatViewModel_Factory(authRepositoryProvider, messageRepositoryProvider, chatRepositoryProvider, groupRepositoryProvider, userRepositoryProvider, externalStorageImageProvider);
  }

  public static SingleChatViewModel newInstance(AuthRepository authRepository,
      MessageRepository messageRepository, ChatRepositoryImpl chatRepository,
      GroupRepository groupRepository, UserRepository userRepository,
      ExternalStorageImageProvider externalStorageImageProvider) {
    return new SingleChatViewModel(authRepository, messageRepository, chatRepository, groupRepository, userRepository, externalStorageImageProvider);
  }
}
