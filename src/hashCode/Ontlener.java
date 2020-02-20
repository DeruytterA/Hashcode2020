package hashCode;

import java.util.ArrayList;
import java.util.Comparator;

public class Ontlener {

    private ArrayList<Library> libraries;
    private int[] books; // Hierin staat de score van de boeken
    private int deadline;
    public ArrayList<Integer> ontleendVan;
    public int[][] ontleendPerLibrary; // plaats in list is index van library
    private int maxBoeken;

    public Ontlener(EenDataStructuur data) {
        this.maxBoeken = data.maxBoeken;
        this.libraries = data.libraries;
        this.books = data.books;
        this.deadline = data.amountDaysForScanning;
        this.ontleendVan = new ArrayList<>();
        this.ontleendPerLibrary = new int[libraries.size()][maxBoeken + 1]; // Om op het einde -1 te zetten (zodat we weten dat het gedaan is)

    }

    public void ontleen() {
        int currentDay = 0;
        libraries.sort(this::compareLibs);
        for (Library lib : libraries) {
            if (deadline < currentDay) {
                return;
            } else {
                currentDay += signup(lib);
                pickBooks(lib); // Alle boeken, negeer deadline
            }
        }
    }

    public int signup(Library lib) {
        ontleendVan.add(lib.index);
        return lib.singupTime;
    }

    public void pickBooks(Library lib) {
        ontleendPerLibrary[lib.index] = lib.catalogus;
    }

    public double maakLibraryScore(Library lib) {
        double score;
        score = ((double) lib.amountBooks * lib.rate * lib.rate) / ((double) lib.singupTime / deadline); //TODO: sum van catalogussen bijvoegen
        return score;
    }

    public int compareLibs(Library lib1, Library lib2) {
        double lib1score = maakLibraryScore(lib1);
        double lib2score = maakLibraryScore(lib2);
        return -Double.compare(lib1score, lib2score); // sorted groot naar klein
    }

}
