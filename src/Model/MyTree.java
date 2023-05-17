package Model;

import java.util.ArrayList;
import java.util.List;
public class MyTree <T>{
    int size;
    MyNode<T> header;
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
}
