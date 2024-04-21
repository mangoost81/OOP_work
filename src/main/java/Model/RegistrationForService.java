package Model;

import Model.Auto.Auto;


import java.io.Serializable;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class RegistrationForService implements Serializable {
    private LocalDateTime date;
    private TreeMap<LocalDateTime, Auto> autoList;

    public RegistrationForService() {
        this.autoList = new TreeMap<>();
    }

    public void addAuto(LocalDateTime date, Auto auto) {
        autoList.putIfAbsent(date, auto);
    }

    public Set<LocalDateTime> Dates() {
        return autoList.keySet();
    }

    public void searchByDateAndTime(LocalDateTime date) {
        if(autoList.containsKey(date)){
            System.out.println(autoList.get(date));
        }
        else{
            System.out.println("Нет записей на данную дату. ");
        }

    }

    public void searchByOwner(String name){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<LocalDateTime,Auto> entry: autoList.entrySet()){
            if(entry.getValue().getNameOfOwner().equals(name.toLowerCase())){
                sb.append(entry);
            }
        }
        if(sb.isEmpty()){
            System.out.println("Владелец не найден. ");
        }
        else {
            System.out.println(sb);
        }
    }




    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (Map.Entry<LocalDateTime, Auto> entry : autoList.entrySet()) {
            sb.append(entry);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void toDo(LocalDateTime time,String procedure){
            if(autoList.containsKey(time)){
               autoList.get(time).addProcedure(procedure);
            }
            else {
                System.out.println("Неверно выбрано время посещения и обслуживания. ");
            }
    }

    public LocalDateTime getDate() {
        return date;
    }
}
