package Model;

import java.nio.file.Path;

public interface CanHandlePath {
    public void addPathElement(Path element);
    public void deletePathElement(Path element);
}
