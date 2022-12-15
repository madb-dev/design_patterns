package com.example.command.impl;

import com.example.command.Command;
import com.example.filesystem.FileSystem;

public class OpenFile implements Command {

  private FileSystem fileSystem;

  public OpenFile(FileSystem fileSystem) {
    this.fileSystem = fileSystem;
  }

  @Override
  public void execute() {
    this.fileSystem.openFile();
  }
}
