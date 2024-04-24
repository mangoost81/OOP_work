package View.command;

import View.Console;

public abstract class Command {
    private Console console;
    private String description;

    public Command(Console console,String description){
        this.console = console;
        this.description = description;
    }

    Console getConsole() {
        return console;
    }

    public String getDescription() {
        return description;
    }

    public abstract void execute();
}
