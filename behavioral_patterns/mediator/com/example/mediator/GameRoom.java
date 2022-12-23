package com.example.mediator;

import com.example.colleague.User;

public interface GameRoom {

  void sendMessage(String message, User user);

  void addPlayer(User user);
}
