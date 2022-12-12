package com.example.message.proxy;

import com.example.message.MessageService;
import com.example.message.impl.MessageServiceImpl;

public class ProxyMessageService implements MessageService {

  MessageService messageService;

  public ProxyMessageService() {
    this.messageService = new MessageServiceImpl();
  }

  @Override
  public String message() {
    String messageProxy = " through proxy";
    return messageService.message() + messageProxy;
  }
}
