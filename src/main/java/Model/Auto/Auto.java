package Model.Auto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Auto implements Comparable<Auto>, Serializable {
    private String regNumber;
    private String nameOfOwner;
    private long ownerPhoneNumber;
    private Country countryOfManufacture;
    private final List<String> procedure;

    public Auto(String regNumber, String nameOfOwner, long ownerPhoneNumber, Country countryOfManufacture) {
        this.regNumber = regNumber.toLowerCase();
        this.nameOfOwner = nameOfOwner.toLowerCase();
        this.ownerPhoneNumber = ownerPhoneNumber;
        this.countryOfManufacture = countryOfManufacture;
        procedure = new ArrayList<>();
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber.toLowerCase();
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner.toUpperCase();
    }

    public long getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }




    public void setOwnerPhoneNumber(long ownerPhoneNumber) {
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

    public Country getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public void setCountryOfManufacture(Country countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public void addProcedure(String procedure) {
        this.procedure.add(procedure);
    }


    public List getProcedure(){
        return procedure;
    }


    @Override
    public int compareTo(Auto o) {
        return regNumber.compareTo(o.regNumber);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Номер автомобиля='").append(regNumber).append('\'');
        sb.append(", Владелец='").append(nameOfOwner).append('\'');
        sb.append(", Телефон владельца=").append(ownerPhoneNumber);
        sb.append(", Страна производства авто=").append(countryOfManufacture);
        sb.append(", Что сделано=").append(procedure);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return ownerPhoneNumber == auto.ownerPhoneNumber && Objects.equals(regNumber, auto.regNumber) && Objects.equals(nameOfOwner, auto.nameOfOwner) && countryOfManufacture == auto.countryOfManufacture && Objects.equals(procedure, auto.procedure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, nameOfOwner, ownerPhoneNumber, countryOfManufacture, procedure);
    }
}
