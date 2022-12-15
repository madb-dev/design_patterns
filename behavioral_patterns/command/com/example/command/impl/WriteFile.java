package com.example.command.impl;

import com.example.command.Command;
import com.example.filesystem.FileSystem;

public class WriteFile implements Command {

  private FileSystem fileSystem;

  public WriteFile(FileSystem fileSystem) {
    this.fileSystem = fileSystem;
  }

  @Override
  public void execute() {
    this.fileSystem.writeFile();
  }
}
