package hashCode;

import hashCode.outputData.OutputClass;
import hashCode.outputData.OutputDataStructuur;

import java.util.*;

public class Ontlener2 {

    public EenDataStructuur data;
    public ArrayList<OutputClass>  output;
    public Set<Integer> set;


    public Ontlener2(EenDataStructuur input) {
        this.data = input;
        output = new ArrayList<>();
        set = new HashSet<>();
    }

    OutputDataStructuur ontleen(){
        ArrayList<Library> sorted = new ArrayList<>(data.libraries);
        sorted.sort((Library library1, Library library2) -> {
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
        for (Library library : sorted) {
            Arrays.sort(library.catalogus, new intComparator());
            set.addAll(Arrays.asList(library.catalogus));
            output.add(new OutputClass(data.libraries.indexOf(library), library.catalogus));
        }
        return new OutputDataStructuur(output);
    }
    public class intComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer emp1, Integer emp2) {
            int val1 = data.books[emp1];
            int val2 = data.books[emp2];
            return Integer.compare(val1,val2);
        }
    }

}
