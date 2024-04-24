package View.command;

import View.Console;

public class SearchByPhoneNumber extends Command{
    public SearchByPhoneNumber(Console console) {
        super(console, "Введите номер телефона для поиска: ");
    }

    @Override
    public void execute() {
        getConsole().searchByPhonenumber();
    }
}
