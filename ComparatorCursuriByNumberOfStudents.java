import java.util.Comparator;

public class ComparatorCursuriByNumberOfStudents implements Comparator<Curs> {

    @Override
    public int compare(Curs o1, Curs o2) {
        Integer size1 = o1.studenti.size();
        Integer size2 = o2.studenti.size();
        return size1.compareTo(size2);
    }

}
