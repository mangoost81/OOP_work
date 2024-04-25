package View.command;

import View.Console;

public class AddProcedure extends Command{
    public AddProcedure(Console console) {
        super(console, "Добавьте работы, проведенные на авто.");
    }

    @Override
    public void execute() {
        getConsole().addProcedure();
    }
}
