package View.command;

import View.Console;

import java.time.LocalDateTime;

public class AddAuto extends Command {
    public AddAuto(Console console) {
        super(console, "Добавить авто в список обслуживания. ");
    }

    @Override
    public void execute() {
        getConsole().addAuto();
    }
}
