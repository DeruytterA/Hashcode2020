package hashCode.inputData;

import hashCode.AbstractReadWrite;
import hashCode.EenDataStructuur;
import hashCode.Library;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile extends AbstractReadWrite {

    public ReadFile(String filename) {
        super(in+filename);
    }

    @Override
    public void doYourThing() {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(pathname))){
            Integer[] items = getInts(reader.readLine());
            Integer[] books = getInts(reader.readLine());
            ArrayList<Library> libraries = new ArrayList<>();
            Integer[] temp;
            int max = 0;
            for (int i = 0; i < items[1] ; i++) {
                temp = getInts(reader.readLine());
                Integer[] ints = getInts(reader.readLine());
                if (ints.length > max){
                    max = ints.length;
                }
                libraries.add(new Library(temp[0],temp[1],temp[2],ints,i));
            }
            data = new InputDataStructuur(books,libraries,items[2],max);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return;
    }

    public Integer[] getInts(String input){
        String[] now =  input.split(" ");
        Integer[] res = new Integer[now.length];
        for (int i = 0; i < now.length; i++) {
            res[i] = Integer.parseInt(now[i]);
        }
        return res;
    }

}
