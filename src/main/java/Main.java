import Model.Auto.Auto;
import Model.Auto.Country;
import Model.RegistrationForService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("g322bD122", "max",
                9876543454L, Country.Europe);

        Auto auto2 = new Auto("r223dd12", "Mary",
                9776564534L, Country.Asia);

        RegistrationForService registration = new RegistrationForService();
        registration.addAuto(auto1, LocalDate.of(2025,12,12));
        registration.addAuto(auto2,LocalDate.of(2024,12,23));
        registration.SortByDate();
        System.out.println(registration);


    }


}

