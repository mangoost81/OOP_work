package Model.Service;

import Model.Auto.Auto;
import Model.Auto.Country;
import Model.RegistrationForService;

import java.time.LocalDateTime;


public class Service {
    private RegistrationForService registration;
    private SavebleAndReadeble saveload = new FileHandler();


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

        saveload.saveFile(registration,"C:\\Learning\\Java\\A" +
                "utoService\\AutoService\\src\\main\\java\\Model\\file.txt");
    }

    public void loadFromFile(){


        registration = (RegistrationForService) saveload.readFile("C:\\Learning\\Java\\AutoService\\AutoService\\src\\main" +
                "\\java\\Model\\file.txt");
        if(saveload!=null){
            System.out.println("Load complete");
        }
    }


}
