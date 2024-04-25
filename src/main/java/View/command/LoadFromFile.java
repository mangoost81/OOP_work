package View.command;

import View.Console;

public class LoadFromFile extends Command{
    public LoadFromFile(Console console) {
        super(console, "Загрузить данные.");
    }

    @Override
    public void execute() {
        getConsole().loadFromFile();
    }
}
