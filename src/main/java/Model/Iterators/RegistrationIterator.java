package Model.Iterators;

import java.util.Iterator;
import java.util.List;

public class RegistrationIterator implements Iterator<RegistrationIterator> {
    private List<RegistrationIterator> registration;
    private int index;

    public RegistrationIterator(List<RegistrationIterator> registration) {
        this.registration = registration;
    }

    @Override
    public boolean hasNext() {
        return index<registration.size();
    }

    @Override
    public RegistrationIterator next() {
        return registration.get(index++);
    }
}
