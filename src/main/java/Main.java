import Model.Auto.Auto;
import Model.Auto.Country;
import Model.RegistrationForService;
import Model.Service;
import View.View;
import View.Console;


import java.time.LocalDateTime;
import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {
//        Auto auto1 = new Auto("g322bD122", "max",
//                9876543454L, Country.Europe);
//
//        Auto auto2 = new Auto("r223dd12", "Mary",
//                9776564534L, Country.Asia);
//
//        RegistrationForService registration = new RegistrationForService();
//        registration.addAuto(LocalDateTime.of(2024,12,12,12,30)
//                ,auto1);
//        registration.addAuto(LocalDateTime.of(2024,12,13,12,30),auto2);
//        registration.addAuto(LocalDateTime.of(2023, 12,23,9,00),
//                new Auto("e233rr11",
//                "Bob", 8933456654L,Country.Europe));
//
//        System.out.println(registration);
//        registration.searchByDateAndTime(LocalDateTime.of(2014,12,12,
//                12,30));
//
//        System.out.println(registration);
//        registration.searchByOwner("Bill");
        View view = new Console();
        Console console = new Console();
        view.Start();




    }


}

