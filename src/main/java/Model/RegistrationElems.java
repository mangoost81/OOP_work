package Model;

import java.time.LocalDate;

public interface RegistrationElems<E>{
    String getRegNumber();
    String getNameOfOwner();
    long getOwnerPhoneNumber();
    LocalDate getDate();
}
