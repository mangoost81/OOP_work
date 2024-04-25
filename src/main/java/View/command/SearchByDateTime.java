package View.command;

import View.Console;

public class SearchByDateTime extends Command{

    public SearchByDateTime(Console console) {
        super(console, "Введите дату и время для поиска: ");
    }

    @Override
    public void execute() {
        getConsole().searchByDateTime();
    }
}
