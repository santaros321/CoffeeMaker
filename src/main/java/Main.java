import Input.Commands;
import Input.Status;

import java.util.*;

public class Main {
    private final String systemPrompt = "CoffeeMaker> ";
    final Scanner scanner = new Scanner(System.in);
    Commands commandExit = Commands.EXIT;
    Commands commandHello = Commands.HELLO;
    Commands commandMakeCoffee = Commands.MAKE_COFFEE;
    Commands commandStatus = Commands.STATUS;

    List <Commands> commandsList = new ArrayList<>(List.of(
            commandMakeCoffee,
            commandExit,
            commandHello,
            commandStatus
    ));

    private static void main(Commands userCommand) {
        switch (userCommand){
            case HELLO -> System.out.println("HELLO");
            case STATUS -> {
                Status status = new Status();
                status.printStatus();
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.mainLoop();
    }

    void mainLoop(){
        String userCommand;
        do{
            userCommand = getUserCommand();
            userCommand = refactorCommand(userCommand);
            if(!checkUserCommand(userCommand)) System.out.println("WRONG COMMAND");
        }while(!userCommand.equals("EXIT"));
    }

    String getUserCommand(){
        System.out.print(systemPrompt);
        return scanner.nextLine();
    }

    String refactorCommand(String command){
        return command.replace(' ','_').toUpperCase(Locale.ROOT);
    }

    boolean checkUserCommand(String command){
        for(Commands commands:commandsList){
            if (command.equals(commands.toString(commands))) {
                main(commands);
                return true;
            }
        }
        return false;
    }
}
