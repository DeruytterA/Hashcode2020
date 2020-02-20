package hashCode.inputData;

import hashCode.AbstractReadWrite;
import hashCode.EenDataStructuur;
import hashCode.Library;
import hashCode.inputData.inputDataStructuur;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile<T extends EenDataStructuur> extends AbstractReadWrite<T> {

    public ReadFile(T data, String filename) {
        super(data,in+filename);
    }

    @Override
    public void doYourThing() {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(pathname))){
            int[] items = getInts(reader.readLine());
            int[] books = getInts(reader.readLine());
            ArrayList<Library> libraries = new ArrayList<>();
            int[] temp;
            int max = 0;
            for (int i = 0; i < items[1] ; i++) {
                temp = getInts(reader.readLine());
                int[] ints = getInts(reader.readLine());
                if (ints.length > max){
                    max = ints.length;
                }
                libraries.add(new Library(temp[0],temp[1],temp[2],ints,i));
            }

            data = new inputDataStructuur(books,libraries,items[2],max);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return;
    }

    public int[] getInts(String input){
        String[] now =  input.split(" ");
        int[] res = new int[now.length];
        for (int i = 0; i < now.length; i++) {
            res[i] = Integer.parseInt(now[i]);
        }
        return res;
    }

}
