import Model.PathTree;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        PathTree pathTree = new PathTree();
        pathTree.buildFromPath(Paths.get("C:\\Users\\Username\\Desktop\\testFile.txt"));
    }
}