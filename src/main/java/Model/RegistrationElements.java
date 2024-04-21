package Model;

import Model.Auto.Auto;

import java.sql.Time;
import java.util.Date;

public interface RegistrationElements<E>{
    void addAuto(Auto auto, Date date, Time time);
}
