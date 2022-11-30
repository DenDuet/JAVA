
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library<T extends SnowMan> implements Iterable<SnowMan> {
    List<T> ds;

    private String name;

    public Library(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  %s created \n",this.name, (Animal.index));
    }

    public void add(T content) {
        ds.add(content);
    }

    @Override
    public Iterator<SnowMan> iterator() {
        
        return new Iterator<SnowMan>() {
            private int index=0; //SnowMan.index-1;

            @Override
            public boolean hasNext() {
                return index <= SnowMan.index-1;
            }

            @Override
            public T next() {
                return ds.get(index++);
            }
        };
    }
}
