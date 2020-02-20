package hashCode;

import hashCode.outputData.OutputClass;

import java.util.*;
import java.lang.reflect.Array;
import java.util.concurrent.ThreadLocalRandom;

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

    public ArrayList<OutputClass> ontleen() {
        int currentDay = 0;
        libraries.sort(this::compareLibs);
        for (Library lib : libraries) {
            if (deadline < currentDay) {
                break; // Ik ga niet akkoord met deze Code ~ Arno
            } else {
                currentDay += signup(lib);
                pickBooks(lib); // Alle boeken, negeer deadline
            }
        }
        return maakOutputClasses();
    }

    public int signup(Library lib) {
        ontleendVan.add(lib.index);
        return lib.singupTime;
    }

    static void shuffleArray(int[] ar)
    {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }


    public void pickBooks(Library lib) {
        shuffleArray(lib.catalogus);
        ontleendPerLibrary[lib.index] = lib.catalogus ;
    }

    public double maakLibraryScore(Library lib) {
        double score;
        score = ((double) lib.amountBooks * lib.rate * lib.rate) / ((double) lib.singupTime / deadline) * sumOfBooksInLib(lib);  //TODO: sum van catalogussen bijvoegen
        return score;
    }

    private int sumOfBooksInLib(Library lib) {
        int punten = 0;
        for (int book: lib.catalogus) {
            punten += books[book];
        }
        return punten;
    }

    public int compareLibs(Library lib1, Library lib2) {
        double lib1score = maakLibraryScore(lib1);
        double lib2score = maakLibraryScore(lib2);
        return -Double.compare(lib1score, lib2score); // sorted groot naar klein
    }

    public ArrayList<OutputClass> maakOutputClasses() {
        ArrayList<OutputClass> gekozenLibs = new ArrayList<>();
        for (int lib: ontleendVan) {
            OutputClass opc = new OutputClass(lib, ontleendPerLibrary[lib]);
            gekozenLibs.add(opc);
        }
        return gekozenLibs;
    }

}
