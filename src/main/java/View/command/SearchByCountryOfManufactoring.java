package View.command;

import View.Console;

public class SearchByCountryOfManufactoring extends Command{
    public SearchByCountryOfManufactoring(Console console) {
        super(console, "Введите страну для поиска: \n" +
                "USA,Europe,Asia,Russia");
    }

    @Override
    public void execute() {
        getConsole().searchByCountryOfManufacturing();
    }
}
