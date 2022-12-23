package com.example.mediator.impl;

import com.example.colleague.User;
import com.example.mediator.GameRoom;
import java.util.ArrayList;
import java.util.List;

public class GameRoomImpl implements GameRoom {
  List<User> players;

  public GameRoomImpl() {
    this.players = new ArrayList<>();
  }

  @Override
  public void sendMessage(String message, User user) {
    for (User player : players) {
      if (!player.getUserName().equals(user.getUserName())) {
        System.out.println(user.getUserName() + " sending message: " + message + " for player: "
            + player.getUserName());
      }
    }
  }

  @Override
  public void addPlayer(User user) {
    players.add(user);
  }
}
