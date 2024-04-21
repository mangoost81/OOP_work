package Model.Iterators;

import java.util.Iterator;
import java.util.List;

public class RegistrationIterator<E> implements Iterator<E> {
    private List<E> registration;
    private int index;

    public RegistrationIterator(List<E> registration) {
        this.registration = registration;
    }

    @Override
    public boolean hasNext() {
        return index<registration.size();
    }

    @Override
    public E next() {
        return registration.get(index++);
    }
}
