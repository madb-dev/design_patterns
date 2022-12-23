package com.example.colleague.impl;

import com.example.colleague.User;
import com.example.mediator.GameRoom;

public class Player extends User {
  private String name;
  private GameRoom gameRoom;

  public Player(String name, GameRoom gameRoom) {
    this.name = name;
    this.gameRoom = gameRoom;
  }

  @Override
  public String getUserName() {
    return this.name;
  }

  @Override
  public void sendMessage(String message) {
    gameRoom.sendMessage(message, this);
  }
}
