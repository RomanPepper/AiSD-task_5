import java.util.ArrayList;
import java.util.List;

public class MyTree {
    MyNode header;
    private class MyNode <T> {
        private T value;
        private MyNode<T> parent;
        private List<MyNode<T>> childrenList;

        public MyNode(T value, MyNode<T> parent) {
            this.value = value;
            this.parent = parent;
            this.childrenList = new ArrayList<>();
        }
    }
}
