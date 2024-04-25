package View.command;

import View.Console;

public class Finish extends Command{
    public Finish(Console console) {
        super(console,"Завершить работу.");
    }

    @Override
    public void execute() {
        getConsole().finish();
    }
}
