package Presenter;

import Model.Auto.Auto;
import Model.Auto.Country;
import Model.Service.Service;
import View.View;

import java.time.LocalDateTime;

public class Presenter {

    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addAuto(LocalDateTime time, Auto auto) {
        service.addAuto(time, auto);
        System.out.println("Добавлена машина на " + time);
    }

    public void addProcedure(LocalDateTime time, String procedure) {
        service.addProcedure(time, procedure);
    }

    public void getRegistration(){
        service.getRegistrationInfo();
    }

    public void searchByCountryOfManufactoring(Country country){
        service.searchByCountryOfManufactoring(country);
    }

    public void searchByDateTime(LocalDateTime time){
        service.searchByDateTime(time);
    }

    public void searchByOwner(String owner){
        service.searchByOwner(owner);
    }

    public void searchByPhoneNumber(long number){
        service.searchByPhoneNumber(number);
    }

    public void saveToFile(){
        service.saveToFile();
    }

    public void loadFromFile(){
        service.loadFromFile();
    }



}
