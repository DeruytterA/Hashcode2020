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
            Ontlener ontlener = new Ontlener(readFile.data);
            OutputDataStructuur outputDataStructuur = new OutputDataStructuur(ontlener.ontleen());
            WriteFile write = new WriteFile(outputDataStructuur, filename);
            write.doYourThing();
        }
    }
}

