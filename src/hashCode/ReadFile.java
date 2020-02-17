package hashCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile<T extends EenDataStructuur> extends AbstractReadWrite<T>{

    public ReadFile(T data, String filename) {
        super(data,filename);
    }

    @Override
    public void doYourThing() {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            while((line = reader.readLine()) != null) {
                //todo do something with the read line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return;
    }

}
