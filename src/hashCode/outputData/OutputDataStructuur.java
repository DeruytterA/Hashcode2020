package hashCode.outputData;

import hashCode.EenDataStructuur;

import java.util.ArrayList;


public class OutputDataStructuur extends EenDataStructuur {
    public int amountLibraries;
    public ArrayList<OutputClass> data;

    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append(amountLibraries).append("\n");
        OutputClass klasse;
        for (int i = 0; i < amountLibraries; i++) {
            klasse = data.get(i);
            string.append(klasse.ID).append(" ").append(klasse.amountBooks).append("\n");
            string.append();
        }
        return string.toString();
    }
    
    private String toText(OutputClass klasse){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(klasse.bookIDs[0]);
        for (int i = 0; i < ; i++) {
            
        }
    }
}
