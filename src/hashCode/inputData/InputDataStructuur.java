package hashCode.inputData;

import hashCode.EenDataStructuur;
import hashCode.Library;

import java.util.ArrayList;

public class InputDataStructuur extends EenDataStructuur {

    public InputDataStructuur(Integer[] books, ArrayList<Library> libraries, int amountDaysForScanning, int maxBoeken) {
        this.books = books;
        this.libraries = libraries;
        this.amountDaysForScanning = amountDaysForScanning;
        this.maxBoeken = maxBoeken;
    }

}
