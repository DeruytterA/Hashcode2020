package hashCode;

import hashCode.inputData.InputDataStructuur;
import hashCode.inputData.ReadFile;
import hashCode.outputData.OutputClass;
import hashCode.outputData.OutputDataStructuur;
import hashCode.outputData.WriteFile;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        for (String filename: args) {
            ReadFile readFile = new ReadFile(filename);
            readFile.doYourThing();
            Ontlener2 ontlener = new Ontlener2(readFile.data);
            WriteFile write = new WriteFile(ontlener.ontleen(),filename);
            write.doYourThing();
        }
    }
}

