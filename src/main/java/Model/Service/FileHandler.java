package Model.Service;

import java.io.*;

public class FileHandler implements SavebleAndReadeble{
    public boolean saveFile(Serializable serializable, String filePath) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream
                (new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(serializable);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Object readFile(String filePath) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream
                (new FileInputStream(filePath))) {
            return objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
