package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface RegistrationElems<E>{
    String getRegNumber();
    String getNameOfOwner();
    long getOwnerPhoneNumber();
    LocalDateTime getDate();
}
