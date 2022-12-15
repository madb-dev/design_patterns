import com.example.command.impl.CloseFile;
import com.example.command.impl.OpenFile;
import com.example.command.impl.WriteFile;
import com.example.filesystem.FileSystem;
import com.example.filesystem.util.FileSystemUtil;
import com.example.invoker.FileInvoker;

public class Main {

  public static void main(String[] args) {

    FileSystem fileSystem = FileSystemUtil.getFileSystem();

    OpenFile openCommand = new OpenFile(fileSystem);
    FileInvoker file = new FileInvoker(openCommand);
    file.execute();

    WriteFile writeCommand = new WriteFile(fileSystem);
    file = new FileInvoker(writeCommand);
    file.execute();

    CloseFile closeCommand = new CloseFile(fileSystem);
    file = new FileInvoker(closeCommand);
    file.execute();
  }
}
