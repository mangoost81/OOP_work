package Model.Service;

import java.io.Serializable;

public interface SavebleAndReadeble {
    boolean saveFile(Serializable serializable,String filepath);
    Object readFile(String filepath);
}
