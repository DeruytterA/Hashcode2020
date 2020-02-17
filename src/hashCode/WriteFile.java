package hashCode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile<T extends EenDataStructuur> extends AbstractReadWrite<T>{

    public WriteFile(T data, String filename) {
        super(data, filename);
    }

    @Override
    public void doYourThing() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            //todo shrijf shit naar data
        } catch (IOException e) {
            e.printStackTrace();
        }
        return;
    }

}
