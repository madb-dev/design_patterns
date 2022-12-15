package com.example.command.impl;

import com.example.command.Command;
import com.example.filesystem.FileSystem;

public class CloseFile implements Command {

  private FileSystem fileSystem;

  public CloseFile(FileSystem fileSystem) {
    this.fileSystem = fileSystem;
  }

  @Override
  public void execute() {
    this.fileSystem.closeFile();
  }
}
