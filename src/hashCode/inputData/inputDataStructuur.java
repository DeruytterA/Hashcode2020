package hashCode.inputData;

import hashCode.EenDataStructuur;
import hashCode.Library;

import java.util.ArrayList;

public class inputDataStructuur extends EenDataStructuur {

    public inputDataStructuur(int[] books, ArrayList<Library> libraries, int amountDaysForScanning, int maxBoeken) {
        this.books = books;
        this.libraries = libraries;
        this.amountDaysForScanning = amountDaysForScanning;
        this.maxBoeken = maxBoeken;
    }

}
