package Model;

import MyUtil.Tree;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PathTree extends Tree<Path> implements CanDisplayPath, CanHandlePath {
    @Override
    public void buildFromPath(Path filePath) {
        List<Path> directories = Arrays.stream(filePath.toString().split("//|/|\\\\"))
                .map(Paths::get).toList();
    }

    //Рекурсивная функция обхода со сравнением значения, используется в findNode
    private static void dfs(Path value, TreeNode<Path> currNode, List<TreeNode<Path>> resultList) {
        if (currNode == null) return;
        if (currNode.getChildrenList().size() == 0) {
            if (value.equals(currNode.getValue())) {
                resultList.add(currNode);
            }
        } else {
            for (TreeNode<Path> e : resultList) {
                dfs(value, e, resultList);
            }
        }
    }

    public TreeNode<Path> findNode(Path desiredValue) {
        List<TreeNode<Path>> resultList = new ArrayList<>();
        dfs(desiredValue, this.getHeader(), resultList);
        if (resultList.size() == 1) {
            return resultList.get(0);
        } else {
            throw new RuntimeException();
        }
    }

    public TreeNode<Path> findClosestParentNode(TreeNode<Path> node) {
        List<>
    }

    @Override
    public void addPathElement(Path element) {
        if (this.size == 0) {
            this.setHeader(new TreeNode<>(element));
        }
        TreeNode<Path> parent = findNode(element.getParent().getFileName());

        this.size++;
    }

    @Override
    public void deletePathElement(Path element) {

    }
}
