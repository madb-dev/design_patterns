package com.example.message.impl;

import com.example.message.MessageService;

public class MessageServiceImpl implements MessageService {

  private String message;

  @Override
  public String message() {
    message = "Sending direct message...";
    return message;
  }
}
