package com.example.invoker;

import com.example.command.Command;

public class FileInvoker {

  private Command command;

  public FileInvoker(Command command) {
    this.command = command;
  }

  public void execute() {
    this.command.execute();
  }
}
