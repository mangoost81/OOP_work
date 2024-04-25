package View;

import Model.Auto.Auto;
import Model.Auto.Country;
import Presenter.Presenter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Console implements View {
    private Scanner scanner;
    private Presenter presenter;
    private MainMenu mainMenu;
    private boolean status;

    public Console() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        mainMenu = new MainMenu(this);
        status = true;

    }

    public void addAuto() {
        System.out.println("Введите гос.номер авто:");
        String regnum = scanner.nextLine();
        System.out.println("Введите имя владельца :");
        String name = scanner.nextLine().toLowerCase();
        System.out.println("введите номер телефона владельца в численном формате: ");
        long phone = scanner.nextLong();
        System.out.println("Введите страну производства авто: \n " +
                "USA,Asia,Europe,Russia");
        Country country = Country.valueOf(scanner.next().toUpperCase());
        System.out.println("Введите дату в формате гггг-мм-дд : ");
        String inputDate = scanner.next();
        System.out.println("Введите время в формате чч:мм : " );
        String inputTime = scanner.next();
        scanner.nextLine();
        String dateTime = inputDate + "T" + inputTime;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        LocalDateTime time = LocalDateTime.parse(dateTime, formatter);

        presenter.addAuto(time, new Auto(regnum, name, phone, country));

    }


    @Override
    public void Start() {
        System.out.println("Выберите действие: ");
        while (status) {
            System.out.println(mainMenu.getMenu());
            String strchoice = scanner.nextLine();
            int choice = Integer.parseInt(strchoice);
            mainMenu.execute(choice);

        }
    }

    @Override
    public void GiveAnswer(String text) {
        System.out.println(text);
    }

    public void finish() {
        status = false;
        System.out.println("До новых встреч. ");
    }

    public void addProcedure() {
        System.out.println("Введите дату в формате гггг-мм-дд : ");
        String inputDate = scanner.next();
        System.out.println("Введите время в формате чч:мм : " );
        String inputTime = scanner.next();
        scanner.nextLine();
        String dateTime = inputDate + "T" + inputTime;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        LocalDateTime time = LocalDateTime.parse(dateTime, formatter);

        System.out.println("Введите процедуру: ");
        String procedure = scanner.nextLine();
        presenter.addProcedure(time, procedure);
    }

    public void getRegistration() {
        presenter.getRegistration();
    }

    public void searchByCountryOfManufacturing(){
        System.out.println("Введите страну производства авто: ");
        Country country = Country.valueOf(scanner.nextLine().toUpperCase());
        presenter.searchByCountryOfManufactoring(country);
    }

    public void searchByDateTime(){
        System.out.println("Введите дату в формате гггг-мм-дд : ");
        String inputDate = scanner.next();
        System.out.println("Введите время в формате чч:мм : " );
        String inputTime = scanner.next();
        String dateTime = inputDate + "T" + inputTime;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        LocalDateTime time = LocalDateTime.parse(dateTime, formatter);
        presenter.searchByDateTime(time);
    }

    public void searchByOwner(){
        System.out.println("Введите имя владельца: ");
        String name = scanner.nextLine().toLowerCase();
        presenter.searchByOwner(name);
    }

    public void searchByPhonenumber(){
        System.out.println("Введите номер телефона :");
        long phone = scanner.nextLong();
        presenter.searchByPhoneNumber(phone);
    }
    public void saveToFile(){
        presenter.saveToFile();
    }

    public void loadFromFile(){
        presenter.loadFromFile();
    }


}
