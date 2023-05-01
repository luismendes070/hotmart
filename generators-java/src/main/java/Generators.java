import java.util.Iterator;

public class Generators {

    public Generators() {

    } // end constructor

    public int add(){
        // Iterator implemented as anonymous class.  This uses generics but doesn't need to.
        for (int i: new Iterable<Integer>() {
            @Override
            public Iterator<Integer> iterator() {
                return new Iterator<Integer>() {
                    int counter = 1;

                    @Override
                    public boolean hasNext() {
                        return counter <= 100;
                    }

                    @Override
                    public Integer next() {
                        return counter++;
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        }) {
            System.out.println(i);
        }
    } // end add

} // end class
