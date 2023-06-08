package MyUtil;

import java.util.ArrayList;
import java.util.List;
public abstract class Tree<T>{
    protected int size;
    private TreeNode<T> header;

    protected static class TreeNode<G> {
        private G value;
        private List<TreeNode<G>> childrenList;

        public TreeNode(G value) {
            this.value = value;
            this.childrenList = new ArrayList<>();
        }

        public G getValue() {
            return value;
        }

        public void setValue(G value) {
            this.value = value;
        }

        public List<TreeNode<G>> getChildrenList() {
            return childrenList;
        }

        public void setChildrenList(List<TreeNode<G>> childrenList) {
            this.childrenList = childrenList;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public TreeNode<T> getHeader() {
        return header;
    }

    public void setHeader(TreeNode<T> header) {
        this.header = header;
    }
}
