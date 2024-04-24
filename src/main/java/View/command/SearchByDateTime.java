package View.command;

import View.Console;

public class SearchByDateTime extends Command{

    public SearchByDateTime(Console console) {
        super(console, "Ввведите дату и время в формате: ГГГГ,ММ,ДД,чч,мм \n" +
                "Г -год. М-месяц. Д - день. ч - час. м - минуты");
    }

    @Override
    public void execute() {
        getConsole().searchByDateTime();
    }
}
