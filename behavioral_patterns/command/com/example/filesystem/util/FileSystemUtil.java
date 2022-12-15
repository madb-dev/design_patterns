package com.example.filesystem.util;

import com.example.filesystem.FileSystem;
import com.example.filesystem.impl.UnixFile;
import com.example.filesystem.impl.WindowsFile;

public class FileSystemUtil {

  public static FileSystem getFileSystem() {
    String osName = System.getProperty("os.name");
    System.out.println("OS is: " + osName);
    if (osName.contains("Windows")) {
      return new WindowsFile();
    } else {
      return new UnixFile();
    }
  }
}
