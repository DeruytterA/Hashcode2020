package hashCode;

import hashCode.outputData.OutputClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Ontlener2 {

    public EenDataStructuur data;
    public ArrayList<OutputClass>  output;


    public Ontlener2(EenDataStructuur input) {
        this.data = input;
        output = new ArrayList<>();
    }

    void ontleen(){
        data.libraries.sort((Library library1, Library library2) -> {
            int sum1 = 0;
            int sum2 = 0;
            for (int book :
                    library1.catalogus) {
                sum1 += data.books[book];
            }
            for (int book :
                    library2.catalogus) {
                sum2 += data.books[book];
            }
            return Integer.compare(sum1, sum2);
        });
        for (int i = 0; i < data.libraries.size(); i++) {
            Integer[] sortedBooks = new Integer[data.libraries.get(i).catalogus.length];
            sortedBooks = (Integer[]) data.libraries.get(i).catalogus;
            Arrays.sort(sortedBooks, new intComparator());
            output.add(new OutputClass(i, data.books.length,sortedBooks));
        }
    }
    public class intComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer emp1, Integer emp2) {
            return Integer.compare(data.books[emp1], data.books[emp2]);
        }
    }

}
