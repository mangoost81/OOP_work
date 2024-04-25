package Model;

import Model.Auto.Auto;
import Model.Auto.Country;

import java.time.LocalDateTime;


public class Service {
    private RegistrationForService registration;

    public Service() {
        registration = new RegistrationForService();
    }


    public void addAuto(LocalDateTime time, Auto auto) {
        registration.addAuto(time, auto);
    }

    public void searchByDateTime(LocalDateTime time) {
        registration.searchByDateAndTime(time);
    }

    public void searchByOwner(String owner) {
        registration.searchByOwner(owner);
    }

    public void searchByPhoneNumber(long number) {
        registration.SearchByPhonenumber(number);
    }

    public void searchByCountryOfManufactoring(Country country) {
        registration.SearchByCountryOfManufacture(country);
    }

    public void addProcedure(LocalDateTime time, String procedure) {
        registration.toDo(time, procedure);
    }

    public void getRegistrationInfo() {
        System.out.println(registration);
    }

    public void saveToFile(){
        FileHandler save = new FileHandler();
        save.saveFile(registration,"C:\\Learning\\Java\\A" +
                "utoService\\AutoService\\src\\main\\java\\Model\\file.txt");
    }

    public void loadFromFile(){
        FileHandler load = new FileHandler();
        load.readFile("C:\\Learning\\Java\\AutoService\\AutoService\\src\\main\\java\\Model\\file.txt");
    }


}
