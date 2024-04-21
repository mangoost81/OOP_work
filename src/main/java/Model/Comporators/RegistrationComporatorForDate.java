package Model.Comporators;

import Model.RegistrationElems;


import java.util.Comparator;

public class RegistrationComporatorForDate<E extends RegistrationElems> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        if(o1.getDate().getYear() != o2.getDate().getYear()){
            return o1.getDate().getYear() - o2.getDate().getYear();
        }
        if(o1.getDate().getMonth() != o2.getDate().getMonth()){
            return o1.getDate().getMonthValue() - o2.getDate().getMonthValue();
        }
        return o1.getDate().getDayOfMonth() - o2.getDate().getDayOfMonth();

    }
}
