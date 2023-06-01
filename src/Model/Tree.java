package Model;

import java.util.ArrayList;
import java.util.List;
public class Tree<T>{
    private int size;
    private MyNode<T> header;

    private class MyNode <G> {
        private G value;
        private MyNode<G> parent;
        private List<MyNode<G>> childrenList;

        public MyNode(G value, MyNode<G> parent) {
            this.value = value;
            this.parent = parent;
            this.childrenList = new ArrayList<>();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MyNode<T> getHeader() {
        return header;
    }

    public void setHeader(MyNode<T> header) {
        this.header = header;
    }
}
