package hashCode.outputData;

import hashCode.AbstractReadWrite;
import hashCode.EenDataStructuur;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile<T extends EenDataStructuur> extends AbstractReadWrite<T> {

    public WriteFile(T data, String filename) {
        super(data, out+filename);
    }

    @Override
    public void doYourThing() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathname))){
            writer.write(data.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
