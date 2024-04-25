package View.command;

import View.Console;

public class SaveToFile extends Command {

    public SaveToFile(Console console) {
        super(console, "Сохранить записи о регистрации. ");
    }

    @Override
    public void execute() {
        getConsole().saveToFile();
    }
}
