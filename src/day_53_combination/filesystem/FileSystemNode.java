package day_53_combination.filesystem;

/**
 * Created by cnting on 2022/11/12
 * 文件和目录节点
 */
public abstract class FileSystemNode {
    protected String path;

    public FileSystemNode(String path) {
        this.path = path;
    }

    public abstract int countNumOfFiles() ;


    public abstract long countSizeOfFiles();

    public String getPath() {
        return path;
    }


}
