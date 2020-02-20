package hashCode.outputData;

public class OutputClass {
    public int ID;
    public int amountBooks;
    public int[] bookIDs;

    public OutputClass(int ID, int[] bookIDs) {
        this.ID = ID;
        this.amountBooks = bookIDs.length;
        this.bookIDs = bookIDs;
    }
}
