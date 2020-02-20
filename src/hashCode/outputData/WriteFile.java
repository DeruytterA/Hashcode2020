package hashCode.outputData;

import hashCode.AbstractReadWrite;
import hashCode.EenDataStructuur;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile extends AbstractReadWrite{

    public WriteFile(OutputDataStructuur data, String filename) {
        super(out+filename);
        this.data = data;
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
