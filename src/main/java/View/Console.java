package View;

import Model.Auto.Auto;
import Model.Auto.Country;
import Presenter.Presenter;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Console implements View {
    public Scanner scanner;
    public Presenter presenter;
    public MainMenu mainMenu;
    public boolean status;

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
        String name = scanner.nextLine();
        System.out.println("введите номер телефона владельца: ");
        long phone = scanner.nextLong();
        System.out.println("Введите страну производства авто: ");
        String countryparse = scanner.nextLine();
        Country country = Country.valueOf(countryparse);
        System.out.println("Введите время на которое авто будет записано: ");
        LocalDateTime time = LocalDateTime.parse(scanner.nextLine());

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
        System.out.println("Введите дату и время :");
        LocalDateTime time = LocalDateTime.parse(scanner.nextLine());
        System.out.println("Введите процудуру: ");
        String procedure = scanner.nextLine();
        presenter.addProcedure(time, procedure);
    }

    public void getRegistration() {
        presenter.getRegistration();
    }

    public void searchByCountryOfManufacturing(){
        System.out.println("Введите страну производства авто: ");
        Country country = Country.valueOf(scanner.nextLine());
        presenter.searchByCountryOfManufactoring(country);
    }

    public void searchByDateTime(){
        System.out.println("введите дату: ");
        LocalDateTime time = LocalDateTime.parse(scanner.nextLine());
        presenter.searchByDateTime(time);
    }

    public void searchByOwner(){
        System.out.println("Введите имя владельца: ");
        String name = scanner.nextLine();
        presenter.searchByOwner(name);
    }

    public void searchByPhonenumber(){
        System.out.println("Введите номер телефона :");
        long phone = scanner.nextLong();
        presenter.searchByPhoneNumber(phone);
    }


}
