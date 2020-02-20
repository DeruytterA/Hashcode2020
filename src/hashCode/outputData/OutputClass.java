package hashCode.outputData;

public class OutputClass {

    public int ID;
    public int amountBooks;
    public Integer[] bookIDs;

    public OutputClass(int ID, Integer[] bookIDs) {
        this.ID = ID;
        this.amountBooks = bookIDs.length;
        this.bookIDs = bookIDs;
    }
}
