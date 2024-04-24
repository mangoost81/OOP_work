package View.command;

import View.Console;

public class SearchByOwner extends Command{
    public SearchByOwner(Console console) {
        super(console, "Введите имя владельца для поиска");
    }

    @Override
    public void execute() {
        getConsole().searchByOwner();
    }
}
