package View;

import View.command.*;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private List<Command> commandList;

    public MainMenu(Console console) {
        commandList = new ArrayList<>();
        commandList.add(new AddAuto(console));
        commandList.add(new GetRegistration(console));
        commandList.add(new SearchByCountryOfManufactoring(console));
        commandList.add(new SearchByDateTime(console));
        commandList.add(new SearchByOwner(console));
        commandList.add(new SearchByPhoneNumber(console));


    }

    public String getMenu() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < commandList.size(); i++) {
            sb.append(i + 1);
            sb.append(" .");
            sb.append(commandList.get(i).getDescription());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void execute(int choice){
        Command command = commandList.get(choice-1);
        command.execute();
    }
}
