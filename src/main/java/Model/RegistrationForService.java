package Model;

import Model.Comporators.RegistrationComporatorForDate;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RegistrationForService<E> implements Serializable, Iterable<E> {
    private LocalDate date;
    private List<E> autoList;

    public RegistrationForService() {
        this.autoList = new ArrayList<>();
    }

    public void addAuto(E auto, E date) {
        if (!autoList.contains(auto)) {
            autoList.add(auto);
            autoList.add(date);
        }
    }

    public void SortByDate(){
        autoList.sort(new RegistrationComporatorForDate<>());
    }


    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (E unit:autoList){
            sb.append(unit);
            sb.append("\n");
        }
        return sb.toString();
    }

    public LocalDate getDate() {
        return date;
    }





}
