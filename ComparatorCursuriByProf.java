import java.util.Comparator;

public class ComparatorCursuriByProf implements Comparator<Curs> {

    @Override
    public int compare(Curs o1, Curs o2) {
        int byLastName = o1.profu.nume.compareTo(o2.profu.nume);
        if (byLastName == 0)
            return o1.profu.prenume.compareTo(o2.profu.prenume);
        return byLastName;
    }

}
