package LLD.Composite.StorageFileSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directory implements FileSystem{

    String name;
    List<FileSystem> subDirectories;

    static int level;

    public Directory(String name) {
        this.name = Objects.requireNonNullElse(name, "newDirectory");
        subDirectories = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = Objects.requireNonNullElse(name, this.name);
    }

    public Directory add(FileSystem newFileSystemObj) {
        subDirectories.add(newFileSystemObj);
        return this;
    }

    @Override
    public void ls() { //meant to be called
        ls(0);
    }

    public void ls(int level) {
        // Print the current directory/file name with the proper indentation
        for (int i = 0; i < level; i++) {
            System.out.print(" ");
        }
        System.out.println(this.name);

        // Recursively call ls on subdirectories/files with incremented level
        for (FileSystem filesystemObj : subDirectories) {
            filesystemObj.ls(level + 1);
        }
    }
}
