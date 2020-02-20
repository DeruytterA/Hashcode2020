package hashCode;

public class Library {

    public int amountBooks;
    public int singupTime;
    public int rate;
    public Integer[] catalogus;
    public int index;

    public Library(int amountBooks, int singupTime, int rate, Integer[] catalogus, int index) {
        this.amountBooks = amountBooks;
        System.out.println("aantal: " + amountBooks);
        this.singupTime = singupTime;
        this.rate = rate;
        this.catalogus = catalogus;
        this.index = index;
    }

}
