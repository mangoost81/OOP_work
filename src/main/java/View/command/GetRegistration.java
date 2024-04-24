package View.command;

import View.Console;

public class GetRegistration extends Command{
    public GetRegistration(Console console) {
        super(console, "Вывести все записи регистрации. ");
    }

    @Override
    public void execute() {
        getConsole().getRegistration();
    }
}
