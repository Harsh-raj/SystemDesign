package LLD.Composite.StorageFileSystem;

public class File implements FileSystem {

    String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print(" ");
        }
        System.out.println("-"+this.name);
    }

    @Override
    public void ls() {
        ls(0);
    }
}
