package hashCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile<T extends EenDataStructuur> extends AbstractReadWrite<T>{

    public ReadFile(T data, String filename) {
        super(data,in+filename);
    }

    @Override
    public void doYourThing() {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(pathname))){
            line = reader.readLine();
            int[] items = getInts(line.split(" "));
            int[items[0]] books;
            Library[items[1]] libraries;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return;
    }

}
