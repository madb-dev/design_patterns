package com.example.channel;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class TwitchChannel extends Observable {

  private String message;
  private String title;
  private List<Observer> channelSubscribers;

  @Override
  public synchronized void addObserver(Observer o) {
    super.addObserver(o);
  }

  @Override
  public synchronized void deleteObserver(Observer o) {
    super.deleteObserver(o);
  }

  @Override
  public void notifyObservers(Object arg) {
    this.title = (String) arg;
    setChanged();
    super.notifyObservers(title);
  }
}
